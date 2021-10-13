package com.company;

import java.util.ArrayList;

public class FurnitureStore {
    protected ArrayList<Furniture> furnitureCollection = new ArrayList<>();

    public FurnitureStore(Furniture chair, Furniture armchair, Furniture sofa,
                          Furniture bed, Furniture table, Furniture commode) {
        furnitureCollection.add(chair);
        furnitureCollection.add(armchair);
        furnitureCollection.add(sofa);
        furnitureCollection.add(bed);
        furnitureCollection.add(table);
        furnitureCollection.add(commode);
    }

    @Override
    public String toString() {
        return "FurnitureStore{" +
                "furnitureCollection=" + furnitureCollection +
                '}';
    }
}
