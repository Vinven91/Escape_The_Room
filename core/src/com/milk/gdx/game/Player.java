package com.milk.gdx.game;

import com.badlogic.gdx.math.Vector2;

public class Player {
	int Width = 20;
	int Height = 20;
	float X;
	float Y;
	
	public int SPEED = 3;
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;
    
    public Vector2 position;
    private static final int [][] DIR_OFFSETS = new int [][] {
        {0,0}, {0,1}, {1,0},  {0,-1},  {-1,0}   };
    
    public Player(int x, int y) {
        position = new Vector2(x,y);
    }   
    
    public float getX() {
    	return X;
    }
    public float getY() {
    	return Y;
    }
    public Vector2 getPosition() {
        return position;    
    }
    
    public void move(int dir) { 
    	position.x += SPEED * DIR_OFFSETS[dir][0];
    	position.y += SPEED * DIR_OFFSETS[dir][1];
        X = position.x;
        Y = position.y;
    }
    
}
