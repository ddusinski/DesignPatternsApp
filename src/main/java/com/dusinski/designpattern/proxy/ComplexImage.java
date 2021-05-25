package com.dusinski.designpattern.proxy;

class ComplexImage implements Image{
    private final String description;

    //class constructor is protected so access only inside the package proxy
    protected ComplexImage(String desc){
        this.description=desc;
    }

    @Override
    public String show() {
       return this.description;
    }
}
