package ru.zeydie.hwido.hardwares.motherboard;

import oshi.hardware.Baseboard;

public final class BaseboardHardware {
    private final Baseboard baseboard;

    public BaseboardHardware(final Baseboard baseboard) {
        this.baseboard = baseboard;
    }

    public String getManufacturer() {
        return this.baseboard.getManufacturer();
    }

    public String getModel() {
        return this.baseboard.getModel();
    }

    public String getVersion() {
        return this.baseboard.getVersion();
    }

    public String getSerialNumber() {
        return this.baseboard.getSerialNumber();
    }
}
