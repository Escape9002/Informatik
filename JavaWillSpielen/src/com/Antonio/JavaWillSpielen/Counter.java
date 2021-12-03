package com.Antonio.JavaWillSpielen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				i++;
			}
		});
		{// Empty
		}

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				i--;
			}
		});
		{// Empty
		}

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				i = 0;
			}
		});
		{// Empty
		}

		l.setText("" + i);

	}

	public static void main(String[] args) {
		ShowInFrame.show(new Counter());
	}
}
