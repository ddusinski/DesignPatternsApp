package com.dusinski.designpattern;

import com.dusinski.designpattern.proxy.ProxyImage;

public class App {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("The small cat and dog");
        System.out.println(proxyImage.show());
    }
}
