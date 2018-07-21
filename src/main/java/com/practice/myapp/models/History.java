package com.practice.myapp.models;

import java.util.ArrayList;

public class History {
    private ArrayList<Weather> weather;
    private ArrayList<Pollution> pollution;

    public History() {
    }

    public History(ArrayList<Weather> weather, ArrayList<Pollution> pollution) {
        this.weather=weather;
        this.pollution=pollution;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather=weather;
    }

    public ArrayList<Pollution> getPollution() {
        return pollution;
    }

    public void setPollution(ArrayList<Pollution> pollution) {
        this.pollution=pollution;
    }
}
