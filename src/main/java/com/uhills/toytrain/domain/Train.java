package com.uhills.toytrain.domain;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Domain object for a car.  Essentially, this consists of a linked list of train cars
 */
public class Train {
    private Deque carList;

    /**
     * Initialize our linked list of train cars
     */
    public Train() {
        carList = new LinkedList();
    }

    /**
     * Adds a new train car to the end of the train.
     *
     * @param newCar
     */
    public void addCar(Car newCar) {
        carList.addLast(newCar);
    }
}
