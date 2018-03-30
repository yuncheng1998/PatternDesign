package com.fafnir.ObserverPattern.myself;

public class CurrentConditionDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
