package ru.zeydie.hwido.gson.motherboard;

import ru.zeydie.hwido.hardwares.motherboard.FirmwareHardware;

public final class FirmwareGSON {
    private final String manufacturer;
    private final String name;
    private final String description;
    private final String version;
    private final String releaseDate;

    public FirmwareGSON(final FirmwareHardware firmwareHardware) {
        this.manufacturer = firmwareHardware.getManufacturer();
        this.name = firmwareHardware.getName();
        this.description = firmwareHardware.getDescription();
        this.version = firmwareHardware.getVersion();
        this.releaseDate = firmwareHardware.getReleaseDate();
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getVersion() {
        return this.version;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }
}
