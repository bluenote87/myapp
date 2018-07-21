package com.practice.myapp.models;

import java.util.ArrayList;

public class Data {

    private String name;
    private String local_name;
    private String city;
    private String state;
    private String country;
    private Location location;
    private ArrayList<Forecasts> forecasts;
    private Current current;
    private History history;
    private Units units;

    public Data() {
    }

    public Data(String name, String local_name, String city, String state, String country, Location location, ArrayList<Forecasts> forecasts, Current current, History history, Units units) {
        this.name=name;
        this.local_name=local_name;
        this.city=city;
        this.state=state;
        this.country=country;
        this.location=location;
        this.forecasts=forecasts;
        this.current=current;
        this.history=history;
        this.units=units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name=local_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city=city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state=state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country=country;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location=location;
    }

    public ArrayList<Forecasts> getForecasts() {
        return forecasts;
    }

    public void setForecasts(ArrayList<Forecasts> forecasts) {
        this.forecasts=forecasts;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current=current;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history=history;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units=units;
    }
}
