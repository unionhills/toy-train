package com.uhills.toytrain.domain;

import com.uhills.toytrain.domain.Terrain.TerrainType;

//TODO: Watch this class to ensure it does not turn into a monstrous "God" object. It may need to be re-factored to separate concerns.

/**
 * The World consists as a 2 dimensional grid with layers.
 *
 * The underlying layer is the "Terrain".  This describes the
 * characteristics of the "land".  (i.e. grass, water, trees, etc.)
 * 
 * On top of the terrain is where "Property" is placed.  This consists
 * of "Scenery" items such as buildings, or other structures which
 * enhance the Terrain.
 * 
 * Property also consists of the TrackSegments which are used to
 * create a track.
 *
 */
public final class World {
    private int         height;
    private int         width;
    //TODO: Is a 2D primitive array good enough?
    private Property[][] propertyLayer;  // TODO: This may need to be re-factored for efficiency as this may be very sparse
    private Terrain[][]  terrainLayer;   // Every piece of the "World" will have some form of terrain

    /**
     * This version of the constructor creates a square world
     * using the size for both the height and width.
     * 
     * @param size - height and width of the World
     */
    public World(int size) {
        height = size;
        width = size;

        terrainLayer = new Terrain[size][size];
        propertyLayer = new Property[size][size];
    }

    /**
     * The world must be initialized with dimensions.
     * 
     * @param width - width of the World
     * @param height - height of the World
     */
    public World(int width, int height) {
        this.width = width;
        this.height = height;

        terrainLayer = new Terrain[height][width];
        propertyLayer = new Property[height][width];
    }

    /**
     * Sets the terrain at a specific World coordinate.
     *
     * @param xpos - x coordinate to place Terrain
     * @param ypos - y coordinate to place Terrain
     * @param terrain - the new Terrain object
     */
    public void setTerrainAt(int xpos, int ypos, Terrain terrain) {
        terrainLayer[xpos][ypos] = terrain;
    }

    /**
     * Gets the terrain at a specific World coordinate.
     *
     * @param xpos - x coordinate to place Terrain
     * @param ypos - y coordinate to place Terrain
     * @return the Terrain object at the given coordinates
     */
    public Terrain getTerrainAt(int xpos, int ypos) {
        //TODO: Add bounds checking
        
        return terrainLayer[xpos][ypos];
    }

    /**
     * Sets the Property at a specific World coordinate.
     *
     * @param xpos - x coordinate to place Property
     * @param ypos - y coordinate to place Property
     * @param property - the new Property object
     */
    public void setPropertyAt(int xpos, int ypos, Property property) {
        //TODO: Add business rules around what kind of Property can be added to the underlying Terrain
        propertyLayer[xpos][ypos] = property;
    }

    /**
     * Gets the terrain at a specific World coordinate.
     *
     * @param xpos - x coordinate to place Property
     * @param ypos - y coordinate to place Property
     * @return the Property object at the given coordinates
     */
    public Property getPropertyAt(int xpos, int ypos) {
        //TODO: Add bounds checking
        
        return propertyLayer[xpos][ypos];
    }

    public void initializeTerrain(TerrainType terrainType) {
        for (int i=0; i < width; i++) {
            for (int j=0; j < height; j++) {
                terrainLayer[i][j] = new Terrain(terrainType);
            }
        }
        
    }
}
