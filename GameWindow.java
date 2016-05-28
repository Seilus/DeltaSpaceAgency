package pl.edu.pw.fizyka.pojava.OddzialDelta;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.KeyboardFocusManager;
import java.io.IOException;

import javax.swing.JFrame;

public class GameWindow extends JFrame  {

	private static final long serialVersionUID = 1L;
	
	Ship rocket;
	
	public GameWindow(GameMap map, GameHUD hud, Ship rocket) throws HeadlessException {
		super();
		//creates layout
		GridBagLayout gridBag=new GridBagLayout();
		GridBagConstraints gridC=new GridBagConstraints();
		setLayout(gridBag);
		gridC.weighty=0.85;
		gridC.weightx=1d;
		gridC.ipadx=1;
		gridC.ipady=1;
		this.rocket=rocket;
		gridC.fill=GridBagConstraints.BOTH;
		gridBag.setConstraints(map, gridC);
		this.add(map);
		gridC.weighty=0.15;
		gridC.gridy=1;
		gridC.weightx=1d;
		gridC.ipadx=1;
		gridC.ipady=1;
		gridC.fill=GridBagConstraints.BOTH;
		gridBag.setConstraints(hud, gridC);
		this.add(hud);
		this.setTitle("DELTA Space Agency");
		this.setSize(1200, 600);
	}

	public static void main(String[] args) throws IOException {
		CelestialBody[] planetSystem=new CelestialBody[3];{
			planetSystem[0]=new CelestialBody(100000, 0, 0.1, 300, -100, 25);
			planetSystem[1]=new CelestialBody(2500000, 0, 0, 000, -100, 65);
			planetSystem[2]=new CelestialBody(100000, 0.025, 0, -100, -300, 20);
		}
		
		LanguageChooserListener languageListener= new LanguageChooserListener ();
		Ship rocket=new Ship(0, 0);
		GameMap testMap=new GameMap(planetSystem, rocket);
		ShipStatus shipStats=new ShipStatus(rocket);
		GameHUD testHUD=new GameHUD(shipStats, languageListener);
		GameWindow okno=new GameWindow(testMap, testHUD, rocket);
		KeyboardFocusManager shipKeyboardSteer= KeyboardFocusManager.getCurrentKeyboardFocusManager();
		shipKeyboardSteer.addKeyEventDispatcher(new ShipSteeringKeyboard(rocket));
		//okno.setVisible(true);
		okno.addMouseListener(new MouseShipSteering(okno, rocket, testMap));
		GameAnimation testAnim=new GameAnimation(planetSystem, rocket, testMap, shipStats);
		GameStartListener startListener=new GameStartListener(okno, testAnim);
		
		MissionSelectionClass missionListener=new MissionSelectionClass();
		HelpListener helpListener=new HelpListener();
		MenuFrame t= new MenuFrame(startListener,languageListener,missionListener,helpListener);
		t.setSize(640, 480); 
		t.setVisible(true);

		
		//testAnim.animationStart();
	}
			
}

