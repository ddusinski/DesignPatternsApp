package com.dusinski.designpattern;

import com.dusinski.designpattern.observer.NewsChannel;
import com.dusinski.designpattern.observer.ObservableAgency;
import com.dusinski.designpattern.observer.ObserverChannel;


import java.math.BigDecimal;


public class App {
    public static void main(String[] args) {

//        double aa = 2.2;
//        double bb = 2.3;
//        BigDecimal a = new BigDecimal(aa+"");
//        BigDecimal b = new BigDecimal(bb+"");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.add(b).doubleValue());


        ObserverChannel cnn = new NewsChannel("CNN");
        ObserverChannel bbc = new NewsChannel("BBC");
        ObserverChannel tvp = new NewsChannel("TVP");

        ObservableAgency observableAgency = new ObservableAgency();

        observableAgency.addObserver(cnn);
        observableAgency.addObserver(bbc);
        observableAgency.addObserver(tvp);

        observableAgency.publicizeNews("The COVID pandemic is over");

        System.out.println("news of "+cnn.getChannelName()+ " are: "+cnn.getNews());
        System.out.println("news of "+bbc.getChannelName()+ " are: "+bbc.getNews());
        System.out.println("news of "+tvp.getChannelName()+ " are: "+tvp.getNews());

        observableAgency.removeObserver(tvp);
        observableAgency.publicizeNews("UK has left EU");

        System.out.println("news of "+cnn.getChannelName()+ " are: "+cnn.getNews());
        System.out.println("news of "+bbc.getChannelName()+ " are: "+bbc.getNews());
        System.out.println("news of "+tvp.getChannelName()+ " are: "+tvp.getNews());


    }
}
