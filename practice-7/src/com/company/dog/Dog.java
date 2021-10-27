package com.company.dog;

public abstract class Dog {
    protected String name;
    protected int old;
    protected String wool;
    protected String size;

    Dog () {}
    Dog (String wool, String size)
    {
        this.size = size;
        this.wool = wool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract String getName();
    public abstract int getOld ();

    @Override
    public String toString () {
        return "Dog's size: " + size + "\nDog's wool: " + wool;
    }

}
