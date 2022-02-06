package Entities;
import GameMain.GameMain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import Visuals.Handler;

public class BasicEnemy extends GameObject{

	private Handler handler;
	
	int sizeX = 32;
	int sizeY = 32;
	
	public BasicEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 5;
		velY= 5;
	}
	
	public void tick() {
		x+= velX;
		y += velY;
		
		if(y <= 0 || y >= GameMain.HEIGHT - 50) velY *= -1;
		if(x <= 0 || x >= GameMain.WIDTH - 30) velX *= -1;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, sizeX, sizeY);
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, sizeX, sizeY);
	}

}
