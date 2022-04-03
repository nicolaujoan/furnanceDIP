package edu.poniperro.types;

public class RoomTemperature {
   private static Double TEMPERATURE = null;

   private RoomTemperature(){}

   public static Double getTemperature() {
       if (TEMPERATURE == null) {
           TEMPERATURE = 15.0;
       }
       return TEMPERATURE;
   }

   public static void setTemperature(double temperature) {
       TEMPERATURE = temperature;
   }

   public static void incrementTemperature(double increment) {
       TEMPERATURE += increment;
   }
}
