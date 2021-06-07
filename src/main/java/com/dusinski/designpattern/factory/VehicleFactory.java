package com.dusinski.designpattern.factory;

public class VehicleFactory {

    public static Vehicle createVehicle(int wheelsCount) {
        switch (wheelsCount) {
            case 2:
                return new Bike();
            case 4:
                return new Car();
            case 6:
                return new Bus();
            default:
                return null;
        }
    }
}