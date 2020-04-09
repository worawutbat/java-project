package Model.other;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class StarBG {

		private double width;
		private double height;
		
		public StarBG(){		
			int x = (int) (Math.random() * 1000);
			width =  (Math.random()) * x;			
			height =  (Math.random())* x;
		}
		
		public void generate(Graphics2D g2){				
			Ellipse2D.Double miniStar= new Ellipse2D.Double(width, height, 2, 2);
			g2.setColor(Color.white);
			g2.fill(miniStar);		
		}
	}

