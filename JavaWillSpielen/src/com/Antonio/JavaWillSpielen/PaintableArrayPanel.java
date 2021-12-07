package com.Antonio.JavaWillSpielen;

import java.awt.Graphics;

public class PaintableArrayPanel extends SizedPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Paintable[] ps;

	public PaintableArrayPanel(Paintable[] pa) {
		ps = pa;
	}

	public void paintComponent(Graphics g) {
		for (Paintable p : ps)
			p.paintTo(g);
	}

	public static void main(String[] args) {

	}

}
