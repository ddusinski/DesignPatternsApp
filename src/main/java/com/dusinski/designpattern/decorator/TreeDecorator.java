package com.dusinski.designpattern.decorator;

public abstract class TreeDecorator implements ChristmasTree {
    private final ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree=tree;
    }

    @Override
    public String decorate(){
        return this.tree.decorate();
    }
}
