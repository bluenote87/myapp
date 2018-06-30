package com.practice.myapp.models;

public class Measurements {

    private String captured_at;
    private String unit;
    private double value;
    private double latitude;
    private double longitude;
    private int distance;

    public Measurements() {
    }

    public Measurements(String captured_at, String unit, double value, double latitude, double longitude) {
        this.captured_at=captured_at;
        this.unit=unit;
        this.value=value;
        this.latitude=latitude;
        this.longitude=longitude;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value=value;
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

    public String getCaptured_at() {
        return captured_at;
    }

    public void setCaptured_at(String captured_at) {
        this.captured_at=captured_at;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance=distance;
    }
}
