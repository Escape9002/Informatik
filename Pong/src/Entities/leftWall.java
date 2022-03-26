package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import Visuals.*;
import GameMain.GameMain;

public class leftWall extends GameObject{
	
	private int width = 16;	// Groese
	private int height = 48;	// Groese

	public leftWall(float x, float y, ID id) {
		super(x, y, id);	//verweise auf GameObject
	}
	
	public void tick() {
		x += velX;	// alte Position + Geschwindigkeit == neue POS
		y += velY;	// alte Position + Geschwindigkeit == neue POS
		
		// Spieler kann nicht aus dem Fenster eingestellter Groese heraus, zu grose/kleine X || y Werte werden angepasst	
		x = GameMain.clamp((int)x, 0, GameMain.WIDTH- 50);
		y = GameMain.clamp((int)y, 0, GameMain.HEIGHT- 70);
		
		
	}
	
	
	public void render(Graphics g) {
		/*
		 * darstellung
		 */
		g.setColor(Color.GREEN);
		g.fillRect((int)x, (int)y, width, height);
		
	}

	public Rectangle getBounds() {
		/*
		 * HitBox über POS und Groese bestimmen und zurueck geben
		 */
		return new Rectangle((int)x, (int)y, width, height);
	}
	

}
