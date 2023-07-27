package io.nerd.observer;

// also call subscriber
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
