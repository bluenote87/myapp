package com.practice.myapp.models;

import com.google.gson.annotations.Expose;

public class Measurements {

    @Expose
    private int id;
    @Expose
    private int user_id;
    @Expose
    private double value;
    @Expose
    private String unit;
    @Expose
    private String location_name;
    @Expose
    private int device_id;
    @Expose
    private int original_id;
    @Expose
    private int measurement_import_id;
    @Expose
    private String captured_at;
    @Expose
    private double height;
    @Expose
    private int devicetype_id;
    @Expose
    private int sensor_id;
    @Expose
    private int station_id;
    @Expose
    private int channel_id;
    @Expose
    private double latitude;
    @Expose
    private double longitude;
    private int distance;

    public Measurements() {
    }

    public Measurements(int id, int user_id, double value, String unit, String location_name, int device_id, int original_id, int measurement_import_id, String captured_at, double height, int devicetype_id, int sensor_id, int station_id, int channel_id, double latitude, double longitude) {
        this.id = id;
        this.user_id = user_id;
        this.value = value;
        this.unit = unit;
        this.location_name = location_name;
        this.device_id = device_id;
        this.original_id = original_id;
        this.measurement_import_id = measurement_import_id;
        this.captured_at = captured_at;
        this.height = height;
        this.devicetype_id = devicetype_id;
        this.sensor_id = sensor_id;
        this.station_id = station_id;
        this.channel_id = channel_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = 0;
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
        this.captured_at =captured_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public int getDevice_id() {
        return device_id;
    }

    public void setDevice_id(int device_id) {
        this.device_id = device_id;
    }

    public int getOriginal_id() {
        return original_id;
    }

    public void setOriginal_id(int original_id) {
        this.original_id = original_id;
    }

    public int getMeasurement_import_id() {
        return measurement_import_id;
    }

    public void setMeasurement_import_id(int measurement_import_id) {
        this.measurement_import_id = measurement_import_id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getDevicetype_id() {
        return devicetype_id;
    }

    public void setDevicetype_id(int devicetype_id) {
        this.devicetype_id = devicetype_id;
    }

    public int getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(int sensor_id) {
        this.sensor_id = sensor_id;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public int getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) { this.distance=distance; }
}
