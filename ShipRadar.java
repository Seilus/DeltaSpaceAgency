package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
/**
 * 
 * @author KM
 *displays the direction towards the destination by way of painting a radial line in the gameHUD
 */
public class ShipRadar extends JPanel {
	CelestialBody destinationPlanet;
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.DARK_GRAY);
		g.setColor(Color.red);
		g.fillOval(0, 0, getWidth(), getHeight());
		g.setColor(Color.WHITE);
		double angle=Math.atan(destinationPlanet.getY()/destinationPlanet.getX());
		if(destinationPlanet.getX()<0){
			angle+=Math.PI;
		}
		g.drawLine(this.getWidth()/2, this.getHeight()/2, this.getWidth()/2+(int)(30*Math.cos(angle)), this.getHeight()/2+(int)(30*Math.sin(angle)));
	}
	public ShipRadar(CelestialBody[] planetSystem, int destination) {
		destinationPlanet=planetSystem[destination];
	}
}
