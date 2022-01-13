import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowHandler extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WindowHandler(MouseHandler mouse, KeyHandler key) {

		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setSize(500,300);
		jf.setVisible(true);
		
		jf.addMouseListener(mouse);
		jf.addKeyListener(key);
		
	}
	
}
