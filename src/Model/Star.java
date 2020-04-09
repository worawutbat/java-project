package Model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.Timer;
/**
 * 
 * @author 5710404616  Worawut  tititumjariya
 * @project solar system
 */
public class Star implements ActionListener{
	
	protected double xLeft;
	protected double yTop;
	protected double diameter;
	protected Color color = Color.BLACK;
	protected String name;
	protected double angle;
	protected Timer timer;
	protected int x;
	protected int y;
	protected boolean condition = true;
	protected double speed;
	/**
	 * 
	 * @param x --> get width
	 * @param y --> get heigth
	 * @param r --> diameter
	 * @param n --> ratio of point to put the star
	 * @param speed --> time to repint() the star
	 */
	public Star(double x, double y, double r, String n, int speed) {
		timer = new Timer(speed, this);
		timer.start();
		xLeft = x-r;
		yTop = y-r;
		diameter = r;
		name = n;
		this.speed = 0.01;
	}
	
//	public double getX(){
//		return xLeft;
//	}
//	
//	public double getY(){
//		return yTop;
//	}
	
//	public void setX(double x){
//		xLeft = x;
//	}
//	
//	public void setY(double y){
//		yTop = y;
//	}
	
	public String getName() {
		return name;
	}
	
//	public void setName(String s) {
//		name = s;
//	}

	public void setAppear(boolean b) {
		condition = b;
	}
	
	public boolean getAppear() {
		return condition;
	}
	
	public void setColor(Color c1){
		color = c1;
	}
	
	public void draw(Graphics2D g2, double n){	
		x = (int) (Math.cos(angle) * ((xLeft) / n) + ((xLeft) / 2));
		y = (int) (Math.sin(angle) * ((yTop) / n) + ((yTop) / 2));
		Ellipse2D.Double star = new Ellipse2D.Double(x, y, diameter, diameter);
		g2.setColor(color);			
		g2.fill(star);
	}
	
	public void forward() {
		speed += 0.03;
	}

	public void backward() {
		speed -= 0.0325;
	}
	
	public void stop() {
		speed = 0;
	}
	/**
	 * set an angle every the time with set by program
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		angle -= speed;
		if(angle > (2 * Math.PI))
			angle = 0.0;
	}
	
}
