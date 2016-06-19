package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GameStartListener implements ActionListener {
	//Listener that calls constructors for all classes needed for the actual game
	LanguageChooserListener languageListener;
	LanguageSelectionEnglish englishLang;
	LanguageSelectionPolski polishLang;
	MenuFrame menuFrame;
	GravityCalculation gravityCalculation;
	CelestialBody[] planetSystem;
	public GameStartListener(LanguageChooserListener languageListener, LanguageSelectionEnglish englishLang, LanguageSelectionPolski polishLang, GravityCalculation gravityCalculation){
		this.languageListener=languageListener;
		this.englishLang=englishLang;
		this.polishLang=polishLang;
		this.gravityCalculation=gravityCalculation;
	
		
	}
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		CelestialBody[] planetSystem=new CelestialBody[9];{
			//masy
			planetSystem[0]=new CelestialBody(10000000, 0, 0, 000, -100, 65,Color.YELLOW);
			planetSystem[1]=new CelestialBody(1.5, -0.0025, 0.1, 80, -100, 4,Color.RED);
			planetSystem[2]=new CelestialBody(24.7, -0.0025, 0.1, 95, -100, 6,Color.ORANGE);
			planetSystem[3]=new CelestialBody(30.3, -0.0025, 0.1, 110, -100, 7,Color.BLUE);
			planetSystem[4]=new CelestialBody(3.25,-0.0025, 0.1, 150 , -100, 5,Color.RED);
			planetSystem[5]=new CelestialBody(9636.1, -0.0025, 0.1, 205, -100, 25,Color.ORANGE);
			planetSystem[6]=new CelestialBody(2884.74, -0.0025, 0.1, 345, -100, 20,Color.YELLOW);
			planetSystem[7]=new CelestialBody(440.57, -0.0025, 0.1, 465 , -100, 10,Color.BLUE);
			planetSystem[8]=new CelestialBody(517.3, -0.0025, 0.1, 665, -100, 10,Color.BLUE);
			

		}
		
		Ship rocket=new Ship(0, 0);
		GameMap testMap=new GameMap(planetSystem, rocket,menuFrame);
		PlanetInfo planetInfo;
		ShipStatus shipStats;
		
		if(menuFrame.languageListener.polish){
			shipStats=new ShipStatus(rocket, polishLang.game);
			planetInfo=new PlanetInfo(polishLang.game,polishLang.planets,gravityCalculation,planetSystem,menuFrame);
			shipStats.setNameShip();
			planetInfo.setNamePlanet();
			menuFrame.setHelpInfo(polishLang.help);
		}
		else{
			shipStats=new ShipStatus(rocket, englishLang.game);
			planetInfo=new PlanetInfo(englishLang.game, englishLang.planets,gravityCalculation,planetSystem,menuFrame);
			shipStats.setNameShip();
			planetInfo.setNamePlanet();
			menuFrame.setHelpInfo(englishLang.help);
		}
		GameHUD testHUD=new GameHUD(shipStats, planetInfo);
		GameWindow okno=new GameWindow(testMap, testHUD, rocket);
		try{
		KeyboardFocusManager shipKeyboardSteer= KeyboardFocusManager.getCurrentKeyboardFocusManager();
		shipKeyboardSteer.addKeyEventDispatcher(new ShipSteeringKeyboard(rocket));
		okno.addMouseListener(new MouseShipSteering(okno, rocket, testMap));
		GameAnimation testAnim=new GameAnimation(planetSystem, rocket, testMap, shipStats,planetInfo);
		menuFrame.setVisible(false);
		okno.setVisible(true);
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testAnim.animationStart();
		//System.out.println(planetSystem.length);
	}
	catch(Exception e1){

		System.err.println("Error: " + e1.getMessage());
	}
	}

}
