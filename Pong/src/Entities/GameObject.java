package Entities;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {

	protected float x, y;	// POS-Vvar
	protected ID id;	// Typus
	protected float velX, velY;	// Geschw.-Var
	
	public GameObject(float x, float y, ID id) {
		/*
		 * Mitgabe-Werte einlesen
		 */
		this.x = x;	
		this.y = y;
		this.id = id;
	}
	
	/*
	 * Stellt bereit: 
	 * .tick
	 * .render
	 * .getBounds
	 * 
	 * sowie verschiedene Getter und Setter fuer POS und Typus
	 * 
	 */
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	public void setX(float x) {
		this.x = x;	
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public  float getX() {
		return x;
	}
		
	public float getY() {
		return y;
	}
	
	public void setID(ID id) {
		this.id = id;
	}
	
	public ID getId() {
		return id;
	}
	
	public void setVelX(float velX) {
		this.velX = velX;
	}
	
	public void setVelY(float velY) {
		this.velY = velY;
	}
	
	public float getVelX() {
		return velX;
	}
	
	public float getVelY() {
		return velY;
	}
	
}

