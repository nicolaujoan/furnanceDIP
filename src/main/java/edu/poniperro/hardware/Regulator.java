package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Regulable;
import edu.poniperro.interfaces.Thermometer;
import edu.poniperro.types.RegulatorDisplayCodes;
import edu.poniperro.types.RoomTemperature;

public class Regulator implements Regulable {

    @Override
    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, Double temperature) {
        RegulatorDisplayCodes code;
        while (t.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code);
        }
        while (t.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message(code);
        }
    }

    private void message(RegulatorDisplayCodes code) {
        switch (code) {
            case HEATING:
                System.out.println("Calentando => temperatura " + RoomTemperature.getTemperature());
                break;
            case WAITING:
                System.out.println("Enfriando => temperatura " + RoomTemperature.getTemperature());
                break;
            default:
                System.out.println("Algo raro sucede...");
                break;
        }
    }
}
