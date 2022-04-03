package edu.poniperro.other;

import edu.poniperro.hardware.GasHeater;
import edu.poniperro.interfaces.Heater;
import edu.poniperro.types.RoomTemperature;

public class Jedi implements Heater {

    @Override
    public void engage(Double temperature){
        RoomTemperature.incrementTemperature(this.toucheLightSable());
    }

    @Override
    public void disengage(Double temperature){
        Heater heater = new GasHeater();
        this.forcePersuasion(heater, temperature);
    }

    private double toucheLightSable(){
        final double lightSableTemperature = 1400; // in ºC
        return lightSableTemperature;
    }

    private void forcePersuasion(Heater heater, Double temperature){
        RoomTemperature.incrementTemperature(-1400);
        heater.disengage(temperature);
    }

    public void speak(){
        System.out.println("\n"
                + "\t  __.-._   \n"
                + "\t  '-._\"7' \n"
                + "\t   /'.-c   \n"
                + "\t   |  /T   \n"
                + "\t  _)_/LI   \n"
                + "\nDo or do not. There is no try ");
    }
}
