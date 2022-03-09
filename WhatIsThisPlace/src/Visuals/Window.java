package Visuals;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GameMain.GameMain;

public class Window extends Canvas {
	private static final long serialVersionUID = 1L;
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	
	public Window (int width, int height, String title, GameMain GameMain) {
		frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(GameMain);
		frame.setVisible(true);
		
		GameMain.start();
	}
}
