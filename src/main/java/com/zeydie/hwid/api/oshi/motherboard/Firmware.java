package com.zeydie.hwid.api.oshi.motherboard;

import com.zeydie.hwid.api.HWIDApi;
import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@Data
public final class Firmware {
    @NotNull
    @ToString.Exclude
    private final oshi.hardware.Firmware firmware = HWIDApi.getSystemInfo().getHardware().getComputerSystem().getFirmware();

    @NotNull
    private final String manufacturer = this.firmware.getManufacturer();
    @NotNull
    private final String name = this.firmware.getName();
    @NotNull
    private final String description = this.firmware.getDescription();
    @NotNull
    private final String version = this.firmware.getVersion();
    @NotNull
    private final String releaseDate = this.firmware.getReleaseDate();
}
