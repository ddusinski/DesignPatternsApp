package com.dusinski.designpattern;

import com.dusinski.designpattern.decorator.*;


public class App {
    public static void main(String[] args) {
//        ProxyImage proxyImage = new ProxyImage("The small cat and dog");
//        System.out.println(proxyImage.show());

//        CarEngineFacade carEngineFacade = new CarEngineFacade();
//        System.out.println(carEngineFacade.startEngine());
//        System.out.println(carEngineFacade.stopEngine());


        ChristmasTree tree1 = new Tinsel(new PineTreeImpl());
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new Tinsel(new BubbleLights(new PineTreeImpl()));
        System.out.println(tree2.decorate());

    }
}
