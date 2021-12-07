package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Reduction implements Runnable {

    private File[] files;
    private String dst;
    private long start;

    public Reduction(File[] files, String dst, long start) {
        this.files = files;
        this.dst = dst;
        this.start = start;
    }

    @Override
    public void run() {
        try {
            for(File file : files) {

                BufferedImage img = ImageIO.read(file);
                if(img == null) {
                    continue;
                }

                img = HalfIm(img, file);
                File newFile = new File(dst + "/" + file.getName());
                ImageIO.write(img, "jpg", newFile);
            }
        }
        catch (Exception e) {e.printStackTrace();}
        System.out.println(Thread.currentThread().getName()+" Время окончания работы: " +
                (System.currentTimeMillis() - start) + " ms");
    }
    private BufferedImage HalfIm (BufferedImage img, File file){
        BufferedImage newImage = new BufferedImage(img.getWidth()/2, img.getHeight()/2, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = newImage.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0, img.getWidth()/2, img.getHeight()/2, null);
        g.dispose();
        return newImage;
    }
}
