import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class KeyHandler extends JPanel {
	public KeyHandler() {
		addKeyListener(new KeyAdapter() {
			public void onPressedKey(KeyEvent e) {
				System.out.println(e.getKeyChar());
			}
		});
	}
}
