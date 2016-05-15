package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PlanetInfo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PlanetInfo() {
		setLayout(new FlowLayout(2));
		setBackground(Color.DARK_GRAY);
		JTextArea planetInfo=new JTextArea(4, 1);
		planetInfo.setBackground(Color.BLACK);
		planetInfo.setEditable(false);
		Font shipFont = new Font("Verdana", Font.BOLD, 12);
		planetInfo.setFont(shipFont);
		planetInfo.setForeground(Color.WHITE);
		planetInfo.setText("Name of nearest planet\nDistance to nearest planet\nX distance to planet\nY distance to planet\n ");
		this.add(planetInfo);
		ShipRadar radar=new ShipRadar();
		Dimension radarPref=new Dimension(60, 60);
		radar.setPreferredSize(radarPref);
		this.add(radar);
	}

	public PlanetInfo(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public PlanetInfo(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public PlanetInfo(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
