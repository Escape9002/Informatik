package com.Antonio.JavaWillSpielen;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import com.Antonio.util.ShowInFrame;

public class GeometricImage extends GeometricObject implements Paintable {

	ImageIcon icon;

	public GeometricImage(String filename, double x, double y) {
		super (new Vertex(x,y));
		icon = new ImageIcon(getClass().getClassLoader().getResource(filename));
		init();
	}
	
	public GeometricImage(ImageIcon icon, double x, double y) {
		super(new Vertex(x,y));
		this.icon = icon;
		init();
	}
	
	void init() {
		width = icon.getImage().getWidth(icon.getImageObserver());
		height = icon.getImage().getHeight(icon.getImageObserver());
	}
	
	public void paintTo(Graphics g) {
		icon.paintIcon(null, g, (int) pos.x, (int) pos.y);
	}
	
	public static void main(String [] args) {
		 GeometricImage gi = new GeometricImage("biene.png",10,10);
//		 GeometricImage gi2 = new GeometricImage("res/mage.png",10,10); // still not working =///////
		 GeometricImage gi3 = new GeometricImage("bat.png",10,10);
		 
		 System.out.println(gi.width);
		 System.out.println(gi.height);
		 
//		 System.out.println(gi2.width);
//		 System.out.println(gi2.height);
		 
		 System.out.println(gi3.width);
		 System.out.println(gi3.height);
		 
		 ShowInFrame.show(new PaintablePanel(gi));
		 
//		 ShowInFrame.show(new PaintablePanel(gi2));
		 ShowInFrame.show(new PaintablePanel(gi3));
	}
		 
	
}
