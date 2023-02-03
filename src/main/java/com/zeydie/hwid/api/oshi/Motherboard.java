package com.zeydie.hwid.api.oshi;

import com.zeydie.hwid.api.HWIDApi;
import com.zeydie.hwid.api.oshi.motherboard.Baseboard;
import com.zeydie.hwid.api.oshi.motherboard.Firmware;
import lombok.Data;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import oshi.hardware.ComputerSystem;

@Data
public final class Motherboard {
    @NotNull
    @ToString.Exclude
    private final ComputerSystem computerSystem = HWIDApi.getSystemInfo().getHardware().getComputerSystem();

    @NotNull
    private final String manufacture = this.computerSystem.getManufacturer();
    @NotNull
    private final String model = this.computerSystem.getModel();
    @NotNull
    private final String serialNumber = this.computerSystem.getSerialNumber();
    @NotNull
    private final String hardwareUUID = this.computerSystem.getHardwareUUID();
    @NotNull
    private final Firmware firmware = new Firmware();
    @NotNull
    private final Baseboard baseboard = new Baseboard();
}
