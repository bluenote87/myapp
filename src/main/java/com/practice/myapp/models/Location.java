package com.practice.myapp.models;

public class Location extends Data {

    private String type;
    private double latitude;
    private double longitude;
    private double [] coordinates = {latitude, longitude};

    public Location() {}

    public Location(String type, double latitude, double longitude, double[] coordinates) {
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }
}
