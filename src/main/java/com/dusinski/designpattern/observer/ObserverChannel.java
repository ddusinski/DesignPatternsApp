package com.dusinski.designpattern.observer;

public interface ObserverChannel {


    String getChannelName();

    String getNews();
}

interface InternalObserverChannel extends ObserverChannel{
    void updateNews(String news);
}
