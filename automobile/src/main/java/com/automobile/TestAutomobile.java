package com.automobile;

public class TestAutomobile {
    public static void main(String[] args) {
        Automobile myCar = new Automobile("Toyota", "Prius", 35, 8);
        myCar.takeTrip(100);
        myCar.fillUp(2);
        double fuelLeft = myCar.reportFuel();
        System.out.println(fuelLeft);
    }
}