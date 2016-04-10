package com.uhills.toytrain.domain;

/**
 * A TrackSegment is represents 1 section of track. If you think of
 * the segment as sitting inside of a square, the track must have 2
 * end points at 2 different edges of the square.
 * 
 * For example, a "NorthSouth" section is a vertical track segment
 * with one end point at the North end and the South end.
 * 
 * When connecting Track segments together, the end user needs to make
 * sure that the end points between segments link up if they want to
 * make a complete track.
 *
 */
public class TrackSegment implements Property {
    public enum OrientationType {
        NorthSouth,
        EastWest,
        NorthWest,
        NorthEast,
        SouthWest,
        SouthEast
    }

    private OrientationType orientation;

    /**
     * Returns the track segment orientation.
     *
     * @return the track segment orientation.
     */
    public OrientationType getOrientation() {
        return orientation;
    }

    /**
     * Sets the track segment orientation.
     *
     * @param orientation - the track segment orientation
     */
    public void setOrientation(OrientationType orientation) {
        this.orientation = orientation;
    }
}
