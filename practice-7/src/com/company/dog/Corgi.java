package com.company.dog;

public class Corgi extends Dog {
    private String happy;
    private String ears;

    public Corgi(){}

    public Corgi(String happy, String ears){
        this.happy = happy;
        this.ears = ears;
    }

    public Corgi(String happy, String ears, String size, String wool){
        this.happy = happy;
        this.ears = ears;
        this.size = size;
        this.wool = wool;
    }

    public void setHappy (String happy) {
        this.happy = happy;
    }

    public void setEars (String ears) {
        this.ears = ears;
    }

    public String getHappy(){
        return happy;
    }

    public String getEars(){
        return ears;
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public int getOld () {
        return old;
    }

    @Override
    public String toString() {
        return "Corgi{" +
                "happy='" + happy + '\'' +
                ", ears='" + ears + '\'' +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", wool='" + wool + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
