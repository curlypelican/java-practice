package com.company;

public class NumFactory implements Number {

    private String num, im;
    private int re;

    NumFactory(int x, int y) {
        setNum(x,y);
    }

    public String getNum(){return this.num;}

    public void setNum(int x,int y) {
        this.im = createIm().getNum(y);
        this.re = createRe().getNum(x);
        this.num = this.re + "+" + this.im;
    }

    @Override
    public ImFactory createIm() {
        return new ImFactory();
    }

    @Override
    public ReFactory createRe() {
        return new ReFactory();
    }
}