package com.uhills.toytrain.domain;

public class World {
    private Terrain[][] grid;

    public Terrain[][] getGrid() {
        return grid;
    }

    public void setGrid(Terrain[][] grid) {
        this.grid = grid;
    }

    public World(int size) {
        grid = new Terrain[size][size];
    }

    public World(int width, int height) {
        grid = new Terrain[height][width];
    }

    public void setTerrain(int xpos, int ypos, Terrain terrain) {
        grid[xpos][ypos] = terrain;
    }

}
