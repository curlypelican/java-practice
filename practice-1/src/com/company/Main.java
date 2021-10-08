package com.company;

public class Main {

    static int calculateFactorial(int x){

        int result = 1;
        for (int i = 1; i <= x; i++){
            result = result * i;
        }
        return result;
    }

    static void bubbleSort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("1. Факториал ввеленного вами числа: " + calculateFactorial(5));

        System.out.println("2. Сортировка массива: ");
        int[] array = new int[15];

        System.out.print("Изначальный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
        bubbleSort(array);

        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");
        System.out.print("3. Гармонический ряд: ");

        double res = 0;
        int n = 10;

        while (n > 0) {
            res = res + (double) 1 / n;
            n--;
            System.out.printf(" %.5f", res);
        }
    }
}
