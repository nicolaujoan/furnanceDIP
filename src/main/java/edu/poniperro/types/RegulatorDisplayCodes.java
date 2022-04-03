package edu.poniperro.types;

public enum RegulatorDisplayCodes {
    HEATING("waiting..."), WAITING("heating..."), ON("turning on..."),
    OFF("turning off...");

    private String message;

    RegulatorDisplayCodes(String message) {
        this.message  = message;
    }
    private String getMessage() {
        return this.message;
    }
}
