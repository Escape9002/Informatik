package com.Antonio.JavaWillSpielen;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class MovablePanel extends SizedPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	List<GameObject> gos = new ArrayList<GameObject>();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (GameObject go : gos)
			go.paintTo(g);
	}

	public void move() {
		for (GameObject go : gos)
			go.move();
	}

	public void doOnTick() {
		move();
		repaint();
	}

}
