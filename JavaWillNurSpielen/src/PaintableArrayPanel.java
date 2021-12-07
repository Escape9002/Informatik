import java.util.ArrayList;
import java.util.List;

import util.ShowInFrame;

public class PaintableArrayPanel extends SizedPanel {

	Paintable[] ps;
	
	public PaintableArrayPanel(Paintable[] pa) {ps=pa;}
	
	public void paintComponent(java.awt.Graphics g) {
		for (Paintable p:ps) p.paintTo(g);
	} 
	
	public static void main(String[] args) {
		Paintable pa[] = {new PaintableOval(100,50,30,50), new PaintableOval(100,50,130,150)};
				
		ShowInFrame.show("OvaleArray", new PaintableArrayPanel(pa));
		
	}

}
