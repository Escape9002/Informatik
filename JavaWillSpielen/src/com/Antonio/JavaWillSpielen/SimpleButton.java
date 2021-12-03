package com.Antonio.JavaWillSpielen;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.Antonio.util.ShowInFrame;


public class SimpleButton extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton b = new JButton ("-");
	JLabel l = new JLabel ("000");
	
	JButton b1 = new JButton ("+");
	
	
	JButton b2 = new JButton ("Helpdklf öognhzulfgvbuk");
	
	
	SimpleButton(){	
		add(l);
		add(b);
		
		
		add(b1);
		
		add(b2);
		
	}

	public static void main(String [] args) {
		ShowInFrame.show(new SimpleButton());
	}
}
