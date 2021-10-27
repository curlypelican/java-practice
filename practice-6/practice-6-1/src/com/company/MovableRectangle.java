package com.company;

public class MovableRectangle extends Rectangle implements Movable{

    public MovableRectangle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        this.height = Math.abs(x2-x1);
        this.length = Math.abs(y2-y1);
    }

    @Override
    public void move(int x1, int y1, int x2, int y2) {
        this.setHeight (Math.abs((p2.getX() + x2) - (p1.getX() + x1)));
        this.setLength (Math.abs((p2.getY() + y2) - (p1.getY() + y1)));
        this.setP1(p1.getX() + x1, p1.getY() + y1);
        this.setP2(p2.getX() + x2, p2.getY() + y2);
    }
}