package com.dusinski.designpattern;

import com.dusinski.designpattern.factory.Vehicle;
import com.dusinski.designpattern.factory.VehicleFactory;
import com.dusinski.designpattern.singletone.SingletonObject;

public class App {
    public static void main(String[] args) {

//        double aa = 2.2;
//        double bb = 2.3;
//        BigDecimal a = new BigDecimal(aa+"");
//        BigDecimal b = new BigDecimal(bb+"");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.add(b).doubleValue());

        SingletonObject sn1 = SingletonObject.getInstance();
        System.out.println(sn1.instanceCount);

        SingletonObject sn2 = SingletonObject.getInstance();
        System.out.println(sn2.instanceCount);




    }
}
