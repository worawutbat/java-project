package Model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class Jupiter extends Star{

	public Jupiter(double x, double y, double r, String n, int speed) {
		super(x, y, r, n, speed);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics2D g2, double n) {
		super.draw(g2, n);
		g2.setColor(new Color(139, 115, 85));
		Ellipse2D.Double p1 = new Ellipse2D.Double(x+diameter/2, y+diameter/2, 4, 4);
		g2.fill(p1);
		g2.setColor(new Color(139, 115, 85));
		Ellipse2D.Double p2 = new Ellipse2D.Double(x+10, y+4, 5, 5);
		g2.fill(p2);
		g2.setColor(new Color(139, 115, 85));
		Ellipse2D.Double p3 = new Ellipse2D.Double(x+3, y+11, 4, 4);
		g2.fill(p3);
		g2.setColor(new Color(139, 115, 85));
		Ellipse2D.Double p4 = new Ellipse2D.Double(x+2, y+7, 6, 6);
		g2.fill(p4);
	}
}
