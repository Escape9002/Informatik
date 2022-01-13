import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MouseHandler extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MouseHandler() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX());
			}
		});
	}
	

}
