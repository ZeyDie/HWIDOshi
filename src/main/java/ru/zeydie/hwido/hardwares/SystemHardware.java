package ru.zeydie.hwido.hardwares;

import oshi.PlatformEnum;
import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;
import ru.zeydie.hwido.HWIDOshi;
import ru.zeydie.hwido.gson.system.SystemGSON;

public final class SystemHardware {
    private final SystemInfo systemInfo = HWIDOshi.getSystemInfo();
    private final OperatingSystem operatingSystem = this.systemInfo.getOperatingSystem();
    private final OperatingSystem.OSVersionInfo versionInfo = this.operatingSystem.getVersionInfo();

    public static PlatformEnum getPlatform() {
        return SystemInfo.getCurrentPlatform();
    }

    public String getFamily() {
        return this.operatingSystem.getFamily();
    }

    public String getManufacturer() {
        return this.operatingSystem.getManufacturer();
    }

    public Bitness getBitness() {
        return Bitness.getBitness(this.operatingSystem.getBitness());
    }

    public String getVersion() {
        return this.versionInfo.getVersion();
    }

    public String getCodeName() {
        return this.versionInfo.getCodeName();
    }

    public String getBuildNumber() {
        return this.versionInfo.getBuildNumber();
    }

    public SystemGSON toGson() {
        return new SystemGSON(this);
    }

    public enum Bitness {
        ARCH_32(32), ARCH_64(64);

        private final int arch;

        Bitness(final int arch) {
            this.arch = arch;
        }

        public static Bitness getBitness(final int arch) {
            for (final Bitness bitness : values())
                if (bitness.getBitness() == arch)
                    return bitness;

            return null;
        }

        public final int getBitness() {
            return this.arch;
        }
    }
}
