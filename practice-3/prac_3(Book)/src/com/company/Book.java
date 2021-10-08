package com.company;
import java.util.Scanner;

public class Book {

    private String name;
    private String author;
    private int price;
    private int year;

    public Book(String name, String author, int price, int year) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner b = new Scanner(System.in);
        System.out.println("Input name: ");
        this.name = b.nextLine();

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        Scanner b = new Scanner(System.in);
        System.out.println("Input author: ");
        this.author = b.nextLine();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        Scanner b = new Scanner(System.in);
        System.out.println("Input price: ");
        this.price = b.nextInt();
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        Scanner b = new Scanner(System.in);
        System.out.println("Input year: ");
        this.year = b.nextInt();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
