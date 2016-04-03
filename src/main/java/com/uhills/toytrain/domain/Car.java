package com.uhills.toytrain.domain;

/**
 * Created by marchamilton on 4/2/16.
 */
public abstract class Car {

    // capacity will mean different things to different types of cars
    protected long capacity;

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    /**
     * Each type of car must compute its own weight.
     * 
     * @return the computed weight
     */
    public abstract long getWeight();
}
