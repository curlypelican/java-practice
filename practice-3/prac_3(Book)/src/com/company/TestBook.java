package com.company;

public class TestBook {

    public static void main(String[] args) {

        Book b1 = new Book("Summer", "Author", 199, 1999);
        Book b2 = new Book ();
        System.out.println("Your book - choose name, author, price, year:");
        b2.setName();
        b2.setAuthor();
        b2.setPrice();
        b2.setYear();
        System.out.println (b1.toString());
        System.out.println(b2.toString());

    }
}
