package ru.zeydie.hwid.accessories;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.ComputerSystem;
import ru.zeydie.hwid.HWIDOshi;
import ru.zeydie.hwid.accessories.motherboard.BaseboardOshi;
import ru.zeydie.hwid.accessories.motherboard.FirmwareOshi;

@Getter
public final class MotherboardOshi {
    @NotNull
    private final ComputerSystem computerSystem =  HWIDOshi.getSystemInfo().getHardware().getComputerSystem();

    @NotNull
    private final String manufacture = this.computerSystem.getManufacturer();
    @NotNull
    private final String model = this.computerSystem.getModel();
    @NotNull
    private final String serialNumber = this.computerSystem.getSerialNumber();
    @NotNull
    private final String hardwareUUID = this.computerSystem.getHardwareUUID();
    @NotNull
    private final FirmwareOshi firmware = new FirmwareOshi();
    @NotNull
    private final BaseboardOshi baseboard = new BaseboardOshi();
}
