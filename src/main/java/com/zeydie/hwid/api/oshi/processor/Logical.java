package com.zeydie.hwid.api.oshi.processor;

import lombok.Data;
import oshi.hardware.CentralProcessor;

@Data
public final class Logical {
    private final int processorNumber;
    private final int physicalProcessorNumber;
    private final int physicalPackageNumber;
    private final int numaNode;
    private final int processorGroup;

    public Logical(final CentralProcessor.LogicalProcessor logicalProcessor) {
        this.processorNumber = logicalProcessor.getProcessorNumber();
        this.physicalProcessorNumber = logicalProcessor.getPhysicalProcessorNumber();
        this.physicalPackageNumber = logicalProcessor.getPhysicalPackageNumber();
        this.numaNode = logicalProcessor.getNumaNode();
        this.processorGroup = logicalProcessor.getProcessorGroup();
    }
}
