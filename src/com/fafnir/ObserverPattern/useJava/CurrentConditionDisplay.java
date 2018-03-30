package com.fafnir.ObserverPattern.useJava;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, com.fafnir.ObserverPattern.myself.Display {
    private float temperature;
    private float humidity;

    CurrentConditionDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity);
    }
}
