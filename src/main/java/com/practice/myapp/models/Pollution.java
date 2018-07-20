package com.practice.myapp.models;

import java.util.HashMap;

public class Pollution {
    private String ts;
    private int aqius;
    private String mainus;
    private int aqicn;
    private String maincn;
    private HashMap<String, Pollutant> p1;

    public Pollution() {
    }

    public Pollution(String ts, int aqius, String mainus, int aqicn, String maincn, HashMap<String, Pollutant> p1) {
        this.ts = ts;
        this.aqius = aqius;
        this.mainus = mainus;
        this.aqicn = aqicn;
        this.maincn = maincn;
        this.p1 = p1;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public int getAqius() {
        return aqius;
    }

    public void setAqius(int aqius) {
        this.aqius = aqius;
    }

    public String getMainus() {
        return mainus;
    }

    public void setMainus(String mainus) {
        this.mainus = mainus;
    }

    public int getAqicn() {
        return aqicn;
    }

    public void setAqicn(int aqicn) {
        this.aqicn = aqicn;
    }

    public String getMaincn() {
        return maincn;
    }

    public void setMaincn(String maincn) {
        this.maincn = maincn;
    }

    public HashMap<String, Pollutant> getP1() {
        return p1;
    }

    public void setP1(HashMap<String, Pollutant> p1) {
        this.p1 = p1;
    }
}
