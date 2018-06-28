package com.practice.myapp.models;

import javax.validation.constraints.NotNull;

public class Measurements {

    private String timestamp;
    private String unit;
    private String unitValue;
    @NotNull
    private String latitude;
    @NotNull
    private String longitude;
    @NotNull
    private String distance;

    public Measurements() {
    }

    public Measurements(String latitude, String longitude, String distance) {
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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
