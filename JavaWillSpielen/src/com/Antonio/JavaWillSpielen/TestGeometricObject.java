package com.Antonio.JavaWillSpielen;

public class TestGeometricObject {

	Vertex v1 = new Vertex(1,1);
	GeometricObject geoObj1 = new GeometricObject(1,1,v1);
	GeometricObject geoObj2 = new GeometricObject(2,2);
	GeometricObject geoObj3 = new GeometricObject(3);
	
	public String test() {
		return geoObj1.toString() + " | " +
		geoObj2.toString() + " | " +
		geoObj3.toString();
	}
}
