package com.company;

import java.util.Scanner;

public class Bank extends Person{

    private int money = 0;

    public Bank(String name) {
        super.name = name;
    }

    public synchronized void deposit(int sum, int thread) {
        this.money += sum;
        System.out.println("Поток " + thread + ":   Пополнение выполнено успешно! Ваш баланс: " + checkBalance());
    }

    public synchronized void withdraw(int sum, int thread) {

        if(isEnough(sum)) {
            money -= sum;
            System.out.println("Поток " + thread + ":   Пополнение выполнено успешно! Ваш баланс: " + checkBalance());
        }
        else
            System.out.println("Поток " + thread + ":   К сожалению, недостаточно средств. Ваш баланс: " + checkBalance());

    }

    public boolean isEnough(int amount) {
        return (money-amount >= 0) ? true : false;
    }

    public int checkBalance() {
        return money;
    }
}
