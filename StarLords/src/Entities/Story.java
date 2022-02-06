package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import Visuals.HUD;
import Visuals.Handler;

public class Story extends GameObject{
	
	Handler handler;
	HUD hud;
	

	
	public Story(float x, float y, ID id, Handler handler, HUD hud) {
		super(x,y,id);
		
		this.hud = hud;
		this.handler = handler;
	}

	@Override
	public void tick() {

		
	}

	@Override
	public void render(Graphics g) {
		if(status(1,150)) {
			hud.speaking = true;
			
			g.setColor(Color.red);
			g.drawString("Hello there, I welcome you to this new...", 150,50);
			g.drawString("ETERNITY", 200, 100);
			g.drawString("Let's see wether you shall take part in this story or not.", 150, 150);
			
		}else if(status(250,350)) {
			g.setColor(Color.red);
			g.drawString("...", 250,50);
			
		}else if(status(350,450)) {
			g.setColor(Color.red);
			g.drawString("These damn minions", 250, 50);
			
		}else {
			hud.speaking = false;
		}
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean status(int low, int high) {
		if(hud.getScore()>=low && hud.getScore() <=high) {
			return true;
		}else {
			return false;
		}
	}
	

}
