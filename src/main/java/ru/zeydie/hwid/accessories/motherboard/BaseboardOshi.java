package ru.zeydie.hwid.accessories.motherboard;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import ru.zeydie.hwid.HWIDOshi;

@Getter
public final class BaseboardOshi {
    @NotNull
    private final String manufacturer = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getBaseboard().getManufacturer();
    @NotNull
    private final String model = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getBaseboard().getModel();
    @NotNull
    private final String version = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getBaseboard().getModel();
    @NotNull
    private final String serialNumber = HWIDOshi.getSystemInfo().getHardware().getComputerSystem().getBaseboard().getSerialNumber();
}
