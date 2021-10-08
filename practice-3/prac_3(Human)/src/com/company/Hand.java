package com.company;

public class Hand {

    String nailsColor;
    String size = "middle";

    public Hand(String nailsColor, String size) {
        this.nailsColor = nailsColor;
        this.size = size;
    }

    public Hand() {
    }

    public String getNailsColor() {
        return nailsColor;
    }

    public void setNailsColor(String nailsColor) {
        this.nailsColor = nailsColor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "nailsColor='" + nailsColor + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
