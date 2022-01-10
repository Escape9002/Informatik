import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Player {
	
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
						final Vertex delta = new Vertex(e.getX(), e.getY());
						delta.addMod(controlled.getPos().skalarMult(-1));
						
						delta.addMod(new Vertex (-controlled.getWidth() /2 , -controlled.getHeight()/2));
						
						final double factor = controlled.getDeltaPos().length() / delta.length();
						delta.skalarMultMod(factor );
						
						controlled.setDeltaPos(delta);
						
						
					}
				}
				
				);
	}
}
