package com.uhills.toytrain.domain;

public class TrackSegment {
    public enum OrientationType {
        NorthSouth,
        EastWest,
        NorthWest,
        NorthEast,
        SouthWest,
        SouthEast
    }

    private OrientationType orientation;

    public OrientationType getOrientation() {
        return orientation;
    }

    public void setOrientation(OrientationType orientation) {
        this.orientation = orientation;
    }
}
