package com.company;

public class Ball {
    private String color;
    private double price;
    private int radius;

    public Ball(String color, int price, int radius) {
        this.color = color;
        this.price = price;
        this.radius = radius;
    }

    public Ball(String color, int price){
        this.color = color;
        this.price = price;
        radius = 15;
    }

    public Ball(){
        price = 100;
        radius = 15;
        color = "Red";
    }

    public void discount10(){
        System.out.println("Price with 10%: " + price*0.9);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", radius=" + radius +
                '}';
    }
}
