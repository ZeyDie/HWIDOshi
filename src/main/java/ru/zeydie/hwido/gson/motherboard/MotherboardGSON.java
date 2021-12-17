package ru.zeydie.hwido.gson.motherboard;

import ru.zeydie.hwido.hardwares.motherboard.MotherboardHardware;

public final class MotherboardGSON {
    private final String manufacture;
    private final String model;
    private final String serialNumber;
    private final String hardwareUUID;
    private final FirmwareGSON firmware;
    private final BaseboardGSON baseboard;

    public MotherboardGSON(final MotherboardHardware motherboardHardware) {
        this.manufacture = motherboardHardware.getManufacturer();
        this.model = motherboardHardware.getModel();
        this.serialNumber = motherboardHardware.getSerialNumber();
        this.hardwareUUID = motherboardHardware.getHardwareUUID();
        this.firmware = new FirmwareGSON(motherboardHardware.getFirmware());
        this.baseboard = new BaseboardGSON(motherboardHardware.getBaseboard());
    }

    public String getManufacturer() {
        return this.manufacture;
    }

    public String getModel() {
        return this.model;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getHardwareUUID() {
        return this.hardwareUUID;
    }

    public FirmwareGSON getFirmware() {
        return this.firmware;
    }

    public BaseboardGSON getBaseboard() {
        return this.baseboard;
    }
}
