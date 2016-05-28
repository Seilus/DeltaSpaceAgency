package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class GameHUD extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LanguageChooserListener languageListener;

	public GameHUD(ShipStatus sStats, LanguageChooserListener languageListener) {
				GridBagLayout HUDGrid=new GridBagLayout();
		GridBagConstraints HUDC=new GridBagConstraints();
		setLayout(HUDGrid);
		HUDC.weightx=0.6;
		HUDC.fill=GridBagConstraints.BOTH;
		//ShipStatus sStats=new ShipStatus(rocket);
		HUDGrid.setConstraints(sStats, HUDC);
		this.add(sStats);
		HUDC.gridwidth=GridBagConstraints.REMAINDER;
		HUDC.fill=GridBagConstraints.BOTH;
		HUDC.weightx=0.4;
		PlanetInfo pInfo=new PlanetInfo(languageListener);
		HUDGrid.setConstraints(pInfo, HUDC);
		this.add(pInfo);
		Dimension prefHUD=new Dimension(1200, 90);
		this.setPreferredSize(prefHUD);
	}
}
