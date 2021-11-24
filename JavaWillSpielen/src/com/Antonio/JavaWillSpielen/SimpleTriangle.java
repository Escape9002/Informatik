package com.Antonio.JavaWillSpielen;

import java.awt.Color;

public class SimpleTriangle extends GeometricObject{
	public SimpleTriangle(double w, double h, Vertex pos, Color color) {
		super(w, h, pos, color);
	}
	
	public SimpleTriangle(double w, double h, Vertex pos) {
		super(w, h, pos, new Color(0,0,0));
	}

	public SimpleTriangle(double w, double h, double x, double y) {
		super(w, h, new Vertex(x, y), new Color (0,0,0));
	}
	
	public SimpleTriangle(double w, double h, double x, double y, Color color) {
		super(w, h, new Vertex(x, y), color);
	}


	public double area() {
		return  (width / 2) * height;
	}


	public String toString() {
		return "SimpleTriangle (" + super.toString() + ")";
	}
	
	public boolean equals(Object that) {
		return (that instanceof SimpleTriangle) && super.equals(that);
	}
	
	

}
