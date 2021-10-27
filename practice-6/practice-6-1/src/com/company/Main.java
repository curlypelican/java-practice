package com.company;

public class Main {

    public static void main(String[] args) {

        MovableRectangle r = new MovableRectangle(0, 0, 7, 13);
        System.out.println(r);
        r.move(1,2, -3, -5);
        System.out.println(r);

    }
}
