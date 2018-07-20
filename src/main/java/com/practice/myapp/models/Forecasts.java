package com.practice.myapp.models;

public class Forecasts {

    private String ts;
    private int aqius;
    private int aqicn;
    private int tp;
    private int tp_min;
    private int pr;
    private int hu;
    private int ws;
    private int wd;
    private String ic;

    public Forecasts() {
    }

    public Forecasts(String ts, int aqius, int aqicn, int tp, int tp_min, int pr, int hu, int ws, int wd, String ic) {
        this.ts = ts;
        this.aqius = aqius;
        this.aqicn = aqicn;
        this.tp = tp;
        this.tp_min = tp_min;
        this.pr = pr;
        this.hu = hu;
        this.ws = ws;
        this.wd = wd;
        this.ic = ic;
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

    public int getAqicn() {
        return aqicn;
    }

    public void setAqicn(int aqicn) {
        this.aqicn = aqicn;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public int getTp_min() {
        return tp_min;
    }

    public void setTp_min(int tp_min) {
        this.tp_min = tp_min;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public int getHu() {
        return hu;
    }

    public void setHu(int hu) {
        this.hu = hu;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }

    public int getWd() {
        return wd;
    }

    public void setWd(int wd) {
        this.wd = wd;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }
}
