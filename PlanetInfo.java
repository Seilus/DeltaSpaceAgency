package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 * 
 * @author KM
 *class displays information on destination planet in a text area in GameHUD
 */
public class PlanetInfo extends JPanel {

	
	private static final long serialVersionUID = 1L;

	CelestialBody[] planetSystem;
	int destination;
	double xDistanceToTarget, yDistanceToTarget;
	JTextArea planetInfo;
	DecimalFormat format;
	String[] game;
	String[] planets;
    void setNamePlanet(){
    	format=new DecimalFormat("#.##");
		planetInfo.setText("\n"+game[5]+" "+planets[destination]+"\n"+game[6]+format.format(Math.sqrt(Math.pow(xDistanceToTarget, 2)+Math.pow(yDistanceToTarget, 2))-planetSystem[destination].getRadius())+"\n"+game[7]+format.format(Math.sqrt(Math.pow(planetSystem[destination].getSpeedX(), 2)+Math.pow(planetSystem[destination].getSpeedY(), 2)))+"\n"+game[8]+format.format(Math.sqrt(Math.pow(planetSystem[0].getX(), 2)+Math.pow(planetSystem[0].getY(), 2)))+"\n");
	}
    
    public void setDistance(){
    	xDistanceToTarget=planetSystem[destination].getX();
    	yDistanceToTarget=planetSystem[destination].getY();
    }
    
	public PlanetInfo(CelestialBody[] planetSystem, String[] game, String[] planets, int destination) {
		this.planetSystem=planetSystem;
		this.game=game;
		this.planets=planets;
		this.destination=destination;
		setLayout(new FlowLayout(2));
		setBackground(Color.DARK_GRAY);
	    planetInfo=new JTextArea(4, 1);
		planetInfo.setBackground(Color.BLACK);
		planetInfo.setEditable(false);
		Font shipFont = new Font("Verdana", Font.BOLD, 12);
		planetInfo.setFont(shipFont);
		planetInfo.setPreferredSize(new Dimension(220, 120));
		planetInfo.setForeground(Color.WHITE);
		setDistance();
		this.add(planetInfo);
		ShipRadar radar=new ShipRadar(planetSystem, destination);
		Dimension radarPref=new Dimension(60, 60);
		radar.setPreferredSize(radarPref);
		this.add(radar);
	}
	
	public void updateInfo(){
		setDistance();
		setNamePlanet();
	}
	
	
	
}	