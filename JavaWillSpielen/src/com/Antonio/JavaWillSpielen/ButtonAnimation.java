package com.Antonio.JavaWillSpielen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.Antonio.util.ShowInFrame;

public class ButtonAnimation extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton b = new JButton("Push to move");
	MovablePanel mp = new MovablePanel();

	ButtonAnimation() {
		add(mp);
		add(b);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.doOnTick();
			}
		});
	}

	public static void main(String[] args) {
		ButtonAnimation p = new ButtonAnimation();
		p.mp.gos.add(new MovableImage("biene.png", 400, 200, 1, 1));
		p.mp.gos.add(new MovableImage("bat.png", 200, 200, -1, -1));
		ShowInFrame.show(p);
	}

}
