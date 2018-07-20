package com.practice.myapp.models;

import java.util.ArrayList;
import java.util.HashMap;

public class AirQuality {
    private String status;
    private HashMap<String, Data> data;
    private HashMap<String, Forecasts> forecasts;
    private ArrayList<HashMap<String, WeatherObj>> currentr;
    private ArrayList<HashMap<String, WeatherObj>> history;
    private HashMap<String, Units> units;

    public AirQuality() { }

    public AirQuality(String status, HashMap<String, Data> data, HashMap<String, Forecasts> forecasts, ArrayList<HashMap<String, WeatherObj>> currentr, ArrayList<HashMap<String, WeatherObj>> history, HashMap<String, Units> units) {
        this.status = status;
        this.data = data;
        this.forecasts = forecasts;
        this.currentr = currentr;
        this.history = history;
        this.units = units;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HashMap<String, Data> getData() {
        return data;
    }

    public void setData(HashMap<String, Data> data) {
        this.data = data;
    }

    public HashMap<String, Forecasts> getForecasts() {
        return forecasts;
    }

    public void setForecasts(HashMap<String, Forecasts> forecasts) {
        this.forecasts = forecasts;
    }

    public ArrayList<HashMap<String, WeatherObj>> getCurrentr() {
        return currentr;
    }

    public void setCurrentr(ArrayList<HashMap<String, WeatherObj>> currentr) {
        this.currentr = currentr;
    }

    public ArrayList<HashMap<String, WeatherObj>> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<HashMap<String, WeatherObj>> history) {
        this.history = history;
    }

    public HashMap<String, Units> getUnits() {
        return units;
    }

    public void setUnits(HashMap<String, Units> units) {
        this.units = units;
    }
}
