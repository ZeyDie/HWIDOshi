package ru.zeydie.hwido.gson.motherboard;


import ru.zeydie.hwido.hardwares.motherboard.BaseboardHardware;

public final class BaseboardGSON {
    private final String manufacturer;
    private final String model;
    private final String version;
    private final String serialNumber;

    public BaseboardGSON(final BaseboardHardware baseboardHardware) {
        this.manufacturer = baseboardHardware.getManufacturer();
        this.model = baseboardHardware.getModel();
        this.version = baseboardHardware.getVersion();
        this.serialNumber = baseboardHardware.getSerialNumber();
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getVersion() {
        return this.version;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
}
