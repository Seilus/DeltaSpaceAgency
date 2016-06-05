package pl.edu.pw.fizyka.pojava.OddzialDelta;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.io.IOException;

import javax.swing.JFrame;

public class GameWindow extends JFrame  {
	//the game Frame, showing both the map and the HUD
	private static final long serialVersionUID = 1L;
	
	Ship rocket;
	GameMap map;
	GameHUD hud;
	
	
	public GameWindow(GameMap map, GameHUD hud, Ship rocket) throws HeadlessException {
		super();
		//creates layout
		GridBagLayout gridBag=new GridBagLayout();
		GridBagConstraints gridC=new GridBagConstraints();
		setLayout(gridBag);
		gridC.weighty=0.8;
		gridC.weightx=1d;
		gridC.insets=new Insets(0,0,0,0);
		gridC.ipadx=0;
		gridC.ipady=0;
		this.rocket=rocket;
		gridC.fill=GridBagConstraints.BOTH;
		gridBag.setConstraints(map, gridC);
		map.setMinimumSize(new Dimension(800, 500));
		this.add(map);
		gridC.weighty=0.2;
		gridC.gridy=1;
		gridC.weightx=1d;
		gridC.ipadx=0;
		gridC.ipady=0;
		gridC.fill=GridBagConstraints.BOTH;
		gridBag.setConstraints(hud, gridC);
		hud.setMinimumSize(new Dimension(800, 100));
		this.add(hud);
		this.setTitle("DELTA Space Agency");
		this.setMinimumSize(getMinimumSize());
		this.setSize(1200, 700);
	}

	public static void main(String[] args) throws IOException {
		
		LanguageSelectionEnglish englishLang=new LanguageSelectionEnglish();
		LanguageSelectionPolski polishLang=new LanguageSelectionPolski();
		LanguageChooserListener languageListener= new LanguageChooserListener (englishLang, polishLang);
		GameStartListener startListener=new GameStartListener(languageListener, englishLang, polishLang);
		MissionSelectionClass missionListener=new MissionSelectionClass();
		HelpListener helpListener=new HelpListener(englishLang);
		MenuFrame t= new MenuFrame(startListener, languageListener,missionListener,helpListener);
		t.setSize(640, 480); 
		t.setVisible(true);
	}
			
}

