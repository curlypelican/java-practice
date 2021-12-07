package com.company;

public class Factory implements Chair {
    @Override
    public VictChair createVictorian() {
        return new VictorianChair();
    }
    @Override
    public MultChair createMulti() {
        return new MultiChair();
    }
    @Override
    public MagChair createMag() {
        return new MagicChair();
    }
}
