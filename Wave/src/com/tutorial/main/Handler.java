package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import com.tutorial.main.Game.STATE;

public class Handler {
public Random r;
public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public int spd = 5;
	
	public void tick() {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		try{
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}catch(Exception e) {
		System.out.println("Error " + e.toString());
	}
}	
	
	public void clearEnemy() {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			if(tempObject.getId() == ID.Player) 
			{
				object.clear();
				if(Game.gameState != Game.STATE.End) {
				addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player,this));
				
				}
				}}}	
					
						
			
		
		public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}

	public void removePlayer(ID id) {
		if(id == ID.Player) {
		this.removePlayer(id);
		}
	}
	}
		
	
	
		
	

