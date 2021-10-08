package com.company;

public class Leg {
    int size;

    public Leg(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "size=" + size +
                '}';
    }
}
