package com.company;

public class Commode extends Furniture{
    protected double size;
    protected int section; // количество отделений от 1 до 6

    public Commode(double price, int count, String color, String material,
                   double size, int section) {
        super(price, count, color, material);
        this.size = size;
        this.section = section;
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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Commode{" +
                "size=" + size +
                ", section=" + section +
                ", price=" + price +
                ", count=" + count +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
