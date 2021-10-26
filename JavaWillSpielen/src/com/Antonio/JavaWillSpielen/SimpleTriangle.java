package com.Antonio.JavaWillSpielen;

public class SimpleTriangle extends GeometricObject{
	public SimpleTriangle(double w, double h, Vertex pos) {
		super(w, h, pos);
	}

	public SimpleTriangle(double w, double h, double x, double y) {
		super(w, h, new Vertex(x, y));
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
