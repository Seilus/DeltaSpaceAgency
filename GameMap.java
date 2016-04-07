package pl.edu.pw.fizyka.pojava.OddzialDelta;

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
	
	public GameMap(CelestialBody[] planetarySystem) {
		// TODO Auto-generated constructor stub
	planetSystem=planetarySystem;	
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
		for(int ii=0; ii<planetSystem.length; ii++){
			g.fillOval((int)planetSystem[ii].getX()-planetSystem[ii].getRadius(), (int)planetSystem[ii].getY()-planetSystem[ii].getRadius(), planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2);
		}	
	}
	
	
	
}

