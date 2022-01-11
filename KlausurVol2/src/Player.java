import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Player extends JPanel{
	
	String name = " ";
	
	public Player(String name, Languages setting) {
		this.name = name;
		setting.greeting(name);
	}
	
	public Player(String name, Setting setting) {
		this.name = name;
		setting.greeting(name);
	}
	
	 Player(String name, randombullshitClass setting) {
		this.name = name;
		setting.greeting(name);
		
		addMouseListener(
				new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
					}
				}
				
				);
	}
}
