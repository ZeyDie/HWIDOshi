package ru.zeydie.hwid.accessories;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.CentralProcessor;
import ru.zeydie.hwid.HWIDOshi;
import ru.zeydie.hwid.accessories.processor.Logical;
import ru.zeydie.hwid.accessories.processor.Physical;

import java.util.ArrayList;
import java.util.List;

@Getter
public final class ProcessorOshi {
    @NotNull
    private final CentralProcessor centralProcessor = HWIDOshi.getSystemInfo().getHardware().getProcessor();
    @NotNull
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

    public ProcessorOshi() {
        for (final CentralProcessor.LogicalProcessor logicalProcessor : this.centralProcessor.getLogicalProcessors())
            this.logicalProcessors.add(new Logical(logicalProcessor));

        for (final CentralProcessor.PhysicalProcessor physicalProcessor : this.centralProcessor.getPhysicalProcessors())
            this.physicalProcessors.add(new Physical(physicalProcessor));
    }
}
