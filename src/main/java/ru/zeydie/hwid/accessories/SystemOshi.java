package ru.zeydie.hwid.accessories;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.SystemInfo;
import ru.zeydie.hwid.HWIDOshi;

@Getter
public final class SystemOshi {
    private final int platform = SystemInfo.getCurrentPlatform().ordinal();
    @NotNull
    private final String family = HWIDOshi.getSystemInfo().getOperatingSystem().getFamily();
    @NotNull
    private final String manufacturer = HWIDOshi.getSystemInfo().getOperatingSystem().getManufacturer();
    private final int bitness = HWIDOshi.getSystemInfo().getOperatingSystem().getBitness();
    @NotNull
    private final String version = HWIDOshi.getSystemInfo().getOperatingSystem().getVersionInfo().getVersion();
    @NotNull
    private final String codeName = HWIDOshi.getSystemInfo().getOperatingSystem().getVersionInfo().getCodeName();
    @NotNull
    private final String buildNumber = HWIDOshi.getSystemInfo().getOperatingSystem().getVersionInfo().getBuildNumber();
}
