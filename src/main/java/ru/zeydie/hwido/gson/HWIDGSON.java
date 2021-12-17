package ru.zeydie.hwido.gson;

import ru.zeydie.hwido.HWIDOshi;
import ru.zeydie.hwido.gson.monitors.MonitorsGSON;
import ru.zeydie.hwido.gson.motherboard.MotherboardGSON;
import ru.zeydie.hwido.gson.processor.ProcessorGSON;
import ru.zeydie.hwido.gson.system.SystemGSON;

public final class HWIDGSON {
    private final MotherboardGSON motherboardHardware = HWIDOshi.motherboardHardware.toGson();
    private final ProcessorGSON processorHardware = HWIDOshi.processorHardware.toGson();
    private final SystemGSON systemHardware = HWIDOshi.systemHardware.toGson();
    private final MonitorsGSON monitorsHardware = HWIDOshi.monitorsHardware.toGson();

    public MotherboardGSON getMotherboard() {
        return this.motherboardHardware;
    }

    public ProcessorGSON getProcessor() {
        return this.processorHardware;
    }

    public SystemGSON getSystem() {
        return this.systemHardware;
    }

    public MonitorsGSON getMonitorsHardware() {
        return this.monitorsHardware;
    }
}
