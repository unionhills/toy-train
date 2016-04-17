package com.uhills.toytrain.console;

import com.uhills.toytrain.domain.*;

public class App {

    private World theWorld;

    public void createSampleWorld() {
        theWorld = new World(5, 5);
        theWorld.initializeTerrain(Terrain.TerrainType.Grass);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
