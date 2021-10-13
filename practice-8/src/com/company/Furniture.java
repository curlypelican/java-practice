package com.company;
import java.util.Scanner;

public abstract class Furniture {
    protected double price;
    protected int count;
    protected String color;
    protected String material;

    public Furniture(double price, int count, String color, String material) {
        this.price = price;
        this.count = count;
        this.color = color;
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void addToCart(){
        System.out.println("Товар был добавлен в Вашу корзину!");
    }

    public void removeFromCart(){
        System.out.println("Вы точно хотите удалить товар? (да - 1, нет - 0)");
        Scanner scX = new Scanner(System.in);
        if (scX.nextBoolean()) System.out.println("Товар удален!");
    }

    public void buyAProduct(){
        if (this.count != 0) {
            this.count--;
            System.out.println("Спасибо за покупку!");
        } else {
            System.out.println("Данный товар отсутствует :(");
        }
    }
}
