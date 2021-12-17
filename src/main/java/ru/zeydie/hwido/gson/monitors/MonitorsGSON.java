package ru.zeydie.hwido.gson.monitors;

import ru.zeydie.hwido.hardwares.MonitorsHardware;

import java.util.List;

public final class MonitorsGSON {
    private final List<String> monitors;

    public MonitorsGSON(final MonitorsHardware monitorsHardware) {
        this.monitors = monitorsHardware.getDisplays();
    }

    public final List<String> getMonitors() {
        return this.monitors;
    }
}
