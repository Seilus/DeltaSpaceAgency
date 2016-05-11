package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ship{
	private int shipMassT;
	private float fuelMassT;
	private int forceOfEngineN;
	//tangens tego kąta będzie określał kierunek ruchu statku
	private double turningAngle;
	private double speedXkmByS;
	private double speedYkmByS;
	private double positionXkm;
	private double positionYkm;
	double accXkmBySGrav;
	double accYkmBySGrav;
	//pomiędzy 0 a 1000
	private int throttleValue;
	private boolean toggleEngine;
	public Ship(double speedX, double speedY){
		shipMassT=300;
		fuelMassT=700;
		forceOfEngineN=0000;
		speedXkmByS=speedX;
		speedYkmByS=speedY;
		positionXkm=0;
		positionYkm=0;
		KeyListener shipControls=new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				char typed=e.getKeyChar();
				if(typed=='w'){
					throttleValue+=5;
				}
				else if(typed=='a'){
					turningAngle+=5;
					if(turningAngle==360){
						turningAngle=0;
					}
				}
				else if(typed=='d'){
					turningAngle-=5;
					if(turningAngle==-360){
						turningAngle=0;
					}
				}
				else if(typed=='s'){
					if(throttleValue<6){
						throttleValue=0;
					}
					else{
						throttleValue-=5;
					}
				}
			}
			
		};
	}
	
	public int getThrottleValue(){
		return throttleValue; 
	}
	
	public void setThrottleValue(int throttle){
		throttleValue=throttle;
	}
	
	public void burnFuel(){
		
	}
	public double getSpeedX(){
		return speedXkmByS;
	}
	
	public double getPosX(){
		return positionXkm;
	}
	
	public double getPosY(){
		return positionYkm;
	}
	public void setPosX(double X){
		positionXkm=X;
	}
	public void setPosY(double Y){
		positionYkm=Y;
	}
	
	public float getMass(){
		return shipMassT+fuelMassT;
	}
	
	public void shipMovement(CelestialBody[] planetSystem, int frequency){
		double accX=accXkmBySGrav+(forceOfEngineN/(this.getMass()*1000)*Math.cos(this.turningAngle)/frequency);
		double accY=accYkmBySGrav+(forceOfEngineN/(this.getMass()*1000)*Math.sin(this.turningAngle)/frequency);
		this.speedXkmByS+=accX;
		this.speedYkmByS+=accY;
		for(int ii=0; ii<planetSystem.length; ii++){
			planetSystem[ii].changeX(this.speedXkmByS/frequency);
			planetSystem[ii].changeY(this.speedYkmByS/frequency);
		}
		
	}
}