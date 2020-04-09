package Model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.util.Random;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class Sun extends Star{

	public Sun(double x, double y, double r, String n) {
		super(x, y, r, n, 0);
		xLeft = xLeft/2;
		yTop = yTop/2;
	}
	
	public void draw(Graphics2D g2, double n){

		Ellipse2D.Double circle = new Ellipse2D.Double(xLeft, yTop, diameter, diameter);
		g2.setColor(color);			
		g2.fill(circle);
		g2.setColor(new Color(205, 0, 0));
		Ellipse2D.Double p1 = new Ellipse2D.Double(xLeft+5, yTop+5, 90, 90);
		g2.fill(p1);
		g2.setColor(new Color(238, 0, 0));
		Ellipse2D.Double p2 = new Ellipse2D.Double(xLeft+10, yTop+10, 80, 80);
		g2.fill(p2);
		g2.setColor(new Color(255, 0, 0));
		Ellipse2D.Double p3 = new Ellipse2D.Double(xLeft+15, yTop+15, 70, 70);
		g2.fill(p3);
		g2.setColor(new Color(255, 55, 0));
		Ellipse2D.Double p4 = new Ellipse2D.Double(xLeft+20, yTop+20, 60, 60);
		g2.fill(p4);
		g2.setColor(new Color(238, 64, 0));
		Ellipse2D.Double p5 = new Ellipse2D.Double(xLeft+25, yTop+25, 50, 50);
		g2.fill(p5);
		g2.setColor(new Color(255, 69, 0));
		Ellipse2D.Double p6 = new Ellipse2D.Double(xLeft+30, yTop+30, 40, 40);
		g2.fill(p6);
		g2.setColor(new Color(238, 118, 0));
		Ellipse2D.Double p7 = new Ellipse2D.Double(xLeft+35, yTop+35, 30, 30);
		g2.fill(p7);
		g2.setColor(new Color(255, 127, 0));
		Ellipse2D.Double p8 = new Ellipse2D.Double(xLeft+40, yTop+40, 20, 20);
		g2.fill(p8);
		g2.setColor(new Color(255, 140, 0));
		Ellipse2D.Double p9 = new Ellipse2D.Double(xLeft+45, yTop+45, 10, 10);
		g2.fill(p9);

	}
}
