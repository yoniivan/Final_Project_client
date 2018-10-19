package com.example.yoni1.final_project_client;

public class ModelCamera {

    private int iso;
    private double shatterSpeed;
    private double fStop;
    private int whiteBalance;

    public ModelCamera(){}

    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {
        this.iso = iso;
    }

    public double getShatterSpeed() {
        return shatterSpeed;
    }

    public void setShatterSpeed(double shatterSpeed) {
        this.shatterSpeed = shatterSpeed;
    }

    public double getfStop() {
        return fStop;
    }

    public void setfStop(double fStop) {
        this.fStop = fStop;
    }

    public int getWhiteBalance() {
        return whiteBalance;
    }

    public void setWhiteBalance(int whiteBalance) {
        this.whiteBalance = whiteBalance;
    }
}
