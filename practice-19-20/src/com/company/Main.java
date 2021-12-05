package com.company;

import java.util.*;
import java.util.Collections.*;
import java.lang.Integer;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        System.out.println("=====Красивые номера 19-20=====");

        System.out.print("Введите количество номеров для генерации: ");
        int n = new Scanner(System.in).nextInt();
        CarNumber num = new CarNumber();

        //Генерация номеров
        for (int i = 0; i < n; i++) {
            arr.add(num.generate());
            System.out.println(arr.get(i));
        }

        Collections.sort(arr,Collections.reverseOrder());
        HashSet<String> hash = new HashSet<String>(arr);
        TreeSet tree = new TreeSet(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер для поиска: ");
        String search = scanner.nextLine();

        System.out.println("ПРЯМОЙ ПЕРЕБОР: ");
        long t1 = System.nanoTime();
        boolean ex = arr.contains(search);
        long t2 = System.nanoTime();
        System.out.println("Номер " + (ex ? "найден. " : "не найден. ") + "Время поиск (нс): " + (t2 - t1) + "нс");

        System.out.println("БИНАРНЫЙ ПОИСК: ");
        t1 = System.nanoTime();
        int x = Collections.binarySearch(arr, search, Collections.reverseOrder());
        t2 = System.nanoTime();
        if (x >= 0)
            System.out.println("Номер найден. Время поиска (нс): " + (t2 - t1) + "нс");
        else
            System.out.println("Номер не найден. Время поиска (нс): " + (t2 - t1) + "нс");

        System.out.println("HASHSET: ");
        t1 = System.nanoTime();
        ex = hash.contains(search);
        t2 = System.nanoTime();
        System.out.println("Номер " + (ex ? "найден." : "не найден.") + "Время поиска (нс): " + (t2 - t1) + "нс");

        System.out.println("TREESET: ");
        t1 = System.nanoTime();
        ex = tree.contains(search);
        t2 = System.nanoTime();
        System.out.println("Номер " + (ex ? "найден." : "не найден.") + "Время поиска (нс): " + (t2 - t1) + "нс");
    }
}