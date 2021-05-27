package com.dusinski.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableAgency {
    private final List<ObserverChannel> observers = new ArrayList<>();

    public void addObserver(ObserverChannel newChannel) {
        this.observers.add(newChannel);
    }

    public void removeObserver(ObserverChannel channel) {
        this.observers.remove(channel);
    }

    public void publicizeNews(String news) {

        for (ObserverChannel channel : this.observers
        ) {
            ((InternalObserverChannel) channel).updateNews(news);
        }
    }

}
