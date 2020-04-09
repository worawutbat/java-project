package Model.other;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class CircleLine {
	private boolean condition = true;
	/**
	 * set circle to appear or disappear
	 * @param b
	 */
	public void drawLine(boolean b) {
		condition = b;
	}
	
	public void draw(Graphics2D g2){
		
		if (condition){
			g2.drawOval(242, 242, 115, 115);
			g2.drawOval(215, 215, 170, 170);
			g2.drawOval(180, 180, 235, 235);
			g2.drawOval(152, 152, 295, 295);
			g2.drawOval(125, 125, 350, 350);
			g2.drawOval(80, 80, 440, 440);
			g2.drawOval(40, 40, 520, 520);
			g2.drawOval(13, 13, 575, 575);
		}
	}
}
