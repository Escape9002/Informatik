package com.Antonio.util;

import java.util.Random;

import javax.swing.JFrame;

public class JFrameTest {

	 
	 
	public static void main(String[] args) {
		Random r = new Random();
	
		String[] text = {"Fuck ads", "Die Korrupten werden brennen und die Genossen auf ihrer Asche tanzen!"};
		JFrame f = new JFrame( text[r.nextInt(2)] );
//		JFrame f = new JFrame("Ich hab Recht(eck)");
		
		f.add(new FirstPanel());
		f.pack();
		f.setVisible(true);
	}

}
