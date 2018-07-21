package com.practice.myapp.models;

public class Weather {
    private String ts;
    private int tp;
    private int pr;
    private int hu;
    private double ws;
    private int wd;
    private String ic;

    public Weather() {
    }

    public Weather(String ts, int tp, int pr, int hu, double ws, int wd, String ic) {
        this.ts=ts;
        this.tp=tp;
        this.pr=pr;
        this.hu=hu;
        this.ws=ws;
        this.wd=wd;
        this.ic=ic;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts=ts;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp=tp;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr=pr;
    }

    public int getHu() {
        return hu;
    }

    public void setHu(int hu) {
        this.hu=hu;
    }

    public double getWs() {
        return ws;
    }

    public void setWs(double ws) {
        this.ws=ws;
    }

    public int getWd() {
        return wd;
    }

    public void setWd(int wd) {
        this.wd=wd;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic=ic;
    }
}