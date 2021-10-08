package com.company;

public class Book {

    private double price;
    private String name;
    private String author;

    public Book(double price, String name, String author) {
        this.price = price;
        this.name = name;
        this.author = author;
    }

    public Book(String name) {
        this.name = name;
        price = 300;
        author = "Pushkin";
    }

    public Book() {
        name = "Steel Ball Run";
        author = "Hirohiko Araki";
        price = 400;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
