package com.uhills.toytrain.domain;

import java.util.Collection;

public class TrainYard {

    private Collection<Car> inventory;

    public Collection<Car> getInventory() {
        return inventory;
    }

    public void setInventory(Collection<Car> inventory) {
        this.inventory = inventory;
    }
}
