package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import GameMain.GameMain;

public class ScanEnemy extends GameObject{

	int sizeX = 16;
	int sizeY = 8;
	
	public ScanEnemy(float x, float y, ID id) {
		super(x, y, id);
		
		velX = 10;
		velY= 0;
	}
	
	public void tick() {
		x+= velX;
		y += velY;
		
		if(y <= 0 || y >= GameMain.HEIGHT - 50) velY *= -1;
		if(x <= 0 || x >= GameMain.WIDTH - 30) velX *= -1;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillRect((int)x, (int)y, sizeX, sizeY);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, sizeX, sizeY);
	}

}
