package com.dusinski.designpattern.singletone;

public class SingletonObject {

    private final static SingletonObject singletonInstance = new SingletonObject();

    public int instanceCount=0;

    private SingletonObject(){
        instanceCount++;
    }

    public static SingletonObject getInstance(){
        return singletonInstance;
    }



}
