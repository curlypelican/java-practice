package com.company;

public class ImFactory {
    ImFactory() {}

    String getNum(int number) {
        String n = "";
        n += number + "i";
        return n;
    }
}
