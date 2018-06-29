package com.practice.myapp.models;

import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

public class Measurements {

    private String timestamp;
    private String unit;
    private String unitValue;
    @NotNull
    //@Size(min=-90, max=90, message="Input needs to be greater than -90° (South Pole) or less than 90° (North Pole)")
    private double latitude;
    @NotNull
    //@Size(min=-180, max=180, message="Input needs to be between -180° and 180°")
    private double longitude;
    @NotNull
    private int distance;

    public Measurements() {
    }

    public Measurements(double latitude, double longitude, int distance) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(String unitValue) {
        this.unitValue = unitValue;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
