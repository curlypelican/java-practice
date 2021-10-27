package com.company.dog;

public class Dalmatian extends Dog{
    private String stained;

    public Dalmatian(){}

    public Dalmatian(String stained){
        this.stained = stained;
    }
    public  Dalmatian(String stained, String size, String wool){
        this.stained = stained;
        this.size = size;
        this.wool = wool;
    }

    public void setStained(String stained){
        this.stained = stained;
    }

    public String getStained() {
        return stained;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getOld(){
        return old;
    }

    @Override
    public String toString() {
        return "Dalmatian{" +
                "stained='" + stained + '\'' +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", wool='" + wool + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
