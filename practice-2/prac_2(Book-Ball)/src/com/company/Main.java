package com.company;

/*
1. Необходимо реализовать простейший класс Shape (Фигура) на языке программирования Java.
   Добавить метод toString(). Создать класс-тестер для вывода информации об объекте.
2. Реализуйте простейший класс «Мяч»
3. Реализуйте простейший класс «Книга»
4. Разработайте и реализуйте класс Dog (Собака), поля класса описывают кличку и возраст собаки.
   Необходимо выполнить следующие действия: определить конструктор собаки, чтобы принять и инициализировать
   данные экземпляра., включить стандартные методы  (аксессоры) для получения и установки для имени и возраста,
   включить метод для перевода возраста собаки в "человеческий " возраст (возраст семь раз собаки),
   включите метод ToString, который возвращает описание экземпляра собаки в виде строки.
   Создание класса тестера под названием ПитомникСобак, реализует массив собак и основной метод этого класса
   позволяет добавить в него несколько объектов собаки.
*/

public class Main {

    public static void main(String[] args) {

        System.out.println("\nCheck class Ball:");

        Ball b1 = new Ball();
        Ball b2 = new Ball("Blue", 100);
        Ball b3 = new Ball("Black", 150, 20);

        b1.discount10();
        b2.setRadius(30);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("\nCheck class Book:");

        Book bk1 = new Book();
        Book bk2 = new Book("Tsygany");
        Book bk3 = new Book(450, "TMNT", "Kevin Eastman");

        bk3.setPrice(300);
        bk2.setName("Graf Nulin");

        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
    }
}
