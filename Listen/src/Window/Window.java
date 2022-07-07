package Window;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import mainPackage.sortVisual;

public class Window extends Canvas {
private static final long serialVersionUID = 1L;
	
	public Window (int width, int height, String title, Draw Mains) {
		/*
		 * erzuge Fenster, 
		 * pull focus, 
		 * not resizable,
		 * center,
		 * add GameMain (diese Klasse rendered alle Befehle auf dieses Fenster),
		 * visible = true,
		 * start
		 */
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(Mains);
		frame.setVisible(true);
		Mains.start();
	}
}
