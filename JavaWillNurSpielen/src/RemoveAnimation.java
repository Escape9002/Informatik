import java.util.LinkedList;
import java.util.List;

import util.ShowInFrame;

public class RemoveAnimation extends AnimationPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doChecks() {
		List<GameObject> toRemove = new LinkedList<GameObject>();
		for (GameObject g1 : gos) {
			for (GameObject g2 : gos) {
				if (g1 != g2 && g1.touches(g2)) {
					if (g1.isLargerThan(g2)) {
						toRemove.add(g2);
					} else {
						toRemove.add(g1);
					}
				}
				
			}

		}
		System.out.println(toRemove);

		gos.removeAll(toRemove);
	}

	public static void main(String[] args) {
		MovablePanel p = new RemoveAnimation();
		p.gos.add(new MovableImage("hexe.png", -200, -200, 1, 1));
		p.gos.add(new MovableImage("biene.png", 400, 400, -1, -1));
		ShowInFrame.show(p);

	}
}
