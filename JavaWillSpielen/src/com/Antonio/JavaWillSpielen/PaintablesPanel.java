package com.Antonio.JavaWillSpielen;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.Antonio.util.ShowInFrame;

public class PaintablesPanel extends SizedPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<Paintable> pas;
	public PaintablesPanel(List<Paintable> pas) {
		this.pas = pas;
	}
	
	public void paintComponent(Graphics g) {
		for(Paintable pa:pas) {
			pa.paintTo(g);
		}
	}
	
	public static void main(String[] agrs) {
		List<Paintable> ps = new ArrayList<Paintable>();
		
		ps.add(new PaintableOval(100,50,30,50));
		ps.add(new PaintableRectangle(100,50,60,100));
		
		ShowInFrame.show("Oval and Rect", new PaintablesPanel(ps));
	}
	
}
