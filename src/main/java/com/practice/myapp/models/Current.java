package com.practice.myapp.models;

public class Current {
    private Weather weather;
    private Pollution pollution;

    public Current() {
    }

    public Current(Weather weather, Pollution pollution) {
        this.weather=weather;
        this.pollution=pollution;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather=weather;
    }

    public Pollution getPollution() {
        return pollution;
    }

    public void setPollution(Pollution pollution) {
        this.pollution=pollution;
    }
}
