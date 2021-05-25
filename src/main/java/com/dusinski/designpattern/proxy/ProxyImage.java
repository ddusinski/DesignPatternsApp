package com.dusinski.designpattern.proxy;

public class ProxyImage implements Image {
    private final String description;
    private ComplexImage complexImage;

    public ProxyImage(String desc) {
        this.description = desc;
    }

    @Override
    public String show() {
        if (this.complexImage == null) {
            this.complexImage = new ComplexImage(this.description);
        }
        return this.complexImage.show();

    }
}
