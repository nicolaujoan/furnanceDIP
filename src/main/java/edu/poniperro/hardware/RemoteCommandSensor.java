package edu.poniperro.hardware;

import edu.poniperro.interfaces.Thermometer;
import edu.poniperro.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
    @Override
    public Double read(Double temperature) {
        return RoomTemperature.getTemperature();
    }
}
