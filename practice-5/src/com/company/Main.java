package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1,1), 10);

        System.out.println(circle);

        MovablePoint movablePoint = new MovablePoint(10,10);
        System.out.println(movablePoint);
        movablePoint.move(12,19);
        System.out.println(movablePoint);
    }
}
