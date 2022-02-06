package Entities;
import GameMain.GameMain;
import Visuals.Handler;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Bullets extends GameObject{
	private Handler handler;

	public Bullets(float x, float y, ID id, Handler handler) {
		super(x, y, id);
		velX = 5;
		velY= 5;
		
		this.handler = handler;
	}
	
	int sizeX = 8;
	int sizeY = 8;
	
	public void tick() {
		x+= velX;
		y += velY;
		
		if(y <= 0 || y >= GameMain.HEIGHT - 100) {
			//handler.removeObject(this);
		}else if(x <= 0 || x >= GameMain.WIDTH - 100) {
			//handler.removeObject(this);
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillRect((int)x, (int)y, sizeX, sizeY);
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, sizeX, sizeY);
	}

}
