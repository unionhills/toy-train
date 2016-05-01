package com.uhills.toytrain.console;

import com.uhills.toytrain.domain.*;

public class App {

    private World theWorld;
    private WorldConsoleRenderer worldRenderer;

    public App() {
        worldRenderer = new WorldConsoleRenderer();
    }

    public void createSampleWorld() {
        theWorld = new World(5, 5);
        theWorld.initializeTerrain(Terrain.TerrainType.Grass);
    }

    public void displayWorld() {
        worldRenderer.printWorld(theWorld);
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Creating sample world");
        app.createSampleWorld();

        System.out.println("Rendering world");
        app.displayWorld();
    }
}
