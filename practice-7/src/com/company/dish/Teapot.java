package com.company.dish;

public class Teapot extends Dish {
    private String type;
    private String color;
    private double radius;
    private double height;

    public Teapot() {
    }

    public Teapot(String type, String color, double radius, double height) {
        this.type = type;
        this.color = color;
        this.radius = radius;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        System.out.printf("Объем чайника: %.2f", 3.14 * radius * radius * height);
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "price=" + price +
                ", material='" + material + '\'' +
                ", guarantee=" + guarantee +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }
}
