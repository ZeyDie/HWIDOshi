package com.zeydie.hwid.api.oshi.processor;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.CentralProcessor;

@Data
public final class Physical {
    private final int physicalPackageNumber;
    private final int physicalProcessorNumber;
    private final int efficiency;
    @NotNull
    private final String idString;

    public Physical(final CentralProcessor.PhysicalProcessor physicalProcessor) {
        this.physicalPackageNumber = physicalProcessor.getPhysicalPackageNumber();
        this.physicalProcessorNumber = physicalProcessor.getPhysicalProcessorNumber();
        this.efficiency = physicalProcessor.getEfficiency();
        this.idString = physicalProcessor.getIdString();
    }
}
