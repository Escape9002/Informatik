package com.Antonio.JavaWillSpielen;

public class Vertex {

	public double x;
	public double y;

	public Vertex(double xx, double yy) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "X: " + x + " | "+ "Y: " + y;

	}
	
	public String addCoordsOne() {
		return x + y + ": X and Y";
	}
	
	public String addCoordsTwo() {
		return "X and Y" + x + y ;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

}