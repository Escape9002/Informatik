import java.awt.Color;

public class PaintableOval extends SimpleOval implements Paintable {

	public PaintableOval(double width, double height, double x, double y, Color color) {
		super(width, height,new Vertex(x,y), color);
	}
	
	public PaintableOval(double width, double height, double x, double y) {
		this(width, height, x, y, new Color(0,0,0));
	}
	
	public void paintTo(java.awt.Graphics g) {
		g.fillOval((int)pos.x,(int)pos.y,(int)width, (int)height);
	}
	
}
