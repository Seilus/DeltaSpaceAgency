package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
/**
 * 
 * @author KM
 *Class responsible for calling calculations concerning gravity and landings and animation 
 */
public class GameAnimation {

	boolean collisionDetector;
	boolean landed;
	Timer animation;
	CelestialBody[] planetSystem;
	
	public void detectCollision(){
		//checks whether planets have impacted each other
		for(int ii=0; ii<planetSystem.length; ii++){
			for(int jj=0; jj<planetSystem.length; jj++){
				if(jj!=ii){
					if(Math.sqrt(Math.pow((planetSystem[jj].getX())-(planetSystem[ii].getX()), 2)+Math.pow((planetSystem[jj].getY())-(planetSystem[ii].getY()), 2))<=((planetSystem[jj].getRadius())+(planetSystem[ii].getRadius()))){
						collisionDetector=true;
						animation.stop();
						System.out.println(ii+", "+jj);
					}	
				}	
			}
		}
	}	
	
	public void animationStart(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		animation.start();
	}
	
	public GameAnimation(CelestialBody[] planetSystem, Ship rocket, GameMap map, ShipStatus shipStats, PlanetInfo planetInfo){
		this.animation=new Timer(5, null);
		landed=false;
		collisionDetector=false;
		this.planetSystem=planetSystem;
		
		animation.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				landed=Landing.checkLanding(rocket, planetSystem, map);
				if(landed){
					animation.stop();
				}
				GravityCalculation.computeGPlanets(planetSystem, 20);
				GravityCalculation.computeGShip(planetSystem, 20, rocket);
				rocket.shipMovement(planetSystem, 20);
				map.repaint();
				shipStats.update();
				planetInfo.updateInfo();
				rocket.burnFuel();
				detectCollision();
			}
			
		});
		
	}
}
