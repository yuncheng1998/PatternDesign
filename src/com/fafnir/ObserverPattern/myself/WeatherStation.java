package com.fafnir.ObserverPattern.myself;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(18, 20, 10000);
        weatherData.setMeasurements(20, 30, 10200);
        weatherData.removeObserver(currentConditionDisplay);
        weatherData.setMeasurements(25, 46, 10060);
    }
}
