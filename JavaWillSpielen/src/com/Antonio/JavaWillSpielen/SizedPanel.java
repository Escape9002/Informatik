package com.Antonio.JavaWillSpielen;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

import com.Antonio.util.ShowInFrame;

public class SizedPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	int preferredWidth = 400;
	int preferredHeight = 300;

//	int preferredWidth = screenSize.width;
//	int preferredHeight = screenSize.height;

	public SizedPanel(int w, int h) {
		preferredWidth = w;
		preferredHeight = h;
	}

	public SizedPanel() {
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(preferredWidth, preferredHeight);
	}

	public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30, 50, 45, 80);
	}
	/*
	 * public static void main (String [] args) { ShowInFrame.show("Hello there",
	 * new SizedPanel());
	 * 
	 * }
	 */
}
