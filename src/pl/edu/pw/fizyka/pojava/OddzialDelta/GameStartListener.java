package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStartListener implements ActionListener {
	//Listener that calls constructors for all classes needed for the actual game
	LanguageChooserListener languageListener;
	LanguageSelectionEnglish englishLang;
	LanguageSelectionPolski polishLang;
	MenuFrame menuFrame;
	public GameStartListener(LanguageChooserListener languageListener, LanguageSelectionEnglish englishLang, LanguageSelectionPolski polishLang){
		this.languageListener=languageListener;
		this.englishLang=englishLang;
		this.polishLang=polishLang;
		
	}
	
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		CelestialBody[] planetSystem=new CelestialBody[3];{
			planetSystem[0]=new CelestialBody(100000, 0, 0.1, 300, -100, 25);
			planetSystem[1]=new CelestialBody(2500000, 0, 0, 000, -100, 65);
			planetSystem[2]=new CelestialBody(100000, 0.025, 0, -100, -300, 20);
		}
		
		Ship rocket=new Ship(0, 0);
		GameMap testMap=new GameMap(planetSystem, rocket);
		PlanetInfo planetInfo=new PlanetInfo();
		ShipStatus shipStats;
		if(menuFrame.languageListener.polish){
			shipStats=new ShipStatus(rocket, polishLang.game);
			shipStats.setNameShip();
			planetInfo.setNamePlanet(polishLang.game);
			menuFrame.setHelpInfo(polishLang.help);
		}
		else{
			shipStats=new ShipStatus(rocket, englishLang.game);
			shipStats.setNameShip();
			planetInfo.setNamePlanet(englishLang.game);
			menuFrame.setHelpInfo(englishLang.help);
		}
		GameHUD testHUD=new GameHUD(shipStats, planetInfo);
		GameWindow okno=new GameWindow(testMap, testHUD, rocket);
		
		KeyboardFocusManager shipKeyboardSteer= KeyboardFocusManager.getCurrentKeyboardFocusManager();
		shipKeyboardSteer.addKeyEventDispatcher(new ShipSteeringKeyboard(rocket));
		okno.addMouseListener(new MouseShipSteering(okno, rocket, testMap));
		GameAnimation testAnim=new GameAnimation(planetSystem, rocket, testMap, shipStats);
		menuFrame.setVisible(false);
		okno.setVisible(true);
		testAnim.animationStart();
	}

}
