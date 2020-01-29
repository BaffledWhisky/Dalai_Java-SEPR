package com.kroy.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.JsonValue;
import com.kroy.screens.GameScreen;

public class FireEngine extends Moveable {

    public FireEngine(GameScreen gameScreen, Vector2 position, Vector2 dimension, Sprite sprite, int health, float movementSpeed) {
        super(gameScreen, position, dimension, sprite, health, movementSpeed);
    }
}
