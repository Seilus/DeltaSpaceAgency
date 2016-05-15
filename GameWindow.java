package pl.edu.pw.fizyka.pojava.OddzialDelta;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class GameWindow extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Ship rocket;
	
	public GameWindow(GameMap map, GameHUD hud, Ship rocket) throws HeadlessException {
		super();
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
		//addKeyListener(this);
	}

	

/*
	public void keyPressed(KeyEvent ke) {
		int key = ke.getKeyCode(); 
		rocket.increaseThrottle(10);
		System.out.println("lalala");
		switch(key) { 
		case KeyEvent.VK_RIGHT: 
		
		break; 
		case KeyEvent.VK_LEFT: 
		
			break; 
		case KeyEvent.VK_UP:
			rocket.increaseThrottle(10);
			System.out.println(rocket.getThrottleValue());
			break; 
		case KeyEvent.VK_DOWN: 
		
			break;
		}	
	}

	public void keyReleased(KeyEvent arg0) {} 

	public void keyTyped(KeyEvent ke){
		int key = ke.getKeyCode(); 
		rocket.increaseThrottle(10);
		System.out.println("lalala");
		switch(key) { 
		case KeyEvent.VK_RIGHT: 
		
		break; 
		case KeyEvent.VK_LEFT: 
		
			break; 
		case KeyEvent.VK_UP:
			rocket.increaseThrottle(10);
			System.out.println(rocket.getThrottleValue());
			break; 
		case KeyEvent.VK_DOWN: 
		
			break;
		}
	}
	*/

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CelestialBody[] planetSystem=new CelestialBody[3];{
			planetSystem[0]=new CelestialBody(100000, 0, 0.038, 300, -100, 25);
			planetSystem[1]=new CelestialBody(2500000, 0, 0, 000, -100, 65);
			planetSystem[2]=new CelestialBody(100000, 0.025, 0, -100, -300, 20);
		}
		
		//MenuFrame t= new MenuFrame();
		//t.setSize(640, 480); 
		//t.setVisible(true);
		Ship rocket=new Ship(0, 0);
		GameMap testMap=new GameMap(planetSystem, rocket);
		ShipStatus shipStats=new ShipStatus(rocket);
		GameHUD testHUD=new GameHUD(shipStats);
		GameWindow okno=new GameWindow(testMap, testHUD, rocket);
		//ShipSteeringKeyboard steer=new ShipSteeringKeyboard(rocket, okno);
		okno.setVisible(true);
		okno.addKeyListener(new ShipSteeringKeyboard(rocket));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean collisionDetector=false;
		//rocket.increaseThrottle(20);
		while(collisionDetector==false){
			GravityCalculation.computeGPlanets(planetSystem, 5);
			GravityCalculation.computeGShip(planetSystem, 5, rocket);
			rocket.shipMovement(planetSystem, 5);
			//System.out.println(rocket.getThrottleValue());
			GravityCalculation.computeGPlanets(planetSystem, 2);
			okno.requestFocus();
			testMap.repaint();
			shipStats.update();
			rocket.burnFuel();
			for(int ii=0; ii<planetSystem.length; ii++){
				
				for(int jj=0; jj<planetSystem.length; jj++){
					if(jj!=ii){
						if(Math.sqrt(Math.pow((planetSystem[jj].getX())-(planetSystem[ii].getX()), 2)+Math.pow((planetSystem[jj].getY())-(planetSystem[ii].getY()), 2))<=((planetSystem[jj].getRadius())+(planetSystem[ii].getRadius()))){
							collisionDetector=true;

						}	
							
					}
				}	
			}
			
		
			try {
				TimeUnit.MILLISECONDS.sleep(1);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
			
}

