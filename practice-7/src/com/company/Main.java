package com.company;

import com.company.dog.Beagle;
import com.company.dog.Corgi;
import com.company.dog.Dalmatian;
import com.company.dog.Dog;
import com.company.dish.Dish;
import com.company.dish.Cup;
import com.company.dish.Plate;
import com.company.dish.Teapot;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----ЗАДАНИЕ 1-----");
        Dog d1 = new Corgi("very happy", "nice ears", "small", "middle");
        d1.setName("Doffi");
        d1.setOld(1);
        System.out.println(d1);
        Dog d2 = new Beagle(true, "small", "short");
        d2.setName("Lucky");
        d2.setOld(3);
        System.out.println(d2);
        Dog d3 = new Dalmatian("yes", "big", "short");
        d3.setName("L");
        d3.setOld(9);
        System.out.println(d3);

        System.out.println("-----ЗАДАНИЕ 2-----");
        Dish d4 = new Cup(349.90, "Фарфор", 12, 4, 10);
        d4.calcVolume();
        System.out.println(d4);
        Dish d5 = new Plate(7);
        d5.calcVolume();
        d5.setMaterial("Фарфор");
        d5.setGuarantee(6);
        d5.setPrice(129.90);
        System.out.println(d5);
        Dish d6 = new Teapot("Электрический", "Черный", 6, 27.75);
        d6.calcVolume();
        d6.setPrice(2159.90);
        d6.setGuarantee(12);
        System.out.println(d6);
    }

}
