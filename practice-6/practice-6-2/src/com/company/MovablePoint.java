package com.company;

public class MovablePoint extends Point implements Movable{

    protected int speed;

    public MovablePoint(int x, int y) {
        super(x, y);
        this.speed = 0;
    }

    public MovablePoint(int x, int y, int speed) {
        super(x, y);
        this.speed = speed;

    }

    @Override
    public void move(int x, int y) {
        this.setX(getX() + x);
        this.setY(getY() + y);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
