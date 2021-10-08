package com.company;

public class KennelDogs {

    static Dog[] dogs = new Dog[3];

    public static void main(String[] args) {
        dogs[0] = new Dog("Yoda", 5);
        dogs[1] = new Dog("T-Rex", 12);
        dogs[2] = new Dog();

        dogs[0].setAge(2);
        dogs[0].setName("Volk");
        dogs[1].dogToMan();

        for (int i = 0; i < 3; i++) {
            System.out.println(dogs[i]);
        }
    }
}
