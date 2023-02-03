package com.zeydie.hwid.api.oshi;

import com.zeydie.hwid.api.HWIDApi;
import com.zeydie.hwid.api.oshi.processor.Logical;
import com.zeydie.hwid.api.oshi.processor.Physical;
import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.CentralProcessor;

import java.util.ArrayList;
import java.util.List;

@Data
public final class Processor {
    @NotNull
    @ToString.Exclude
    private final CentralProcessor centralProcessor = HWIDApi.getSystemInfo().getHardware().getProcessor();
    @NotNull
    @ToString.Exclude
    private final CentralProcessor.ProcessorIdentifier processorIdentifier = this.centralProcessor.getProcessorIdentifier();

    @NotNull
    private final String vendor = this.processorIdentifier.getVendor();
    @NotNull
    private final String name = this.processorIdentifier.getName();
    @NotNull
    private final String processorID = this.processorIdentifier.getProcessorID();
    @NotNull
    private final String identifier = this.processorIdentifier.getIdentifier();
    private final boolean cpu64bit = this.processorIdentifier.isCpu64bit();
    private final long cpuVendorFreq = this.processorIdentifier.getVendorFreq();
    @NotNull
    private final List<Logical> logicalProcessors = new ArrayList<>();
    private final List<Physical> physicalProcessors = new ArrayList<>();
    @NotNull
    private final String microarchitecture = this.processorIdentifier.getMicroarchitecture();
}
