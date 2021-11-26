package com.Antonio.JavaWillSpielen;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.Antonio.util.ShowInFrame;

public class PaintableImage extends JPanel implements Paintable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyImage mi;
	
	public PaintableImage(MyImage mi) {
		this.mi = mi;
	}
	
	public PaintableImage(String name) {
		this.mi = new MyImage(name);
	}
	
	public void paintTo(Graphics g) {
		g.drawImage(mi.get(), 0, 0,this);
	}
	
	public static void main(String [] args) {
		PaintableImage pi = new PaintableImage("biene.png");
//		PaintableImage pi2 = new PaintableImage("mage0001.png");
		System.out.println(pi.mi.get().getHeight(pi));
//		System.out.println(pi.mi.get().getHeight(pi2));
		ShowInFrame.show(new PaintablePanel(pi));
//		ShowInFrame.show(new PaintablePanel(pi2));
	}

}
