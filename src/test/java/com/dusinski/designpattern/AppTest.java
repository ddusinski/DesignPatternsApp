package com.dusinski.designpattern;

import com.dusinski.designpattern.proxy.ProxyImage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    //    proxy pattern - ProxyImage class allows to access ComplexImage because of using the same Image interface.
    //    Additional security layer could be added to serve ComplexImage
    //    ProxyImage makes access to ComplexImage more simple
    @Test
    public void testProxyPattern() {
        ProxyImage proxyImage = new ProxyImage("The small cat and dog");
        assertEquals("The small cat and dog", proxyImage.show());
    }

}
