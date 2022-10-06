package ru.zeydie.hwid.accessories.motherboard;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.Baseboard;
import ru.zeydie.hwid.HWIDOshi;

@Getter
public final class BaseboardOshi {
    @NotNull
    private final Baseboard baseboard = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getBaseboard();

    @NotNull
    private final String manufacturer = this.baseboard.getManufacturer();
    @NotNull
    private final String model = this.baseboard.getModel();
    @NotNull
    private final String version = this.baseboard.getModel();
    @NotNull
    private final String serialNumber = this.baseboard.getSerialNumber();
}
