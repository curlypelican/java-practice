package com.company;

public class Bed extends Furniture{
    protected String type1;     // односпальная/двуспальная
    protected String type2;     // для детей/подростков/взрослых
    protected double size;

    public Bed(double price, int count, String color, String material,
               String type1, String type2, double size) {
        super(price, count, color, material);
        this.type1 = type1;
        this.type2 = type2;
        this.size = size;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
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
        return "Bed{" +
                "type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", count=" + count +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
