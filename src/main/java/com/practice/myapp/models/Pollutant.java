package com.practice.myapp.models;

public class Pollutant {
    private int conc;
    private int aqius;
    private int aqicn;

    public Pollutant() {
    }

    public Pollutant(int conc, int aqius, int aqicn) {
        this.conc = conc;
        this.aqius = aqius;
        this.aqicn = aqicn;
    }

    public int getConc() {
        return conc;
    }

    public void setConc(int conc) {
        this.conc = conc;
    }

    public int getAqius() {
        return aqius;
    }

    public void setAqius(int aqius) {
        this.aqius = aqius;
    }

    public int getAqicn() {
        return aqicn;
    }

    public void setAqicn(int aqicn) {
        this.aqicn = aqicn;
    }
}
