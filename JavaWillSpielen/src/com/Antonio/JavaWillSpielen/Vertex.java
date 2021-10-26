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

	public Vertex add(Vertex vertex) {
		return new Vertex(x + vertex.x, y + vertex.y);
	}

	public Vertex sub(Vertex vertex) {
		return new Vertex(x - vertex.x, y - vertex.y);
	}

	public double distance(Vertex vertex) {
		double x = vertex.x - this.x;
		double y = vertex.y - this.y;
		return Math.sqrt(x * x + y * y);
	}

	public void normalize() {
		double factor = this.length();
		this.x = x/factor;
		this.y= y/factor;
	}

	public void addMod(Vertex vertex) {
		x = x + vertex.x;
		y = y + vertex.y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double setX(double x) {
		return this.x = x;
	}

	public double setY(double y) {
		return this.y = y;
	}

	public boolean equals(Object thatObject) {
		if (thatObject instanceof Vertex) {
			Vertex that = (Vertex) thatObject;
			return this.x == that.x && this.y == that.y;
		}
		return false;

	}

}