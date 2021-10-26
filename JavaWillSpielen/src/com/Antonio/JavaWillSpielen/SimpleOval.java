package com.Antonio.JavaWillSpielen;

public class SimpleOval extends GeometricObject {

	public SimpleOval(double w, double h, Vertex pos) {
		super(w, h, pos);
	}

	public SimpleOval(double w, double h, double x, double y) {
		super(w, h, new Vertex(x, y));
	}

	public double area() {
		return Math.PI * width * height / 4;
	}

	public String toString() {
		return "SimpleOval (" + super.toString() + ")";
	}
	
	public boolean equals(Object that) {
		return (that instanceof SimpleOval) && super.equals(that);
	}
	
	

}