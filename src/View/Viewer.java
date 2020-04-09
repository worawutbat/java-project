package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import Controller.Controller;
import Model.Star;

//import Model.Star;
//import Model.Sun;
/**
 * 
 * @author 5710404616 Worawut Tititumjariya 
 * @project solar system
 *
 */
public class Viewer{
	private JFrame frame;
	private JPanel sountPanel, eastPanel, sountEast, centerEast;
	private JButton submitBut, forwardBut, backwardBut, stopBut;
	private JCheckBox circleLine, sunCheck, mercryCheck, venusCheck, earthCheck, marsCheck, jupiterCheck, saturnCheck, uranusCheck, neptuneCheck;
	private String[] nameList = {"Sun", "Mercry", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
	private JCheckBox[] checkBoxList;
	private Componenter component;
	private Controller controller;
	
	
	public Viewer() {
		component = new Componenter();
		controller = component.getController();
		setView();
	}
	
	public void setView(){
		
		frame = new JFrame();
		createButton();
		managePanel();
		checkBoxList = new JCheckBox[] {sunCheck, mercryCheck, venusCheck, earthCheck, marsCheck, jupiterCheck, saturnCheck, uranusCheck, neptuneCheck};	
		frame.add(sountPanel, BorderLayout.SOUTH);
		frame.add(eastPanel, BorderLayout.EAST);
		frame.setSize(705, 700);
		frame.setTitle("Solar System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(component, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	private void managePanel() {
		
		eastPanel = new JPanel();
		eastPanel.setLayout(new BorderLayout());
		sountEast = new JPanel();
		centerEast = new JPanel();	
		centerEast.setLayout(new GridLayout(10, 1));
		centerEast.add(circleLine);	
		centerEast.add(neptuneCheck);
		centerEast.add(uranusCheck);
		centerEast.add(saturnCheck);
		centerEast.add(jupiterCheck);
		centerEast.add(marsCheck);
		centerEast.add(earthCheck);
		centerEast.add(venusCheck);
		centerEast.add(mercryCheck);
		centerEast.add(sunCheck);
		sountEast.add(submitBut);
		centerEast.setBorder(new TitledBorder(new EtchedBorder(), "Showing"));	
		eastPanel.add(centerEast, BorderLayout.CENTER);
		eastPanel.add(sountEast, BorderLayout.SOUTH);
		
		sountPanel = new JPanel();
		sountPanel.setBorder(new TitledBorder(new EtchedBorder(), "Moving"));
		sountPanel.add(forwardBut);
		sountPanel.add(backwardBut);
		sountPanel.add(stopBut);

	}
	
	private void createButton() {
		circleLine = new JCheckBox("Circle Line");
		circleLine.setSelected(true);
		
		sunCheck = new JCheckBox("Sun");
		mercryCheck = new JCheckBox("Mercry");
		venusCheck = new JCheckBox("Venus");
		earthCheck = new JCheckBox("Earth");
		marsCheck = new JCheckBox("Mars");
		jupiterCheck = new JCheckBox("Jupiter");
		saturnCheck = new JCheckBox("Santurn");
		uranusCheck = new JCheckBox("Uranus");
		neptuneCheck = new JCheckBox("Neptune");	
		sunCheck.setSelected(true);
		mercryCheck.setSelected(true);
		venusCheck.setSelected(true);
		earthCheck.setSelected(true);
		marsCheck.setSelected(true);
		jupiterCheck.setSelected(true);
		saturnCheck.setSelected(true);
		uranusCheck.setSelected(true);
		neptuneCheck.setSelected(true);
		
		submitBut = new JButton("submit");
		forwardBut = new JButton("ForWard");
		backwardBut = new JButton("BackWard");
		stopBut = new JButton("Stop");
		
		submitBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				checkCondition();	
			}
		});
		forwardBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.setForward();
			}
		});
		backwardBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.setBackward();
			}
		});
		stopBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.setStop();
			}
		});
	}

	private void checkCondition() {
		
		if (circleLine.isSelected()){
			controller.setDrawLine(true);
		}
		else {
			controller.setDrawLine(false);
		}

		for (int i = 0; i<checkBoxList.length; i++){
			if (checkBoxList[i].isSelected()){
				controller.setStarAppear(nameList[i], true);
			}
			else {
				controller.setStarAppear(nameList[i], false);
			}
		}

	}
}

