package com.Antonio.JavaWillSpielen;

import javax.swing.ImageIcon;

public class MovableImage extends GeometricImage implements GameObject {

	public Vertex deltaPos = new Vertex(0, 0);

	public void setDeltaPos(Vertex v) {
		deltaPos = v;
	}

	public MovableImage(String name, double x, double y) {
		super(name, x, y);
	}
	
	public MovableImage(String name, double x, double y, double dX, double dY) {
		super(name, x, y);
		deltaPos = new Vertex(dX, dY);
	}
	
	public MovableImage(ImageIcon icon, double x, double y, double dX, double dY) {
		super(icon, x, y);
		deltaPos = new Vertex(dX, dY);
	}
	

	@Override
	public void move() {
		pos.addMod(deltaPos);
		
	}

	@Override
	public void turn() {
		deltaPos.skalarMultMod(-1);
	}

	@Override
	public Vertex getDeltaPos(Vertex v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLargerThan(GameObject that) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeftOf(GameObject that) {		
		return this.getPos().x+this.getWidth() < that.getPos().x;
	}

	@Override
	public boolean isAbove(GameObject that) {
		
		return this.getPos().y+this.getHeight() < that.getPos().y;
	}

	@Override
	public boolean touches(GameObject that) {
		// TODO Auto-generated method stub
		return false;
	}

}