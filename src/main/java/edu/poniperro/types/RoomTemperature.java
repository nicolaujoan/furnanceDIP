package edu.poniperro.types;

public class RoomTemperature {
   private double temperature;

   public RoomTemperature(double temperature) {
       this.temperature = temperature;
   }

   public double getTemperature() {
       return this.temperature;
   }

   public void setTemperature(double temperature) {
       this.temperature = temperature;
   }

   public void incrementTemperature(double increment) {
       this.temperature += increment;
   }
}
