package com.dusinski.designpattern;

import com.dusinski.designpattern.facade.CarEngineFacade;
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

    @Test
    public void testFacadePattern(){
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        assertEquals("Cooler controller turned on with max temperature set on 90. Fuel Injector is switched on. Engine switcher is turning on. ",
                carEngineFacade.startEngine());
        assertEquals("Cooler controller is switched off. Fuel Injector is turned off. Engine switcher is turned off. ",carEngineFacade.stopEngine());
    }

}
