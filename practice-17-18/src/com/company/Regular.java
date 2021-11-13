package com.company;

import java.util.ArrayList;
import java.util.regex.*;

public class Regular
{
    public static void ifString(String string){

    }

    public static void ifMAC(String string){
        Pattern p1 = Pattern.compile("(([a-f]|[A-F]|[0-9])+([a-f]|[A-F]|[0-9])+:){5}+(([a-f]|[A-F]|[0-9])){2}");
        Matcher m1 = p1.matcher(string );
        if (m1.matches()) System.out.println("Все правильно!");
        else System.out.println("Не верно.");
    }

    public static void ifMoney(String string)
    {
        Pattern pattern = Pattern.compile("[1-9]+[.][0-9]+ (USD|RUB|EU)");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(string.substring(start,end));
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Задание 1.");
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String s  = "abcdefghijklmnopqrstuv18340";
        System.out.println(s + ": " + p1.matcher(s).matches());
        s  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(s + ": " + p1.matcher(s).matches());

        System.out.println("\nЗадание 2.");
        ifMAC("01:23:45:67:89:Az");
        ifMAC("aE:dC:cA:56:76:54");

        System.out.println("\nЗадание 3.");
        String money = new String("23.78 USD, 22 UDD, 0.002 USD");
        ifMoney(money);

    }
}

