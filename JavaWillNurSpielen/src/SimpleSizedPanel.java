import javax.swing.*;
import util.ShowInFrame;
public class SimpleSizedPanel extends SizedPanel {

	public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30,50,45,80);
		g.fillOval(40, 60, 90, 30);
	}
	
	public static void main(String[] args) {
		ShowInFrame.show("Erstes Rechteck", new SimpleSizedPanel());

	}

}
