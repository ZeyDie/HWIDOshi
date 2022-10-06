package ru.zeydie.hwid.accessories;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.Display;
import oshi.util.EdidUtil;
import ru.zeydie.hwid.HWIDOshi;

import java.util.ArrayList;
import java.util.List;

@Getter
public final class MonitorOshi {
    @NotNull
    private final List<String> monitors = new ArrayList<>();

    public MonitorOshi() {
        final List<Display> displays = HWIDOshi.getSystemInfo().getHardware().getDisplays();

        if (displays.isEmpty()) {
            this.monitors.add("None detected.");
        } else {
            int i = 0;

            for (final Display display : displays) {
                final byte[] edid = display.getEdid();
                final byte[][] desc = EdidUtil.getDescriptors(edid);

                String name = "Display " + i;

                for (final byte[] b : desc)
                    if (EdidUtil.getDescriptorType(b) == 252)
                        name = EdidUtil.getDescriptorText(b);

                final int hSize = EdidUtil.getHcm(edid);
                final int vSize = EdidUtil.getVcm(edid);

                this.monitors.add(String.format("%s: %d x %d cm (%.1f x %.1f in)", name, hSize, vSize, hSize / 2.54D, vSize / 2.54D));
            }
        }
    }
}
