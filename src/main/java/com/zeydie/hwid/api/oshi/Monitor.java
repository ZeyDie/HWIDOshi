package com.zeydie.hwid.api.oshi;

import com.zeydie.hwid.api.HWIDApi;
import lombok.Data;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.Display;
import oshi.util.EdidUtil;

import java.util.ArrayList;
import java.util.List;

@Data
public final class Monitor {
    @NotNull
    private final List<String> monitors = new ArrayList<>();

    public Monitor() {
        final var displays = HWIDApi.getSystemInfo().getHardware().getDisplays();

        if (displays.isEmpty()) {
            this.monitors.add("None detected.");
        } else {
            var i = 0;

            for (final Display display : displays) {
                final var edid = display.getEdid();
                final var desc = EdidUtil.getDescriptors(edid);

                var name = "Display " + i;

                for (final var b : desc)
                    if (EdidUtil.getDescriptorType(b) == 252)
                        name = EdidUtil.getDescriptorText(b);

                final var hSize = EdidUtil.getHcm(edid);
                final var vSize = EdidUtil.getVcm(edid);

                this.monitors.add(String.format("%s: %d x %d cm (%.1f x %.1f in)", name, hSize, vSize, hSize / 2.54D, vSize / 2.54D));
            }
        }
    }
}
