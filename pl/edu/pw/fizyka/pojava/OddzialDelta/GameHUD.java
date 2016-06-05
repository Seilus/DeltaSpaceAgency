package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class GameHUD extends JPanel {
	//The lower part of the game window- holds information about the game, as well as ship controls
	private static final long serialVersionUID = 1L;
	
	public GameHUD(ShipStatus sStats, PlanetInfo pInfo) {
		GridBagLayout HUDGrid=new GridBagLayout();
		GridBagConstraints HUDC=new GridBagConstraints();
		setLayout(HUDGrid);
		HUDC.weightx=0.65;
		HUDC.ipady=0;
		HUDC.fill=GridBagConstraints.BOTH;
		HUDGrid.setConstraints(sStats, HUDC);
		this.add(sStats);
		HUDC.gridwidth=GridBagConstraints.REMAINDER;
		HUDC.fill=GridBagConstraints.BOTH;
		HUDC.weightx=0.35;
		HUDC.ipady=0;
		HUDGrid.setConstraints(pInfo, HUDC);
		this.add(pInfo);
		Dimension prefHUD=new Dimension(1200, 90);
		this.setPreferredSize(prefHUD);
	}
}
