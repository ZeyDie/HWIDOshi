package ru.zeydie.hwid;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.SystemInfo;

public final class HWIDOshi {
    @Getter
    @NotNull
    private static final SystemInfo systemInfo = new SystemInfo();
}
