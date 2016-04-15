package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class GameHUD extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameHUD() {
		GridBagLayout HUDGrid=new GridBagLayout();
		GridBagConstraints HUDC=new GridBagConstraints();
		setLayout(HUDGrid);
		HUDC.weightx=0.6;
		HUDC.fill=GridBagConstraints.BOTH;
		ShipStatus sStats=new ShipStatus();
		HUDGrid.setConstraints(sStats, HUDC);
		this.add(sStats);
		HUDC.gridwidth=GridBagConstraints.REMAINDER;
		HUDC.fill=GridBagConstraints.BOTH;
		HUDC.weightx=0.4;
		PlanetInfo pInfo=new PlanetInfo();
		HUDGrid.setConstraints(pInfo, HUDC);
		this.add(pInfo);
		Dimension prefHUD=new Dimension(1200, 90);
		this.setPreferredSize(prefHUD);
	}

	public GameHUD(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GameHUD(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public GameHUD(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
