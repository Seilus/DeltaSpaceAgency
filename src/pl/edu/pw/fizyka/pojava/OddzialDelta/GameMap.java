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
<<<<<<< HEAD
	Ship rocket;
	int heightBefore;
	int widthBefore;
	int heightAfter;
	int widthAfter;
	public GameMap(CelestialBody[] planetarySystem, Ship rocket) {
=======
	Ship Ship=new Ship(10,2);
	public GameMap(CelestialBody[] planetarySystem,Ship Ship) {
>>>>>>> 5fc0c40cf62e9eedbce24fce538d9dd6ee72e3f9
		// TODO Auto-generated constructor stub
		planetSystem=planetarySystem;	
		Dimension pref=new Dimension(1200, 510);
		Dimension min=new Dimension(640, 480);
		this.setPreferredSize(pref);
		this.setMinimumSize(min);
		heightBefore=this.getHeight();
		widthBefore=this.getWidth();
		heightAfter=0;
		widthAfter=0;
		this.rocket=rocket;

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
<<<<<<< HEAD
			g.fillOval((int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2);
		}
		g.setColor(Color.RED);
		g.fillOval(this.getWidth()/2-2, this.getHeight()/2-2, 4, 4);
=======
			g.fillOval((int)planetSystem[ii].getX()-planetSystem[ii].getRadius(), (int)planetSystem[ii].getY()-planetSystem[ii].getRadius(), planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2);
		}
	g.fillOval((int)Ship.getPosX(),(int)Ship.getPosY(),10,10);
>>>>>>> 5fc0c40cf62e9eedbce24fce538d9dd6ee72e3f9
	}
	
	
	
}

