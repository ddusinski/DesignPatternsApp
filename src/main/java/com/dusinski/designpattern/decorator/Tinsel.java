package com.dusinski.designpattern.decorator;

public class Tinsel extends TreeDecorator{

    public Tinsel(ChristmasTree tree){
        super(tree);
    }

    public String decorate(){
        return super.decorate()+decorateWithTinsel();
    }

    private String decorateWithTinsel(){
        return " with Tinsel";
    }
}
