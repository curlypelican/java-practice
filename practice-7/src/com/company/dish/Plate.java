package com.company.dish;

public class Plate extends Dish{
    private double radius;
    private double volume;

    public Plate() {
    }

    public Plate(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void calcVolume() {
        System.out.printf("Объем тарелки: %.2f", 3.14 * radius * radius * 1.5);
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "price=" + price +
                ", material='" + material + '\'' +
                ", guarantee=" + guarantee +
                ", radius=" + radius +
                ", volume=" + volume +
                '}';
    }
}
