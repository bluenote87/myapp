package com.practice.myapp.models;

import java.util.HashMap;

public class Data {

    private String name;
    private String local_name;
    private String city;
    private String state;
    private String country;
    private HashMap<String, Location> location;

    public Data() { }

    public Data(String name, String local_name, String city, String state, String country, HashMap<String, Location> location) {
        this.name = name;
        this.local_name = local_name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HashMap<String, Location> getLocation() {
        return location;
    }

    public void setLocation(HashMap<String, Location> location) {
        this.location = location;
    }
}
