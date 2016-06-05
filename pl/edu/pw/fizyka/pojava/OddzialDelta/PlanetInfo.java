package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PlanetInfo extends JPanel {
	//class displays information on destination planet in a text area in GameHUD
	
	private static final long serialVersionUID = 1L;
	LanguageChooserListener languageListener;
	JTextArea planetInfo;
    void setNamePlanet(String game[]){
		planetInfo.setText("\n"+game[5]+"\n"+game[6]+"\n"+game[7]+"\n"+game[8]+"\n");
	}
	public PlanetInfo() {
		
		setLayout(new FlowLayout(2));
		setBackground(Color.DARK_GRAY);
	    planetInfo=new JTextArea(4, 1);
		planetInfo.setBackground(Color.BLACK);
		planetInfo.setEditable(false);
		Font shipFont = new Font("Verdana", Font.BOLD, 12);
		planetInfo.setFont(shipFont);
		planetInfo.setForeground(Color.WHITE);
		planetInfo.setText("\nName of nearest planet\nDistance to nearest planet\nX distance to planet\nY distance to planet\n ");
		this.add(planetInfo);
		ShipRadar radar=new ShipRadar();
		Dimension radarPref=new Dimension(60, 60);
		radar.setPreferredSize(radarPref);
		this.add(radar);
	}
}	