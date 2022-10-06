package ru.zeydie.hwid.accessories;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;
import ru.zeydie.hwid.HWIDOshi;

@Getter
public final class SystemOshi {
    @NotNull
    private final OperatingSystem operatingSystem = HWIDOshi.getSystemInfo().getOperatingSystem();
    @NotNull
    private final OperatingSystem.OSVersionInfo osVersionInfo = this.operatingSystem.getVersionInfo();

    private final int platform = SystemInfo.getCurrentPlatform().ordinal();
    @NotNull
    private final String family = this.operatingSystem.getFamily();
    @NotNull
    private final String manufacturer = this.operatingSystem.getManufacturer();
    private final int bitness = this.operatingSystem.getBitness();

    @NotNull
    private final String version = this.osVersionInfo.getVersion();
    @NotNull
    private final String codeName = this.osVersionInfo.getCodeName();
    @NotNull
    private final String buildNumber = this.osVersionInfo.getBuildNumber();
}
