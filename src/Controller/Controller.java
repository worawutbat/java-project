package Controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;

import Model.Earth;
import Model.Jupiter;
import Model.Mars;
import Model.Saturn;
import Model.Star;
import Model.Sun;
import Model.other.CircleLine;
import Model.other.Space;
import Model.other.StarBG;
import View.Componenter;
import View.Viewer;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class Controller {

	private HashMap<String, Star> starsDic = new HashMap<String, Star>();
	private ArrayList<Star> stars = new ArrayList<Star>();
	private Star mercry, venus, uranus, neptune; //pluto;
	private Mars mars;
	private Jupiter jupiter;
	private Sun sun;
	private Earth earth;
	private Saturn saturn;
	private Space space;
	private CircleLine circleLine;	
	private StarBG[] starBG = new StarBG[500];
	private double[] ratio;
	
	/**
	 * set the space to put the star or another thing in space
	 * @param width  --> get a width of frame or panel
	 * @param height --> get a height of frame or panel
	 */
	public void setSpace(double width, double height) {
		ratio = new double[] {10, 7, 5, 4, 3.2, 2.6, 2.2, 2, 0};
		space = new Space(width, height);
		circleLine = new CircleLine();
		generateStarBG();
		generateStar(width, height);
		
		//add data 
		addDataToArrays();
		addDataToMap();
	}
	/**
	 * draw a mini star in space 
	 */
	private void generateStarBG() {
		for (int i = 0; i<starBG.length; i++){
			starBG[i] = new StarBG();		
		}
	}
	/**
	 * draw a star in space
	 * @param width  --> get width of frame or panel
	 * @param height --> get heigth of frame or panel
 	 */
	private void generateStar(double width, double height){
		
		sun =  new Sun(width, height, 100, "Sun");
		sun.setColor(new Color(198, 0, 0));
		
		mercry = new Star(width, height, 10, "Mercry", 85);
		mercry.setColor(new Color(156, 156, 156));
		
		venus = new Star(width, height, 25,"Venus", 87);
		venus.setColor(new Color(255, 127, 36));
		
		earth = new Earth(width, height, 35, "Earth", 89);
		earth.setColor(new Color(0, 134, 139));
		
		mars = new Mars(width, height, 20, "Mars", 91);
		mars.setColor(new Color(244, 164, 96));
	
		jupiter = new Jupiter(width, height, 35, "Jupiter", 93);
		jupiter.setColor(Color.gray);

		saturn = new Saturn(width, height, 30, "Saturn", 95);
		saturn.setColor(new Color(255 ,193 ,37));

		uranus = new Star(width, height, 30, "Uranus", 97);
		uranus.setColor(Color.CYAN);

		neptune = new Star(width, height, 20, "Neptune", 99); 
		neptune.setColor(Color.BLUE);
	}
	/**
	 * add data of stars to array lists
	 */
	private void addDataToArrays() {
		stars.add(mercry);
		stars.add(venus);
		stars.add(earth);
		stars.add(mars);
		stars.add(jupiter);
		stars.add(saturn);
		stars.add(uranus);
		stars.add(neptune);
		stars.add(sun);
	}
	/**
	 * add data of stars to HashMap by star's name and Star's Object
	 */
	private void addDataToMap() {
		for (int i = 0; i<stars.size(); i++){
			starsDic.put(stars.get(i).getName(), stars.get(i));
		}
	}
	/**
	 * set an Appearece of Star 
	 * @param key --> The star's name
	 * @param b   --> true or false
	 */
	public void setStarAppear(String key, boolean b) {
		starsDic.get(key).setAppear(b);
	}
	/**
	 * get a Star's object
	 * @param key --> The star's name
	 * @return
	 */
	public Star getStar(String key) {
		return starsDic.get(key);	
	}	
	/**
	 * set a Moveing of All stars to speed and forward
	 */
	public void setForward() {
		for (int i = 0; i<stars.size()-1; i++){
			stars.get(i).forward();
		}
	}
	/**
	 * set a Moveing of All stars to speed and backward
	 */
	public void setBackward() {
		for (int i = 0; i<stars.size()-1; i++){
			stars.get(i).backward();
		}
	}
	/**
	 * set a Moveing of All stars to stoped
	 */
	public void setStop() {
		for (int i = 0; i<stars.size()-1; i++){
			stars.get(i).stop();
		}
	}
	/**
	 * set a Crcle line to appear or disappear
	 * @param b
	 */
	public void setDrawLine(boolean b) {
		circleLine.drawLine(b);
	}
	
	/**
	 * draw the space at frame or panel
	 * @param g2
	 */
	public void paintSpace(Graphics2D g2) {
		space.draw(g2);
	}
	/**
	 * draw a mini star at spaec
	 * @param g2
	 */
	public void drawStarBG(Graphics2D g2) {
		for (StarBG i : starBG){
			i.generate(g2);
		}
	}
	/**
	 * draw the star at space
	 * @param g2
	 */
	public void drawStars(Graphics2D g2) {
		for (int i = 0; i<ratio.length; i++){
			Star star = stars.get(i);
			if (star.getAppear()){
				star.draw(g2, ratio[i]);
			}
		}
	}
	/**
	 * draw the circle line at space
	 * @param g2
	 */
	public void drawCircleLine(Graphics2D g2) {
		circleLine.draw(g2);
	}
	/**
	 * run program
	 */
	public void run(){
		Viewer view = new Viewer();
		
	}
}
