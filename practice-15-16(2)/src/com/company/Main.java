package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("===Создать систему менеджмента банковского аккаунта===\n");
        Tester test = new Tester();
        test.test();
    }
}
