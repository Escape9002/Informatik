import util.ShowInFrame;

public class AnimationPanel extends SimpleAnimation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	@Override
	public void doOnTick() {
		move();
		doChecks();
		repaint();
	}

	public void doChecks() {
		for (GameObject g1 : gos) {
			for (GameObject g2 : gos) {

				if (g1 != g2 && g1.touches(g2)) {
					reactWhenTouching(g1, g2);
					System.out.println("r/woooosh");
				}
			}
		}
	}

	void reactWhenTouching(GameObject g1, GameObject g2) {
		g1.turn();
		g1.move();
		
		g2.turn();
		g2.move();
	}

	public static void main(String[] args) {
		MovablePanel p = new AnimationPanel();
		p.gos.add(new MovableImage("hexe.png", -200, -200, 1, 1));
		p.gos.add(new MovableImage("biene.png", 400, 400, -1, -1));
		ShowInFrame.show(p);

	}

}
