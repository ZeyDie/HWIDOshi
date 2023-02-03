package com.zeydie.hwid.api.oshi.motherboard;

import com.zeydie.hwid.api.HWIDApi;
import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@Data
public final class Baseboard {
    @NotNull
    @ToString.Exclude
    private final oshi.hardware.Baseboard baseboard = HWIDApi.getSystemInfo().getHardware().getComputerSystem().getBaseboard();

    @NotNull
    private final String manufacturer = this.baseboard.getManufacturer();
    @NotNull
    private final String model = this.baseboard.getModel();
    @NotNull
    private final String version = this.baseboard.getModel();
    @NotNull
    private final String serialNumber = this.baseboard.getSerialNumber();
}
