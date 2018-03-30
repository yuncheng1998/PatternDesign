package com.fafnir.ObserverPattern.useJava;

import java.util.Observable;

import static java.lang.Math.abs;

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    private float realTemperature;  //实时数据
    private float realHumidity;
    private float realPressure;

    WeatherData() {
    }

    void measurementsChanged() {
        if (abs(realTemperature-this.temperature)>2) {
            setChanged();
            System.out.println("changed");
            this.temperature = realTemperature;
            this.humidity = realHumidity;
            this.pressure = realPressure;
        } else {
            System.out.println("too Little");
        }
        notifyObservers();
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.realTemperature = temperature;
        this.realHumidity = humidity;
        this.realPressure = pressure;
    }

    float getTemperature() {
        return temperature;
    }

    float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
