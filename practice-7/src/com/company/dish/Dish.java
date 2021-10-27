package com.company.dish;

public abstract class Dish {
    protected double price;
    protected String material;
    protected int guarantee;        // в месяцах

    public Dish() {
    }

    public Dish(double price, String material, int guarantee) {
        this.price = price;
        this.material = material;
        this.guarantee = guarantee;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public abstract void calcVolume();

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", material='" + material + '\'' +
                ", guarantee=" + guarantee +
                '}';
    }
}
