package ru.zeydie.hwid.accessories.motherboard;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import ru.zeydie.hwid.HWIDOshi;

@Getter
public final class FirmwareOshi {
    @NotNull
    private final String manufacturer = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getFirmware().getManufacturer();
    @NotNull
    private final String name = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getFirmware().getName();
    @NotNull
    private final String description = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getFirmware().getDescription();
    @NotNull
    private final String version = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getFirmware().getVersion();
    @NotNull
    private final String releaseDate = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getFirmware().getReleaseDate();
}
