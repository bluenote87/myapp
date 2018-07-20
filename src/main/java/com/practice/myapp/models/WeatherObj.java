package com.practice.myapp.models;

import java.util.HashMap;

public class WeatherObj {

    private HashMap<String, Weather> weather;
    private HashMap<String, Pollution> pollution;

    public WeatherObj() {
    }

    public WeatherObj(HashMap<String, Weather> weather, HashMap<String, Pollution> pollution) {
        this.weather = weather;
        this.pollution = pollution;
    }

    public HashMap<String, Weather> getWeather() {
        return weather;
    }

    public void setWeather(HashMap<String, Weather> weather) {
        this.weather = weather;
    }

    public HashMap<String, Pollution> getPollution() {
        return pollution;
    }

    public void setPollution(HashMap<String, Pollution> pollution) {
        this.pollution = pollution;
    }
}
