package com.company;

import java.util.Scanner;

public class Client{

    Client(){}

    public void sit() {

        Factory newChair = new Factory();
        int flag = 1;

        while (flag > 0) {

            System.out.print("\n           МЕНЮ\n1 - Викторианский стул\n2 - Многофункциональный стул" +
                    "\n3 - Магический стул\n0 - Выход\n" );

            switch(new Scanner(System.in).nextInt()) {
                case 1: {
                    newChair.createVictorian();
                    break;
                }
                case 2: {
                    newChair.createMulti();
                    break;
                }
                case 3: {
                    newChair.createMag();
                    break;
                }
                case 0: {
                    flag = 0;
                    break;
                }
                default: {
                    flag = 1;
                    System.out.println("Ошибка ввода!");
                }
            }
        }
    }
}