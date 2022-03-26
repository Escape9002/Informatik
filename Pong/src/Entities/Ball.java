package Entities;
import GameMain.GameMain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import Visuals.HUD;
import Visuals.Handler;
import music.MusicPlayer;

public class Ball extends GameObject{

	private Handler handler;	// handler für Kollisions-Abfrage 
	private HUD hud;	// hud für Punktzahl
	private MusicPlayer player;	// Musik!
	
	
	private int sizeX = 32;	// Größe der HitBox des "Balles"
	private int sizeY = 32;	// Größe der HitBox des "Balles"
	
	private int startX= 0;	// speichert ersten Startpunkt des "Balles" ab, somit immer in der Mitte
	private int startY= 0;	// speichert ersten Startpunkt des "Balles" ab, somit immer in der Mitte
	
	private boolean state = false;	// kollision zwischen Player und Ball
	
	
	public Ball(int x, int y, ID id, Handler handler, HUD hud) {
		super(x, y, id);	// verweise auf GameObject.java, Koordinaten und Typus mitgeben
		
		player = new MusicPlayer();	// Musik!
		
		startX = x;
		startY = y;
		
		this.handler = handler;
		this.hud = hud;
		
		velX = 2;	// setze Bewegungsgeschwindigkeit des "Balles"
		velY= 2;	// setze Bewegungsgeschwindigkeit des "Balles"
	}
	
	public Ball(int x, int y, ID id, Handler handler, HUD hud, int vel) {
		super(x, y, id);
		
		player = new MusicPlayer();
		
		startX = x;
		startY = y;
		
		this.handler = handler;
		this.hud = hud;
		
		velX = vel;
		velY= vel;
	}
	
	private void resetBall() {
		/*
		 * setze Ball auf Anfangspunkt und tausche die Bewegungsrichtung, damit beide Spieler abwechselend den ersten Ball erhalten
		 */
		x = startX;	
		y = startY;
		
		velX *= -1;
		velY *= -1;
	}
	
	public void tick() {
		/*
		 * Momentane Position mit Geschwindigkeit addieren == neue POS
		 * Abfrage, ob Ball die Wand berührt und bedingt weiterleitung auf resetBall()
		 * 
		 * Abfrage ob Player den Ball berührt.
		 */
		x+= velX;
		y += velY;
		
		if(y <= 0 || y >= GameMain.HEIGHT - 70)velY *= -1 ;
		if(x <= 0 ) {
			hud.setLost((byte) 2); 
			
			resetBall();
		}else if(x >= GameMain.WIDTH - 50) {
			hud.setLost((byte)1);
			resetBall();
		}else {
			hud.setLost((byte)0);
		}

		collision();
	}
	
	public void render(Graphics g) {
		/*
		 * Ball grafisch erzeugen
		 */
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, sizeX, sizeY);
	}

	public Rectangle getBounds() {
		/*
		 * Hitbox des "Balles" wird über POS und Größe berechnet und zurückgegeben 
		 */
		return new Rectangle((int)x, (int)y, sizeX, sizeY);
	}
	
	public void collision() {
		/*
		 * Abfrage aller Objekte auf Typus
		 * Wenn ID stimmt und noch kein anderes Objekt berührt wurde, Geschwindigkeit *-1 + Musik für HIT
		 * Wenn ID stimmt und kein andres Objekt berührt wird und dies auch noch nicht der Fall war, tue nichts
		 */
		for ( int i = 0; i< handler.object.size(); i++) {
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId()== ID.leftWall ){
				if(getBounds().intersects(tempObject.getBounds()) && state) {
					//collision code
					player.play("music/hit.wav");
					
					velX *= -1;
					state = false;
				}else if(!getBounds().intersects(tempObject.getBounds()) && !state) {
					state =true;
				}
				
			}else if(tempObject.getId()== ID.rightWall) {
				if(getBounds().intersects(tempObject.getBounds()) && state) {
					//collision code
					player.play("music/hit.wav");
					
					velX *= -1;
					state = false;
				}else if(!getBounds().intersects(tempObject.getBounds()) && !state) {
					state =true;
				}
			
			
			
		}
	}
}
}
