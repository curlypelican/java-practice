package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=====Комплексные числа=====");

        System.out.println("Введите действительную и мнимую части числа: ");
        NumFactory number = new NumFactory(new Scanner(System.in).nextInt(),
                new Scanner(System.in).nextInt());
        System.out.println("Число: " + number.getNum());
    }
}
