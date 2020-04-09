package Model.other;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class Space {
	private int width;
	private int height;
	
	public Space(double width2, double height2){
		width = (int) width2;
		height = (int) height2;
	}
	
	public void draw(Graphics2D g2){
		Rectangle rec = new Rectangle(0, 0, width, height);
		g2.setColor(Color.BLACK);
		g2.fill(rec);	
		
	}
}
