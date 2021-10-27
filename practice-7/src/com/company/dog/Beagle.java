package com.company.dog;

public class Beagle extends Dog{
    private boolean obedient;

    public Beagle(){}
    public Beagle(boolean obedient){
        this.obedient = obedient;
    }
    public Beagle(boolean obedient, String size, String wool){
        this.obedient = obedient;
        this.size = size;
        this.wool = wool;
    }

    public void setObedient(boolean obedient){
        this.obedient = obedient;
    }

    public boolean getObedient(){
        return obedient;
    }

    @Override
    public String getName() {
        return null;
    }
    @Override
    public int getOld() {
        return 0;
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "obedient='" + obedient + '\'' +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", wool='" + wool + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
