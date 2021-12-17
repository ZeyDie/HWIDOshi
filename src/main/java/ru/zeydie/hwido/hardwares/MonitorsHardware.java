package ru.zeydie.hwido.hardwares;

import oshi.SystemInfo;
import oshi.hardware.Display;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.util.EdidUtil;
import ru.zeydie.hwido.HWIDOshi;
import ru.zeydie.hwido.gson.monitors.MonitorsGSON;

import java.util.ArrayList;
import java.util.List;

public final class MonitorsHardware {
    private final SystemInfo systemInfo = HWIDOshi.getSystemInfo();
    private final HardwareAbstractionLayer hardware = this.systemInfo.getHardware();
    private final List<Display> displayList = this.hardware.getDisplays();

    public List<String> getDisplays() {
        final List<String> displays = new ArrayList<>();

        if (this.displayList.isEmpty()) {
            displays.add("None detected.");
        } else {
            int i = 0;

            for (final Display display : this.displayList) {
                final byte[] edid = display.getEdid();
                final byte[][] desc = EdidUtil.getDescriptors(edid);

                String name = "Display " + i;

                for (final byte[] b : desc)
                    if (EdidUtil.getDescriptorType(b) == 252)
                        name = EdidUtil.getDescriptorText(b);

                final int hSize = EdidUtil.getHcm(edid);
                final int vSize = EdidUtil.getVcm(edid);

                displays.add(String.format("%s: %d x %d cm (%.1f x %.1f in)", name, hSize, vSize, hSize / 2.54D, vSize / 2.54D));
            }
        }

        return displays;
    }

    public MonitorsGSON toGson() {
        return new MonitorsGSON(this);
    }
}
