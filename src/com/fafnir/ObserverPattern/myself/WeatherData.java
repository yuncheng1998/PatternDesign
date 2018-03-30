package com.fafnir.ObserverPattern.myself;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
            System.out.println("remove");
            // public E remove(int index)  public boolean remove(Object o)
        }
    }

    @Override
    public void notifyObservers(ArrayList<Observer> observers) {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChanged(float temperature, float humidity, float pressure) {
        notifyObservers(observers);
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(temperature, humidity, pressure);
    }
}
