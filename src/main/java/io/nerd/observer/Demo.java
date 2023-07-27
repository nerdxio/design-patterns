package io.nerd.observer;

public class Demo {
    public static void main(String[] args) {

        var weatherData = new WeatherData();
        // set the currentConditionsDisplay as a subscriber "observer" of weatherData
        var currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }

}
