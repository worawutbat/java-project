package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;

import javax.swing.Timer;

/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class Saturn extends Star{

	public Saturn(double x, double y, double r, String n, int s) {
		super(x, y, r, n, s);
	}
	public void draw(Graphics2D g2, double n){	
		
		super.draw(g2, n);
		g2.setColor(new Color(255, 236, 139));
		g2.setStroke(new BasicStroke(5));	
		Ellipse2D.Double ring = new Ellipse2D.Double(x-7, y, 45,20);	
		g2.setStroke(new BasicStroke(4));
		g2.draw(ring);
			
	}
}
