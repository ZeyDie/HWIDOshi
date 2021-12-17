package ru.zeydie.hwido.hardwares;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import ru.zeydie.hwido.HWIDOshi;
import ru.zeydie.hwido.gson.processor.ProcessorGSON;

public final class ProcessorHardware {
    private final SystemInfo systemInfo = HWIDOshi.getSystemInfo();
    private final HardwareAbstractionLayer hardware = this.systemInfo.getHardware();
    private final CentralProcessor processor = this.hardware.getProcessor();
    private final CentralProcessor.ProcessorIdentifier processorIdentifier = this.processor.getProcessorIdentifier();

    public String getVendor() {
        return this.processorIdentifier.getVendor();
    }

    public String getName() {
        return this.processorIdentifier.getName();
    }

    public String getProcessorID() {
        return this.processorIdentifier.getProcessorID();
    }

    public String getIdentifier() {
        return this.processorIdentifier.getIdentifier();
    }

    public String getMicroarchitecture() {
        return this.processorIdentifier.getMicroarchitecture();
    }

    public ProcessorGSON toGson() {
        return new ProcessorGSON(this);
    }
}
