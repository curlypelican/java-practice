package com.company;

import java.util.Scanner;

enum legs{RIGHT,LEFT};

public class Main{

    public static void main(String[] args) {

        System.out.println("=====Робот=====");
        Robot right = new Robot(legs.RIGHT);
        Robot leg = new Robot(legs.LEFT);
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1 - Шаг робота\n0 - Завершить программу");
        System.out.print("Ваш выбор: ");
        while((i = scanner.nextInt()) != 0) {
            if (i == 1) {
                right.run();
                leg.run();
            }
            System.out.println("\n1 - Шаг робота\n0 - Завершить программу");
            System.out.print("Ваш выбор: ");
        }
    }
}
