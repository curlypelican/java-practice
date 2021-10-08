package com.company;

public class CircleTest {

    public static void main(String[] args) {

        Circle c1 = new Circle(15, "black");
        System.out.println("Color: " + c1.getColor());
        System.out.println("Radius: " + c1.getRadius());
        c1.setColor("blue");
        System.out.println(c1);
        System.out.println("The area of the shape: " + c1.getArea());
        System.out.println("The perimeter of the shape: " + c1.getPerimeter());

    }
}
