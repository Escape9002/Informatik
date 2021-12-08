import javax.swing.*;
import java.awt.event.*;
import util.ShowInFrame;

public class SimpleAnimation extends MovablePanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Timer t =new Timer(30, new ActionListener() {
		public void actionPerformed(ActionEvent e) {doOnTick();}
	});
	
	SimpleAnimation(){t.start();}
	
	
	public static void main(String[] args) {
		MovablePanel p = new SimpleAnimation();
		p.gos.add(new MovableImage("hexe.png",0,0,1,1));
		p.gos.add(new MovableImage("biene.png",400,400,-1,-1));
		ShowInFrame.show(p);

	}

}