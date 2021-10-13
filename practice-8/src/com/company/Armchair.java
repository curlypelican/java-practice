package com.company;

public class Armchair extends Furniture{
    protected double size;
    protected String type;

    public Armchair(double price, int count, String color, String material,
                    double size, String type) {
        super(price, count, color, material);
        this.size = size;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public void setCount(int count) {
        super.setCount(count);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public void addToCart() {
        super.addToCart();
    }

    @Override
    public void removeFromCart() {
        super.removeFromCart();
    }

    @Override
    public void buyAProduct() {
        super.buyAProduct();
    }

    @Override
    public String toString() {
        return "Armchair{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
