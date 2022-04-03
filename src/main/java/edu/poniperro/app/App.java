package edu.poniperro.app;

import edu.poniperro.types.RoomTemperature;

public class App {
    public static void main(String[] args) {
        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = new RoomTemperature(15);
        /*Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator();

        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();*/
    }
    
}
