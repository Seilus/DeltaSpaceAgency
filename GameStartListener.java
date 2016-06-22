package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
	/**
	 * 
	 * @author MS
	 *Listener that calls constructors for all classes needed for the actual game
	 */
public class GameStartListener implements ActionListener {
	
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
		int[] positionX={14000, -60000, 34000, -12000};
		int[] positionY={25000, -21000, -37000, 6500};
		Random ChoosePosition=new Random();
		int randomChoice=ChoosePosition.nextInt(4);
		CelestialBody[] planetSystem=new CelestialBody[9];{
			//mass, sX, sY, pX, pY, r
			planetSystem[0]=new CelestialBody(332831, 0, 0, 0+positionX[randomChoice], 0+positionY[randomChoice], 1179);
			planetSystem[1]=new CelestialBody(0.055, 34, 33, 3749+positionX[randomChoice], 3860+positionY[randomChoice], 70);
			planetSystem[2]=new CelestialBody(0.815, 32.6, -12.7, 2665+positionX[randomChoice], -6855+positionY[randomChoice], 110);
			planetSystem[3]=new CelestialBody(1, -28.2, -9.6, -2796+positionX[randomChoice], 8184+positionY[randomChoice], 112);
			planetSystem[4]=new CelestialBody(0.107, 16.6, -17.5, -7749+positionX[randomChoice] , -7341+positionY[randomChoice], 82);
			planetSystem[5]=new CelestialBody(317.8, -1.3, 13, 19628+positionX[randomChoice], 1969+positionY[randomChoice], 370);
			planetSystem[6]=new CelestialBody(95.1, -3.2, -9.1, -25154+positionX[randomChoice], 8943+positionY[randomChoice], 333);
			planetSystem[7]=new CelestialBody(14.5, 6, 3.2, 17751+positionX[randomChoice] , -33472+positionY[randomChoice], 226);
			planetSystem[8]=new CelestialBody(17.1, -1.6, 5.2, -11462+positionX[randomChoice], -53154+positionY[randomChoice], 222);
		} 
		Ship rocket=new Ship(0, 0);
		GameMap testMap;
		menuFrame.setMission(menuFrame.MissionComboBox.getSelectedIndex());
		ShipStatus shipStats;
		PlanetInfo planetInfo;
		if(menuFrame.languageListener.polish){
			shipStats=new ShipStatus(rocket, polishLang.game);
			shipStats.setNameShip();
			planetInfo=new PlanetInfo(planetSystem, polishLang.game, menuFrame.getMission());
			planetInfo.setNamePlanet();
			testMap=new GameMap(planetSystem, rocket, polishLang.landing);
			menuFrame.setHelpInfo(polishLang.help);

		}
		else{
			shipStats=new ShipStatus(rocket, englishLang.game);
			shipStats.setNameShip();
			planetInfo=new PlanetInfo(planetSystem, englishLang.game, menuFrame.getMission());
			planetInfo.setNamePlanet();
			testMap=new GameMap(planetSystem, rocket, englishLang.landing);
			menuFrame.setHelpInfo(englishLang.help);

		}

		rocket.setDestination(menuFrame.getMission());
		GameHUD testHUD=new GameHUD(shipStats, planetInfo);
		GameWindow window=new GameWindow(testMap, testHUD, rocket);
		
		KeyboardFocusManager shipKeyboardSteer= KeyboardFocusManager.getCurrentKeyboardFocusManager();
		shipKeyboardSteer.addKeyEventDispatcher(new ShipSteeringKeyboard(rocket));
		window.addMouseListener(new MouseShipSteering(window, rocket, testMap));
		GameAnimation testAnim=new GameAnimation(planetSystem, rocket, testMap, shipStats, planetInfo);

		menuFrame.setVisible(false);

		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testAnim.animationStart();
	}

}
