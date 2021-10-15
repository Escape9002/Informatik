package com.Antonio.JavaWillSpielen;

public class TestVertex {

	public static void main(String[] args) {
		GeometricObject o1 = new GeometricObject(17, 4, new Vertex(42, 23));
		GeometricObject o2 = new GeometricObject(17, 4);
		GeometricObject o3 = new GeometricObject(17);
		GeometricObject o4 = new GeometricObject();

		SimpleOval ov1 = new SimpleOval(17,4,new Vertex(42,23));
		SimpleRectangle rect1 = new SimpleRectangle (17,4,new Vertex(42,23));
		SimpleRectangle rect2 = new SimpleRectangle (17,4,new Vertex(42,23));
		
//		System.out.println(o1.equals(o2));
//		o2.moveTo(42, 23);
//		System.out.println(o1.equals(o2));
//		System.out.println(o3.contains(new Vertex(10, 3)));
//		System.out.println(o4);
		
		System.out.println(ov1);
		System.out.println(rect1.equals(rect2));
		
	}

}
