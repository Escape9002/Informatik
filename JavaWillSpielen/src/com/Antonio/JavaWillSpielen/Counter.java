package com.Antonio.JavaWillSpielen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import com.Antonio.util.ShowInFrame;

public class Counter extends SimpleButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int i = 0;
	
	public Counter() {

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				l.setText("" + i);
			}
			
		});

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				i++;
				l.setText("" + i);
			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				i = 0;
				l.setText("" + i);
			}
		});

		// l.setText("" + i); why this line not working???

	}
	

	public static void main(String[] args) {
		ShowInFrame.show(new Counter());
	}
}
