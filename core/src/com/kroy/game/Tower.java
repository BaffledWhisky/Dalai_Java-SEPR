package com.kroy.game;

public class Tower extends Entity{
    int[] dimensions;

    /**
     *
     * @param dimensions The size of the tower
     * @param health The current health of the tower
     * @param range The maximun range of the tower
     * @param position The position of the tower on the map
     */
    public Tower(int[] dimensions, int health, int range, Point position) {
        super(health, range, position);
        this.dimensions = dimensions;
    }

}
