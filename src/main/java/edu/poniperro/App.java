package edu.poniperro;

import edu.poniperro.hardware.GasHeater;
import edu.poniperro.hardware.Regulator;
import edu.poniperro.hardware.RemoteCommandSensor;
import edu.poniperro.interfaces.*;
import edu.poniperro.other.Jedi;
import edu.poniperro.types.RoomTemperature;

public class App {
    public static void main(String[] args) {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        Double temperature = RoomTemperature.getTemperature();
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulable regulator = new Regulator();

        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        Heater yoda = new Jedi();  // Heater no conoce el metodo speak
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        ((Jedi) yoda).speak();
    }
    
}
