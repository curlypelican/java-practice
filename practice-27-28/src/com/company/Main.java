package com.company;

import java.io.File;

public class Main
{

    public static void main(String[] args){

        int Processors = Runtime.getRuntime().availableProcessors();

        String srcFolder = "img";
        String dst = "mini-img";

        File srcDir = new File(srcFolder);
        File[] files = srcDir.listFiles();
        int middle = files.length / Processors;

        long start = System.currentTimeMillis();
        for (int i = 0; i < Processors - 1; i++){

            File[] files1 = new File[middle];
            System.arraycopy(files, 0 + (middle * i), files1, 0, middle);
            Reduction img1 = new Reduction(files1, dst, start);
            new Thread(img1).start();
        }

        File[] files2 = new File[files.length - middle * (Processors - 1)];
        System.arraycopy(files, middle * (Processors - 1), files2, 0, files2.length);
        Reduction img2 = new Reduction(files2, dst, start);
        new Thread(img2).start();
    }
}