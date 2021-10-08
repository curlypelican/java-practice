package com.company;

public class Head {

    String eyesColor;
    String hairColor, hairLength;

    public Head(String eyesColor, String hairColor, String hairLength) {
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.hairLength = hairLength;
    }

    public Head() {
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairLength() {
        return hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    @Override
    public String toString() {
        return "Head{" +
                "eyesColor='" + eyesColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", hairLength='" + hairLength + '\'' +
                '}';
    }
}
