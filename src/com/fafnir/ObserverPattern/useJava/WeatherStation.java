package com.fafnir.ObserverPattern.useJava;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(25, 60, 10600);
        weatherData.measurementsChanged();
        weatherData.setMeasurements(29, 45, 10050);
        weatherData.measurementsChanged();
        weatherData.setMeasurements(30, 45, 10050);
        weatherData.measurementsChanged();

    }
}
