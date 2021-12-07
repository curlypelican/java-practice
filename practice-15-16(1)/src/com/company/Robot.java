package com.company;

public class Robot extends Thread{

    legs l;
    Robot(legs leg) {this.l=leg;}

    @Override
    synchronized public void run() {
        System.out.println(l);
    }
}