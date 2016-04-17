package com.uhills.toytrain.domain;

/**
 * 
 * Represents a section of Earth.
 *
 */
public class Terrain {
    public enum TerrainType {
        Grass,
        Trees,
        Water,
        Mountain
    }

    private TerrainType type;

    public Terrain(TerrainType terrainType) {
        setType(terrainType);
    }

    /**
     * @return the type
     */
    public TerrainType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TerrainType type) {
        this.type = type;
    }
}
