package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PlanetInfo extends JPanel {
	//class displays information on destination planet in a text area in GameHUD
	
	private static final long serialVersionUID = 1L;
	LanguageChooserListener languageListener;
	JTextArea planetInfo;
	String game[];
	String planets[];
	GravityCalculation gravityCalculation;
	MenuFrame menuFrame;
	CelestialBody[] planetSystem;
	double distance, distanceX, distanceY;
	DecimalFormat format;
	int missionSelected;
    void setNamePlanet(){
    	format=new DecimalFormat("#.##");
    	planetInfo.setText("\n"+game[5]+" "+planets[missionSelected]+"\n"+game[6]+" "+format.format(distance)+"  "+"\n"+game[7]+
				" "+format.format(distanceX)+"\n"+game[8]+" "+format.format(distanceY)+"\n");
		
	}
   
	
	
	
	
	public PlanetInfo(String game[],String planets[],GravityCalculation gravityCalculation,CelestialBody[] planetSystem,MenuFrame menuFrame) {
		this.gravityCalculation=gravityCalculation;
		this.planetSystem=planetSystem;
		this.game=game;
		this.planets=planets;
		this.menuFrame=menuFrame;
		missionSelected=menuFrame.SelectedMission;
		distance=gravityCalculation.getDistance(planetSystem,missionSelected);
		distanceX=gravityCalculation.getDistanceX(planetSystem,missionSelected);
		distanceY=gravityCalculation.getDistanceY(planetSystem,missionSelected);
		
		
		setLayout(new FlowLayout(2));
		setBackground(Color.DARK_GRAY);
	    planetInfo=new JTextArea(4, 1);
		planetInfo.setBackground(Color.BLACK);
		planetInfo.setEditable(false);
		Font shipFont = new Font("Verdana", Font.BOLD, 12);
		planetInfo.setFont(shipFont);
		planetInfo.setForeground(Color.WHITE);
		//planetInfo.setText("\nName of nearest planet\nDistance to nearest planet\nX distance to planet\nY distance to planet\n ");
		this.add(planetInfo);
		
		ShipRadar radar=new ShipRadar();
		Dimension radarPref=new Dimension(60, 60);
		radar.setPreferredSize(radarPref);
		this.add(radar);
	}
	public void update(){
		distance=gravityCalculation.getDistance(planetSystem,missionSelected);
		distanceX=gravityCalculation.getDistanceX(planetSystem,missionSelected);
		distanceY=gravityCalculation.getDistanceY(planetSystem,missionSelected);
		planetInfo.setText("\n"+game[5]+" "+planets[missionSelected]+"\n"+game[6]+" "+format.format(distance)+"   "+"\n"+game[7]+
				" "+format.format(distanceX)+"\n"+game[8]+" "+format.format(distanceY)+"\n");	}
}	
