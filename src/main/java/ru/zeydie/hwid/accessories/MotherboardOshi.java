package ru.zeydie.hwid.accessories;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import ru.zeydie.hwid.HWIDOshi;
import ru.zeydie.hwid.accessories.motherboard.BaseboardOshi;
import ru.zeydie.hwid.accessories.motherboard.FirmwareOshi;

@Getter
public final class MotherboardOshi {
    @NotNull
    private final String manufacture = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getManufacturer();
    @NotNull
    private final String model = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getModel();
    @NotNull
    private final String serialNumber = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getSerialNumber();
    @NotNull
    private final String hardwareUUID = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getHardwareUUID();
    @NotNull
    private final FirmwareOshi firmware = new FirmwareOshi();
    @NotNull
    private final BaseboardOshi baseboard = new BaseboardOshi();
}
