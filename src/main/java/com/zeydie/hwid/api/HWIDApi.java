package com.zeydie.hwid.api;

import com.zeydie.hwid.api.oshi.Monitor;
import com.zeydie.hwid.api.oshi.Motherboard;
import com.zeydie.hwid.api.oshi.Processor;
import com.zeydie.hwid.api.oshi.System;
import lombok.Data;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.SystemInfo;

@Data
public final class HWIDApi {
    @Getter
    @NotNull
    private static final SystemInfo systemInfo = new SystemInfo();

    @NotNull
    private final Monitor monitor = new Monitor();
    @NotNull
    private final Motherboard motherboard = new Motherboard();
    @NotNull
    private final Processor processor = new Processor();
    @NotNull
    private final System system = new System();
}
