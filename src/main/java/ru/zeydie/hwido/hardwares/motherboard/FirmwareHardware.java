package ru.zeydie.hwido.hardwares.motherboard;

import oshi.hardware.Firmware;

public final class FirmwareHardware {
    private final Firmware firmware;

    public FirmwareHardware(final Firmware firmware) {
        this.firmware = firmware;
    }

    public String getManufacturer() {
        return this.firmware.getManufacturer();
    }

    public String getName() {
        return this.firmware.getName();
    }

    public String getDescription() {
        return this.firmware.getDescription();
    }

    public String getVersion() {
        return this.firmware.getVersion();
    }

    public String getReleaseDate() {
        return this.firmware.getReleaseDate();
    }
}
