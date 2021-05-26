package com.dusinski.designpattern;

import com.dusinski.designpattern.strategy.*;

import java.math.BigDecimal;


public class App {
    public static void main(String[] args) {

//        ChristmasTree tree1 = new Tinsel(new PineTreeImpl());
//        System.out.println(tree1.decorate());
//        ChristmasTree tree2 = new Tinsel(new BubbleLights(new PineTreeImpl()));
//        System.out.println(tree2.decorate());


        BigDecimal a = new BigDecimal(12);
        BigDecimal b = new BigDecimal(36);
        MathOperation mathOperation = new Add();
        System.out.println(mathOperation.getClass().getSimpleName() + " " + mathOperation.calculateStrategy(a, b));
        mathOperation = new Subtract();
        System.out.println(mathOperation.getClass().getSimpleName() + " " +mathOperation.calculateStrategy(a, b));
        mathOperation = new Divide();
        System.out.println(mathOperation.getClass().getSimpleName() + " " +mathOperation.calculateStrategy(a, b));
        mathOperation = new Multiply();
        System.out.println(mathOperation.getClass().getSimpleName() + " " +mathOperation.calculateStrategy(a, b));


    }
}
