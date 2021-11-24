package com.Antonio.JavaWillSpielen;

import java.awt.Color;

public class SimpleRectangle extends GeometricObject {
	public SimpleRectangle(double w, double h, Vertex pos, Color color) {
		super(w, h, pos, color);
	}
	public SimpleRectangle(double w, double h, Vertex pos) {
		super(w, h, pos, new Color(0,0,0));
	}

	public SimpleRectangle(double w, double h, double x, double y) {
		super(w, h, new Vertex(x, y), new Color(0,0,0));
	}
	
	public SimpleRectangle(double w, double h, double x, double y, Color color) {
		super(w, h, new Vertex(x, y), color);
	}

	public double area() {
		return width * height ;
	}

	public String toString() {
		return "SimpleRectangle (" + super.toString() + ")";
	}
	
	public boolean equals(Object that) {
		return (that instanceof SimpleRectangle) && super.equals(that);
	}
}
