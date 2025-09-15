package com.automobile;

public class Automobile {
    private final String make;
    private final String model;
    private final double mileage;
    private final double fueltank;
    private double fuel;

    public Automobile(String make, String model, double mileage, double fueltank) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.fueltank = fueltank;
        this.fuel = fueltank;
    }

    public double takeTrip(double distance) {
        double fuelNeeded = distance / mileage;
        if (fuelNeeded <= fuel) {
            fuel -= fuelNeeded;
            return fuel;
        } else {
            return -1;
        }
    }

    public double fillUp(int gallons) {
        double fuelAdded = Math.min(fueltank - fuel, gallons);
        fuel += fuelAdded;
        return fuelAdded;
    }

    public double reportFuel() {
        return fuel;
    }
}