package com.company;

public class MovablePoints {

    MovablePoint p1,p2;

    public MovablePoints(int x1, int y1, int x2, int y2) {
        this.p1 = new MovablePoint(x1, y1);
        this.p2 = new MovablePoint(x2, y2);
    }

    public MovablePoints(int x1, int y1, int speed1, int x2, int y2, int speed2) {
        this.p1 = new MovablePoint(x1, y1, speed1);
        this.p2 = new MovablePoint(x2, y2, speed2);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(int x, int y) {
        this.p1.setX(x);
        this.p1.setY(y);
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(int x, int y) {
        this.p2.setX(x);
        this.p2.setY(y);
    }

    public void move(int x1, int y1, int x2, int y2) {
        this.p1.move(x1, y1);
        this.p2.move(x2,y2);
    }

    public void isSpeedTheSame(){
        if (p1.getSpeed() == p2.getSpeed())
            System.out.println("Скорость точек одинаковая!");
        else
            System.out.println("Скорость точек разная!");
        return ;
    }

    @Override
    public String toString() {
        return "MovablePoints{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
