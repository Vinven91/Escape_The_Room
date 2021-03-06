package com.milk.gdx.game;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Rectangle;


public class GameScreen extends ScreenAdapter{
	private EscapeTheRoom EscapeGame;
    World world;
    WorldRenderer worldRenderer;
    private Random rand = new Random();

	 
    public GameScreen(EscapeTheRoom EscapeGame) {
        this.EscapeGame = EscapeGame;
        world = new World(EscapeGame);
        worldRenderer = new WorldRenderer(EscapeGame,world);
    }
    private void update(float delta) {
    	//To control player and stop by collide
        if(world.Current_Room != 0) {
	    	if(Gdx.input.isKeyPressed(Keys.UP)) {
	            world.getPlayer().move(Player.DIRECTION_UP);
	            world.Player_side = 1; //Back
	        }
	        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
	        	world.getPlayer().move(Player.DIRECTION_RIGHT);
	        	world.Player_side = 2; //Right
	        }
	        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
	        	world.getPlayer().move(Player.DIRECTION_DOWN);
	        	world.Player_side = 3; //Front
	        }
	        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
	        	world.getPlayer().move(Player.DIRECTION_LEFT);
	        	world.Player_side = 4; //Left
	        }
        }
        Rectangle d1 = new Rectangle(world.getDoorLeft().X ,world.getDoorLeft().Y ,world.getDoorLeft().Width ,world.getDoorLeft().Height);
        Rectangle d2 = new Rectangle(world.getDoorMid().X ,world.getDoorMid().Y ,world.getDoorMid().Width ,world.getDoorMid().Height);
        Rectangle d3 = new Rectangle(world.getDoorRight().X ,world.getDoorRight().Y ,world.getDoorRight().Width ,world.getDoorRight().Height);
        Rectangle p = new Rectangle(world.getPlayer().getX() ,world.getPlayer().getY() ,world.getPlayer().Width ,world.getPlayer().Height);
        
        if(world.Current_Room == 0 && Gdx.input.isKeyPressed(Keys.SPACE)) {
        	world.Current_Room = 1;
        }
        
        else if (world.Current_Room == 1) {
	        if (d1.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
	        	world.getPlayer().getPosition().x = 104;
	        	world.getPlayer().getPosition().y = 40; 
	        	world.Current_Room = rand.nextInt(6)+1;; }
	        if (d2.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
		        world.getPlayer().getPosition().x = 195;
		        world.getPlayer().getPosition().y = 40; 
		        world.Current_Room = rand.nextInt(5)+1;; }
		    if (d3.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
			    world.getPlayer().getPosition().x = 283;
			    world.getPlayer().getPosition().y = 40; 
			    world.Current_Room = rand.nextInt(5)+1;; }
        }
        
        else if (world.Current_Room == 2) {
	        if (d1.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
	        	world.getPlayer().getPosition().x = 104;
	        	world.getPlayer().getPosition().y = 40; 
	        	world.Current_Room = rand.nextInt(4)+1;; }
	        if (d2.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
		        world.getPlayer().getPosition().x = 195;
		        world.getPlayer().getPosition().y = 40; 
		        world.Current_Room = rand.nextInt(7)+1;; }
		    if (d3.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
			    world.getPlayer().getPosition().x = 283;
			    world.getPlayer().getPosition().y = 40; 
			    world.Current_Room = rand.nextInt(6)+1;; }
        }
        
        else if (world.Current_Room == 3) {
	        if (d1.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
	        	world.getPlayer().getPosition().x = 104;
	        	world.getPlayer().getPosition().y = 40; 
	        	world.Current_Room = rand.nextInt(7)+1;; }
	        if (d2.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
		        world.getPlayer().getPosition().x = 195;
		        world.getPlayer().getPosition().y = 40; 
		        world.Current_Room = rand.nextInt(6)+1;; }
		    if (d3.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
			    world.getPlayer().getPosition().x = 283;
			    world.getPlayer().getPosition().y = 40; 
			    world.Current_Room = rand.nextInt(5)+1;; }
        }
        
        else if (world.Current_Room == 4) {
	        if (d1.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
	        	world.getPlayer().getPosition().x = 104;
	        	world.getPlayer().getPosition().y = 40; 
	        	world.Current_Room = rand.nextInt(5)+1;; }
		    if (d3.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
			    world.getPlayer().getPosition().x = 283;
			    world.getPlayer().getPosition().y = 40; 
			    world.Current_Room = rand.nextInt(5)+1;; }
        }
        
        else if (world.Current_Room == 5) {
	        if (d1.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
	        	world.getPlayer().getPosition().x = 104;
	        	world.getPlayer().getPosition().y = 40; 
	        	world.Current_Room = rand.nextInt(5)+1;; }
	        if (d2.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
		        world.getPlayer().getPosition().x = 195;
		        world.getPlayer().getPosition().y = 40; 
		        world.Current_Room = rand.nextInt(6)+1;; }
		    if (d3.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
			    world.getPlayer().getPosition().x = 283;
			    world.getPlayer().getPosition().y = 40; 
			    world.Current_Room = rand.nextInt(7)+1;; }
        }
        
        else if (world.Current_Room == 6) {
	        if (d1.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
	        	world.getPlayer().getPosition().x = 104;
	        	world.getPlayer().getPosition().y = 40; 
	        	world.Current_Room = rand.nextInt(4)+1;; }
		    if (d3.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
			    world.getPlayer().getPosition().x = 283;
			    world.getPlayer().getPosition().y = 40; 
			    world.Current_Room = rand.nextInt(5)+1;; }
        }
        else if (world.Current_Room == 7) {
        	if (d1.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
	        	world.getPlayer().getPosition().x = 104;
	        	world.getPlayer().getPosition().y = 40; 
	        	world.Current_Room = rand.nextInt(6)+1;; }
		    if (d3.overlaps(p) && Gdx.input.isKeyPressed(Keys.E)) {
			    world.getPlayer().getPosition().x = 283;
			    world.getPlayer().getPosition().y = 40; 
			    world.Current_Room = rand.nextInt(6)+1;; }
		    if (d2.overlaps(p) && Gdx.input.isKeyPressed(Keys.SPACE) && world.Has_Key) {
		        world.Use_Key = true; }
		    if(world.Use_Key) {
		    	world.Current_Room = 8;
		    }
        }
        
        //To pick up items
        Rectangle k = new Rectangle(world.getKey().X ,world.getKey().Y ,world.getKey().Width ,world.getKey().Height);
        if (k.overlaps(p) && Gdx.input.isKeyPressed(Keys.SPACE)) {
        	world.Has_Key = true;
        }    
        
        //Dont through the wall
        Rectangle wl = new Rectangle(10 ,110 ,30 ,160);
        Rectangle wr = new Rectangle(425 ,110 ,30 ,160);
        Rectangle wu = new Rectangle(212 ,160 ,425 ,20);
        Rectangle wd = new Rectangle(212 ,10 ,425 ,20);
        if (wd.overlaps(p) && Gdx.input.isKeyPressed(Keys.DOWN)){
        	world.getPlayer().move(Player.DIRECTION_STILL);
        }
        
    }
    @Override
    public void render(float delta) {
        update(delta);
 
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        worldRenderer.render(delta);
    }   
}