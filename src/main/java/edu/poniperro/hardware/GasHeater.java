package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.types.RoomTemperature;

public class GasHeater implements Heater {
    @Override
    public void engage(Double temperature) {
        RoomTemperature.incrementTemperature(1);
    }

    @Override
    public void disengage(Double temperature) {
        RoomTemperature.incrementTemperature(-1);
    }
}
