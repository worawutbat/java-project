package Model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class Earth extends Star{

	public Earth(double x, double y, double r, String n, int s) {
		super(x, y, r, n, s);
	}
	
	public void draw(Graphics2D g2, double n){		
		super.draw(g2, n);
		g2.setColor(new Color(118, 238, 0));
		Polygon map1 = new Polygon();
		map1.addPoint(x, y+15);
		map1.addPoint(x+8, y+22);
		map1.addPoint(x+5, y+30);
		g2.fill(map1);
		Polygon map2 = new Polygon();
		map2.addPoint(x+15, y+2);
		map2.addPoint(x+20, y+8);
		map2.addPoint(x+18, y+15);
		map2.addPoint(x+33, y+18);
		map2.addPoint(x+30, y+12);
		g2.fill(map2);
		Polygon map3 = new Polygon();
		map3.addPoint(x+11, y+18);
		map3.addPoint(x+13, y+25);
		map3.addPoint(x+16, y+14);
		map3.addPoint(x+25, y+15);
		map3.addPoint(x+25, y+29);
		map3.addPoint(x+29, y+22);
		g2.fill(map3);
	}
}
