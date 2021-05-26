package com.dusinski.designpattern;

import com.dusinski.designpattern.facade.*;


public class App {
    public static void main(String[] args) {
//        ProxyImage proxyImage = new ProxyImage("The small cat and dog");
//        System.out.println(proxyImage.show());

        CarEngineFacade carEngineFacade = new CarEngineFacade();
        System.out.println(carEngineFacade.startEngine());
        System.out.println(carEngineFacade.stopEngine());



    }
}
