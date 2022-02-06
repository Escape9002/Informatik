package Entities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import GameMain.GameMain;
import Visuals.Handler;

public class FirstBoss extends GameObject{
	private Handler handler;
	private Random r;

	public FirstBoss(float x, float y, ID id, Handler handler) {
		super(x, y, id);
		velX = 5;
		velY= 5;
		
		this.handler = handler;
	}
	
	int sizeX = 64;
	int sizeY = 64;
	
	public void tick() {
		x+= velX;
		y += velY;
		
		if(y <= 0 || y >= GameMain.HEIGHT - 100) {
			velY *= -1;
			
			handler.addObject(new Bullets(50,50,ID.Bullet, handler));
			
		}
		if(x <= 0 || x >= GameMain.WIDTH - 100) { velX *= -1;}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, sizeX, sizeY);
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, sizeX, sizeY);
	}

}
