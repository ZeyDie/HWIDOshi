package ru.zeydie.hwid.accessories.motherboard;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.Firmware;
import ru.zeydie.hwid.HWIDOshi;

@Getter
public final class FirmwareOshi {
    @NotNull
    private final Firmware firmware = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getFirmware();

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
