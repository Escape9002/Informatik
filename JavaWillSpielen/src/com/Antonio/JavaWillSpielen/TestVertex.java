package com.Antonio.JavaWillSpielen;

public class TestVertex {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(12, 30);
		Vertex v2 = new Vertex(1, 1);
//		Vertex v3 = v1.skalarMult(42.0);

		
		System.out.println(v1);
		
		System.out.println(v1.skalarMult(2.0));
		System.out.println(v1);
		
		v1.skalarMultMod(2.0);
		System.out.println(v1);
		
		System.out.println(v1.add(v2));
		System.out.println(v1);
		
		v1.addMod(v2);
		System.out.println(v1);
		
	}

}
