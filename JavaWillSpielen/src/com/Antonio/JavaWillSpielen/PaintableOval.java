package com.Antonio.JavaWillSpielen;

import java.awt.Color;
import java.awt.Graphics;

public class PaintableOval extends SimpleOval implements Paintable{

	public PaintableOval (double width, double height, double x, double y, Color color) {
		super (width, height, x,y, color);
	}

	public void paintTo(Graphics g) {
		g.setColor(color);
		g.fillOval((int) pos.x, (int) pos.y, (int) width, (int) height);
	}
}
