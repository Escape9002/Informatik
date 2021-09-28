package com.Antonio.JavaWillSpielen;

public class Vertex {

	public double x;
	public double y;

	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "X: " + x + " | " + "Y: " + y;

	}
	
	//--------------------------------------------page 46 OnGoing
	public double length() {
		return Math.sqrt(x * x + y * y);
	}

	public Vertex skalarMult(double s) {
		return new Vertex(x * s, y * s);
	}

	public void skalarMultMod(double s) {
		x = x * s;
		y = y * s;
	}

	public Vertex add(Vertex v2) {
		return new Vertex(x + v2.x, y + v2.y);
	}
	
	public void addMod(Vertex v3) {
		x  =x+v3.x;
		y  =y+v3.y;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double setX(double x) {
		return this.x  =x;
	}
	
	public double setY(double y) {
		return this.y = y;
	}

}