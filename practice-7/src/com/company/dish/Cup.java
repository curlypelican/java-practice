package com.company.dish;

public class Cup extends Dish {
    private double radius;
    private double height;

    public Cup() {
    }

    public Cup(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cup(double price, String material, int guarantee, double radius, double height) {
        super(price, material, guarantee);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calcVolume() {
        System.out.printf("Объем кружки: %.2f", 3.14 * radius * radius * height);
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return "Cup{" +
                "radius=" + radius +
                ", height=" + height +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", guarantee=" + guarantee +
                '}';
    }
}
