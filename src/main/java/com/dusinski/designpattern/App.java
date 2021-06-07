package com.dusinski.designpattern;

import com.dusinski.designpattern.factory.Vehicle;
import com.dusinski.designpattern.factory.VehicleFactory;

public class App {
    public static void main(String[] args) {

//        double aa = 2.2;
//        double bb = 2.3;
//        BigDecimal a = new BigDecimal(aa+"");
//        BigDecimal b = new BigDecimal(bb+"");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.add(b).doubleValue());


        Vehicle tempCar = VehicleFactory.createVehicle(4);
        System.out.println(tempCar.getName());
        Vehicle tempBike = VehicleFactory.createVehicle(2);
        System.out.println(tempBike.getName());
        Vehicle tempBus = VehicleFactory.createVehicle(6);
        System.out.println(tempBus.getName());




    }
}
