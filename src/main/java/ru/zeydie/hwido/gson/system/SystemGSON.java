package ru.zeydie.hwido.gson.system;

import oshi.PlatformEnum;
import ru.zeydie.hwido.hardwares.SystemHardware;

public final class SystemGSON {
    private final int platform;
    private final String family;
    private final String manufacturer;
    private final int bitness;
    private final String version;
    private final String codeName;
    private final String buildNumber;

    public SystemGSON(final SystemHardware systemHardware) {
        this.platform = SystemHardware.getPlatform().ordinal();
        this.family = systemHardware.getFamily();
        this.manufacturer = systemHardware.getManufacturer();
        this.bitness = systemHardware.getBitness().getBitness();
        this.version = systemHardware.getVersion();
        this.codeName = systemHardware.getCodeName();
        this.buildNumber = systemHardware.getBuildNumber();
    }

    public PlatformEnum getPlatform() {
        return PlatformEnum.getValue(this.platform);
    }

    public String getFamily() {
        return this.family;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public SystemHardware.Bitness getBitness() {
        return SystemHardware.Bitness.getBitness(this.bitness);
    }

    public String getVersion() {
        return this.version;
    }

    public String getCodeName() {
        return this.codeName;
    }

    public String getBuildNumber() {
        return this.buildNumber;
    }
}
