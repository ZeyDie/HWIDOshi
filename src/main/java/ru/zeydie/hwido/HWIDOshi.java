package ru.zeydie.hwido;

import oshi.SystemInfo;
import ru.zeydie.hwido.gson.HWIDGSON;
import ru.zeydie.hwido.hardwares.MonitorsHardware;
import ru.zeydie.hwido.hardwares.ProcessorHardware;
import ru.zeydie.hwido.hardwares.SystemHardware;
import ru.zeydie.hwido.hardwares.motherboard.MotherboardHardware;

public final class HWIDOshi {
    public static final MotherboardHardware motherboardHardware = new MotherboardHardware();
    public static final ProcessorHardware processorHardware = new ProcessorHardware();
    public static final SystemHardware systemHardware = new SystemHardware();
    public static final MonitorsHardware monitorsHardware = new MonitorsHardware();
    private static final SystemInfo systemInfo = new SystemInfo();
    private static final HWIDGSON hwidGson = new HWIDGSON();

    public static SystemInfo getSystemInfo() {
        return systemInfo;
    }

    public static HWIDGSON getHWIDGson() {
        return hwidGson;
    }
}
