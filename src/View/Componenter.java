package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.crypto.Cipher;
import javax.swing.JComponent;
import javax.swing.Timer;

import Controller.Controller;
import Model.Earth;
import Model.Jupiter;
import Model.Mars;
import Model.Saturn;
import Model.Star;
import Model.Sun;
import Model.other.CircleLine;
import Model.other.Space;
import Model.other.StarBG;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class Componenter extends JComponent {
	
	private Controller controller;
	
	public Componenter(){
		setSize(600, 600);
		controller = new Controller();
		controller.setSpace(getWidth(), getHeight());
	}
	
//	public void setDrawStar(String key, boolean b) {
//		controller.getMap().get(key).setDraw(b);
//	}
//	
//	public Star getStar(String key) {
//		return controller.getMap().get(key);	
//	}	
//	
//	public void setAddSpeed() {
//		for (int i = 0; i<controller.getArray().size()-1; i++){
//			controller.getArray().get(i).addSpeed();
//		}
//	}
//	
//	public void setDeSpeed() {
//		for (int i = 0; i<controller.getArray().size()-1; i++){
//			controller.getArray().get(i).deSpeed();
//		}
//	}
//	public void setStop() {
//		for (int i = 0; i<controller.getArray().size()-1; i++){
//			controller.getArray().get(i).stop();
//		}
//	}
//	
//	public void setDrawLine(boolean b) {
//		controller.getLine().drawLine(b);
//	}
	
	public Controller getController() {
		return controller;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		controller.paintSpace(g2);
		controller.drawStarBG(g2);
		controller.drawCircleLine(g2);
		controller.drawStars(g2);
		
		repaint();	
	}
}

