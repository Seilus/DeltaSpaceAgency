package pl.edu.pw.fizyka.pojava.OddzialDelta;

/**
 * 
 * @author KM & MS
 *class represents a single celestial body, so, in our program: a planet or star
 */
public class CelestialBody {
	
	private double massMicroEarth;
	//initial velocities and location; X & Y components
	private double speedXkmBys;
	private double speedYkmBys;
	private double positionXkm;
	private double positionYkm;
	private int radiuskm;
	
	CelestialBody(){
		massMicroEarth=0;
		speedXkmBys=0;
		speedYkmBys=0;
		positionXkm=0;
		positionYkm=0;
	}
	CelestialBody(double initMass, double initSpeedX, double initSpeedY, int initPosX, int initPosY, int radius){
		massMicroEarth=initMass;
		speedXkmBys=initSpeedX;
		speedYkmBys=initSpeedY;
		positionXkm=initPosX;
		positionYkm=initPosY;
		radiuskm=radius;
	}
	public double getX(){
		return positionXkm;	
	}
	public double getY(){
		return positionYkm;
	}
	//two methods called when bodies move relative to the ship
	public void changeX(double posX){
		this.positionXkm+=posX;
	}
	public void changeY(double posY){
		this.positionYkm+=posY;
	}
	public double getSpeedX(){
		return speedXkmBys;	
	}
	public double getSpeedY(){
		return speedYkmBys;
	}	
	public double getMass(){
		return massMicroEarth;
	}
	public int getRadius(){
		return radiuskm;
	}
	//two methods called when there is a change in forces (gravity movement)
	public void movementX(double speedChangeX, int frequency){
		speedXkmBys+=speedChangeX;
		positionXkm+=speedXkmBys/frequency;	
	}
	public void movementY(double speedChangeY, int frequency){
		speedYkmBys+=speedChangeY;
		positionYkm+=speedYkmBys/frequency;
	}
}