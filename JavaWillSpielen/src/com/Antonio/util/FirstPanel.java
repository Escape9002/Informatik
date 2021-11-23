package com.Antonio.util;

import java.awt.Color;

import javax.swing.JPanel;

public class FirstPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(java.awt.Graphics g) {
		g.setColor(Color.red);
		g.drawRect(30, 50, 45, 80);
		
		g.setColor(Color.cyan);
		g.fillRect(30, 50, 45, 80);
		
		g.setColor(Color.green);
		g.drawString("Hello there", 90, 90);
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
