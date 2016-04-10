package com.uhills.toytrain.domain;

/**
 * 
 * Additions that can be added to the underlying Terrain.
 *
 */
public class Scenery implements Property {
    public enum SceneryType {
        Foliage,
        House,
        Store,
        School,
        TrainStop  // this may end up being a separate class
    }

}
