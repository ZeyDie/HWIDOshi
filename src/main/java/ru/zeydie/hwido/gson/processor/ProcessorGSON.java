package ru.zeydie.hwido.gson.processor;

import ru.zeydie.hwido.hardwares.ProcessorHardware;

public final class ProcessorGSON {
    private final String vendor;
    private final String name;
    private final String processorID;
    private final String identifier;
    private final String microarchitecture;

    public ProcessorGSON(final ProcessorHardware processorHardware) {
        this.vendor = processorHardware.getVendor();
        this.name = processorHardware.getName();
        this.processorID = processorHardware.getProcessorID();
        this.identifier = processorHardware.getIdentifier();
        this.microarchitecture = processorHardware.getMicroarchitecture();
    }

    public String getVendor() {
        return this.vendor;
    }

    public String getName() {
        return this.name;
    }

    public String getProcessorID() {
        return this.processorID;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getMicroarchitecture() {
        return this.microarchitecture;
    }
}
