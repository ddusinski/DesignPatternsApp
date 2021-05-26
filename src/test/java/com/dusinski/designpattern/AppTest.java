package com.dusinski.designpattern;

import com.dusinski.designpattern.decorator.BubbleLights;
import com.dusinski.designpattern.decorator.ChristmasTree;
import com.dusinski.designpattern.decorator.PineTreeImpl;
import com.dusinski.designpattern.decorator.Tinsel;
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

    //  Facade pattern - one easy class (CarEngineFacade) encapsulate complex subsystem behnid a simple interface
    //  Decouples client implementation from the complex subsystem
    @Test
    public void testFacadePattern() {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        assertEquals("Cooler controller turned on with max temperature set on 90. Fuel Injector is switched on. Engine switcher is turning on. ",
                carEngineFacade.startEngine());
        assertEquals("Cooler controller is switched off. Fuel Injector is turned off. Engine switcher is turned off. ", carEngineFacade.stopEngine());
    }


    //  decorator pattern - can be used to add additional responsibilities to the object. ChristmasTree interface is used for basic class PineTreeImpl,
    //  abstract class TreeDecorator which is extended by BubbleLights and Tinsel decorator classes
    @Test
    public void testDecoratorPatter() {
        ChristmasTree tree1 = new Tinsel(new PineTreeImpl());
        assertEquals("Pine tree with Tinsel", tree1.decorate());

        ChristmasTree tree2 = new Tinsel(new BubbleLights(new PineTreeImpl()));
        assertEquals("Pine tree with Bubble Lights with Tinsel", tree2.decorate());
    }

}
