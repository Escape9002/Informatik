package com.Antonio.JavaWillSpielen;

import java.awt.Color;
import java.awt.Graphics;

import com.Antonio.util.ShowInFrame;

public class PaintablePanel extends SizedPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Paintable pa;

	public PaintablePanel(Paintable pa) {
		this.pa = pa;
	}

	public void paintComponent(Graphics g) {
		pa.paintTo(g);
	}

	public static void main (String [] args) {
		ShowInFrame.show(new PaintablePanel(new PaintableOval(100,50,30,50, Color.red)));
		ShowInFrame.show(new PaintablePanel(new PaintableOval(10,10,130,40, Color.green)));
		
		ShowInFrame.show(new PaintablePanel(new PaintableRectangle(20,90,30,30, Color.blue)));
	}

}
