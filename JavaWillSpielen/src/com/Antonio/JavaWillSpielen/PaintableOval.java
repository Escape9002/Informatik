package com.Antonio.JavaWillSpielen;

import java.awt.Graphics;

public class PaintableOval extends SimpleOval implements Paintable{

	public PaintableOval (double width, double height, double x, double y) {
		super (width, height, x,y);
	}

	public void paintTo(Graphics g) {
		g.fillOval((int) pos.x, (int) pos.y, (int) width, (int) height);
	}
}
