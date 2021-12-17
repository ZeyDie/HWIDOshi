package ru.zeydie.hwido.hardwares.motherboard;

import oshi.SystemInfo;
import oshi.hardware.ComputerSystem;
import ru.zeydie.hwido.HWIDOshi;
import ru.zeydie.hwido.gson.motherboard.MotherboardGSON;

public final class MotherboardHardware {
    private final SystemInfo systemInfo = HWIDOshi.getSystemInfo();
    private final ComputerSystem computerSystem = systemInfo.getHardware().getComputerSystem();

    public String getManufacturer() {
        return this.computerSystem.getManufacturer();
    }

    public String getModel() {
        return this.computerSystem.getModel();
    }

    public String getSerialNumber() {
        return this.computerSystem.getSerialNumber();
    }

    public String getHardwareUUID() {
        return this.computerSystem.getHardwareUUID();
    }

    public FirmwareHardware getFirmware() {
        return new FirmwareHardware(this.computerSystem.getFirmware());
    }

    public BaseboardHardware getBaseboard() {
        return new BaseboardHardware(this.computerSystem.getBaseboard());
    }

    public MotherboardGSON toGson() {
        return new MotherboardGSON(this);
    }
}
