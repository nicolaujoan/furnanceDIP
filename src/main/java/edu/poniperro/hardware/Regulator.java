package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Regulable;
import edu.poniperro.interfaces.Thermometer;
import edu.poniperro.types.RoomTemperature;

public class Regulator implements Regulable {
    @Override
    public void regulate(Thermometer thermometer, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature) {

    }

    @Override
    public void message() {

    }
}
