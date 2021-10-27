package com.company;

public class Main {

    public static void main(String[] args) {

        MovablePoints r = new MovablePoints(1, 1, 4, 6);
        System.out.println(r);
        r.move(2, 3, -2, -1);
        System.out.println(r);

        MovablePoints speed = new MovablePoints(1, 1, 3, 6, 7, 2);
        System.out.println(speed);
        speed.move(2, 3, -2, -1);
        System.out.println(speed);
        speed.isSpeedTheSame();

    }
}
