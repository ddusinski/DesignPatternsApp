package com.dusinski.designpattern.observer;

public class NewsChannel implements ObserverChannel,InternalObserverChannel {

    private final String channelName;
    private String news;

    public NewsChannel(String name) {
        this.channelName = name;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getNews() {
        return news;
    }

    @Override
    public void updateNews(String updatedNews) {
        this.news = updatedNews;
    }
}
