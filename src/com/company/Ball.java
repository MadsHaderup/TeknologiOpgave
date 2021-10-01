package com.company;

public class Ball {
    private String color;
    private int sizeInCm;

    public Ball(){}

    public int getSizeInCm() {
        return sizeInCm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }
}
