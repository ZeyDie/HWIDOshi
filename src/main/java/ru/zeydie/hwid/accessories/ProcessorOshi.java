package ru.zeydie.hwid.accessories;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import ru.zeydie.hwid.HWIDOshi;

@Getter
public final class ProcessorOshi {
    @NotNull
    private final String vendor = HWIDOshi.getSystemInfo().getHardware().getProcessor().getProcessorIdentifier().getVendor();
    @NotNull
    private final String name = HWIDOshi.getSystemInfo().getHardware().getProcessor().getProcessorIdentifier().getName();
    @NotNull
    private final String processorID = HWIDOshi.getSystemInfo().getHardware().getProcessor().getProcessorIdentifier().getProcessorID();
    @NotNull
    private final String identifier = HWIDOshi.getSystemInfo().getHardware().getProcessor().getProcessorIdentifier().getIdentifier();
    @NotNull
    private final String microarchitecture = HWIDOshi.getSystemInfo().getHardware().getProcessor().getProcessorIdentifier().getMicroarchitecture();
}
