package com.company;

public class Table extends Furniture{
    protected double size;
    protected String type;      // рабочий/обеденный/журнальный
    protected String shape;     // круглый/прямоугольный/квадратный

    public Table(double price, int count, String color, String material,
                 double size, String type, String shape) {
        super(price, count, color, material);
        this.size = size;
        this.type = type;
        this.shape = shape;
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

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
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
        return "Table{" +
                "price=" + price +
                ", count=" + count +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
