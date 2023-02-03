package com.zeydie.hwid.api.oshi;

import com.zeydie.hwid.api.HWIDApi;
import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

@Data
public final class System {
    @NotNull
    @ToString.Exclude
    private final OperatingSystem operatingSystem = HWIDApi.getSystemInfo().getOperatingSystem();
    @NotNull
    @ToString.Exclude
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
