package com.kroy.entities;

import com.badlogic.gdx.graphics.Texture;
import com.kroy.game.Point;

/**
 *
 * fire engine class extends the unit class
 */
public class FireEngine extends Unit{
    int volumeOfWater;
    public boolean isActive;
    private static int counter = 0; // Acts as counter for how many FireEngine class instances exist
    public int instanceNum; // What number fire engine is this. Mainly for Debugging


    public FireEngine(int volumeOfWater, int movementSpeed, int health, int range, Point position, Texture img){
        super(movementSpeed, health, range, position,img);
        this.volumeOfWater = volumeOfWater;
        counter++;
        instanceNum = this.getNumberOfInstances();
    }

    public int getNumberOfInstances(){
        return counter;
    }

    public String toString(){
        return String.valueOf(instanceNum);
    }
    public void setState(boolean bool){
        isActive = bool;
    }


    /**
     *
     * @param fortress the fortress the fire engine is to attack
     */
    public void attackFortress(Fortress fortress){

    }


    /**
     *
     * @param patrol the AlienPatrol the fire engine is to attack
     */
    public void attackAlienPatrols(AlienPatrol patrol){

    }

}
