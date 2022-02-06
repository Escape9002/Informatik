package Entities;
import Visuals.Handler;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import Visuals.*;
import GameMain.GameMain;

public class Player extends GameObject{
	
	Handler handler;

	public Player(float x, float y, ID id, Handler handler) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		this.handler = handler;
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		x = GameMain.clamp((int)x, 0, GameMain.WIDTH- 50);
		y = GameMain.clamp((int)y, 0, GameMain.HEIGHT- 70);
		
		collision();
		
	}
	
	public void collision() {
		for ( int i = 0; i< handler.object.size(); i++) {
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId()== ID.BasicEnemy ){
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					HUD.HEALTH -=2;
				}
			}
			
			
		}
	}
	
	public void render(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect((int)x, (int)y, 32, 32);
		
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}
	

}
