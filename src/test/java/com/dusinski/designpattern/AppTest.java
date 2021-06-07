package com.dusinski.designpattern;

import com.dusinski.designpattern.builder.BankAccount;
import com.dusinski.designpattern.decorator.BubbleLights;
import com.dusinski.designpattern.decorator.ChristmasTree;
import com.dusinski.designpattern.decorator.PineTreeImpl;
import com.dusinski.designpattern.decorator.Tinsel;
import com.dusinski.designpattern.facade.CarEngineFacade;
import com.dusinski.designpattern.factory.Vehicle;
import com.dusinski.designpattern.factory.VehicleFactory;
import com.dusinski.designpattern.observer.NewsChannel;
import com.dusinski.designpattern.observer.ObservableAgency;
import com.dusinski.designpattern.observer.ObserverChannel;
import com.dusinski.designpattern.proxy.ProxyImage;
import com.dusinski.designpattern.singletone.SingletonObject;
import com.dusinski.designpattern.strategy.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

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

    // strategy pattern - allows to change behaviour of the algorithm on run time. MathOperation interface allows us to change currently used class
    //  (Add, Divide, Multiply, Subtract) and use their calculate strategy method to perform math operation
    @Test
    public void testStrategyPattern(){
        BigDecimal a = new BigDecimal(12);
        BigDecimal b = new BigDecimal(36);
        MathOperation mathOperation = new Add();
        assertEquals("Add 48",mathOperation.getClass().getSimpleName() + " " + mathOperation.calculateStrategy(a, b));
        mathOperation = new Subtract();
        assertEquals("Subtract -24",mathOperation.getClass().getSimpleName() + " " +mathOperation.calculateStrategy(a, b));
        mathOperation = new Divide();
        assertEquals("Divide 0.33333333",mathOperation.getClass().getSimpleName() + " " +mathOperation.calculateStrategy(a, b));
        mathOperation = new Multiply();
        assertEquals("Multiply 432",mathOperation.getClass().getSimpleName() + " " +mathOperation.calculateStrategy(a, b));
    }

    //  Observable Agency class has a list of ObserverChannels interfaces which updates field of each NewsChannel which implements this interface.
    //  Inside ObserverChannel interface is included also package private  InternalObserverChannel Interface - it has only one method updateNews() which is only
    //  accessible from this package. Only ObservableAgency is allowed to update the news
    @Test
    public void testObserverChannel(){
        ObserverChannel cnn = new NewsChannel("CNN");
        ObserverChannel bbc = new NewsChannel("BBC");
        ObserverChannel tvp = new NewsChannel("TVP");

        ObservableAgency observableAgency = new ObservableAgency();

        observableAgency.addObserver(cnn);
        observableAgency.addObserver(bbc);
        observableAgency.addObserver(tvp);

        observableAgency.publicizeNews("The COVID pandemic is over");

        assertEquals("news of CNN are: The COVID pandemic is over","news of "+cnn.getChannelName()+ " are: "+cnn.getNews());
        assertEquals("news of BBC are: The COVID pandemic is over","news of "+bbc.getChannelName()+ " are: "+bbc.getNews());
        assertEquals("news of TVP are: The COVID pandemic is over","news of "+tvp.getChannelName()+ " are: "+tvp.getNews());

        observableAgency.removeObserver(tvp);
        observableAgency.publicizeNews("UK has left EU");

        assertEquals("news of CNN are: UK has left EU","news of "+cnn.getChannelName()+ " are: "+cnn.getNews());
        assertEquals("news of BBC are: UK has left EU","news of "+bbc.getChannelName()+ " are: "+bbc.getNews());
        assertEquals("news of TVP are: The COVID pandemic is over","news of "+tvp.getChannelName()+ " are: "+tvp.getNews());
    }

//    there is Vehicle interface which is implemented by three classes Bike, Bus, Car. This interface is used by VehicleFactory class to create new object.
//    The client is providing number of wheels which new object should have and VehicleFactory is creating this object on its own. The client does not need to
//    worry about it
    @Test
    public void testFactoryPattern(){
        Vehicle tempCar = VehicleFactory.createVehicle(4);
        Assert.assertEquals("I'm a car",tempCar.getName());
        Vehicle tempBike = VehicleFactory.createVehicle(2);
        Assert.assertEquals("I'm a bike",tempBike.getName());
        Vehicle tempBus = VehicleFactory.createVehicle(6);
        Assert.assertEquals("I'm a bus",tempBus.getName());
    }

//The class is singleton when there is only one instance created in Java VM. The class has private static field of this class which is instantiated
//    during start of the program. The class has private constructor which cannot be used by the client. Client can access the instance only
//    using getInstance() method
    @Test
    public void testSingletonPattern(){
        SingletonObject sn1 = SingletonObject.getInstance();
        Assert.assertEquals(1,sn1.instanceCount);
        SingletonObject sn2 = SingletonObject.getInstance();
        Assert.assertEquals(1,sn2.instanceCount);
    }


//    When one class BankAccount is complicated to create there is inner class BankAccountBuilder available with methods used for creation of outer class
    @Test
    public void testBuilderPattern(){
        BankAccount account1 = new BankAccount.BankAccountBuilder(12345).build();
        Assert.assertEquals("BankAccount{accountNumber=12345, branch='null', balance=0, owner='null'}",account1.toString());
        BankAccount account2 = new BankAccount
                .BankAccountBuilder(54321)
                .atBranch("Warsaw")
                .withOwner("Kowalski")
                .withBalance(120)
                .build();
        Assert.assertEquals("BankAccount{accountNumber=54321, branch='Warsaw', balance=120, owner='Kowalski'}",account2.toString());
    }

}
