package edu.poniperro.interfaces;

import edu.poniperro.types.RoomTemperature;

public interface Regulable {
    void regulate(Thermometer thermometer, Heater heater, double minTemp,
                  double maxTemp, Double temperature);
}
