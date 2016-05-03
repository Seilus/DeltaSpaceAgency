package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class GameMap extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	private */
	CelestialBody[] planetSystem;
	Ship Ship;
	public GameMap(CelestialBody[] planetarySystem,Ship Ship) {
		// TODO Auto-generated constructor stub
	planetSystem=planetarySystem;	
	Dimension pref=new Dimension(1200, 510);
	Dimension min=new Dimension(640, 480);
	this.setPreferredSize(pref);
	this.setMinimumSize(min);
	}

	public GameMap(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GameMap(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public GameMap(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
		for(int ii=0; ii<planetSystem.length; ii++){
			g.setColor(Color.BLUE);
			g.fillOval((int)planetSystem[ii].getX()-planetSystem[ii].getRadius(), (int)planetSystem[ii].getY()-planetSystem[ii].getRadius(), planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2);
		}
		g.fillOval(Ship.getX(),Ship.getY());
	}
	
	
	
}

