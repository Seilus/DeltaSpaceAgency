package pl.edu.pw.fizyka.pojava.OddzialDelta;
	/**
 * 
 * @author KM
 *holds information about the space ship as well as methods for making it move due to engine and gravity
 *the movement is done by moving all the planets, as the ship is stationary in the center of the map
 */
public class Ship{
	private int shipMassT;
	private float fuelMassT;
	private double forceOfEngineN;
	//tangent of this angle informs of the direction of the ship
	private double turningAngleDeg;
	private double speedXkmByS;
	private double speedYkmByS;
	private int destination;
	double accXkmBySGrav;
	double accYkmBySGrav;
	private int throttleValue;
	//toggled with the button and space bar
	private boolean engineToggle;
	public Ship(double speedX, double speedY){
		shipMassT=300;
		fuelMassT=700;
		forceOfEngineN=Math.pow(2, 22);
		speedXkmByS=speedX;
		speedYkmByS=speedY;
		engineToggle=false;
		throttleValue=0;
		turningAngleDeg=0;
	
	}
	
	
	
	public int getThrottleValue(){
		return throttleValue; 
	}
	
	//returns the no. of planet to land on. Possible values are 1,2,4,5,6,7,8
	public int getDestination(){
		return destination;
	}
	
	public void setDestination(int destination ){
		this.destination=destination;
	}
	
	public void setThrottleValue(int throttle){
		throttleValue=throttle;
	}
	
	public void increaseThrottle(int increase){
		throttleValue+=increase;
		if(throttleValue>1000){
			throttleValue=1000;
		}
		else if(throttleValue<0){
			throttleValue=0;
		}
	}
	
	public void burnFuel(){
		if(engineToggle){
			fuelMassT-=0.02*throttleValue/1000;
		}
		if(fuelMassT<=0){
			engineToggle=false;
			fuelMassT=0;
		}
	}
	
	public float getFuelMass(){
		return fuelMassT;
	}
	
	public double getSpeedX(){
		return speedXkmByS;
	}
	
	public double getSpeedY(){
		return speedYkmByS;
	}
	
	public void toggleEngine(){
		if(engineToggle==false){
			engineToggle=true;
		}
		else{
			engineToggle=false;
		}
	}
	
	public void turnShip(int turn){
		turningAngleDeg+=turn;
		if(turningAngleDeg>=360){
			turningAngleDeg-=360;
		}
		else if(turningAngleDeg<0){
			turningAngleDeg+=360;
		}
	}
	
	public double getAngle(){
		return turningAngleDeg;
	}
	
	public float getMass(){
		return shipMassT+fuelMassT;
	}

	public void shipMovement(CelestialBody[] planetSystem, int frequency){
		double accX=accXkmBySGrav;
		double accY=accYkmBySGrav;
		if(engineToggle){
			accX+=(forceOfEngineN*throttleValue*Math.cos(this.turningAngleDeg*2*Math.PI/360)/(1000*(this.getMass()*1000))/frequency);
			accY+=(forceOfEngineN*throttleValue*-Math.sin(this.turningAngleDeg*2*Math.PI/360)/(1000*(this.getMass()*1000))/frequency);
		}
		this.speedXkmByS+=accX/frequency;
		this.speedYkmByS+=accY/frequency;
		for(int ii=0; ii<planetSystem.length; ii++){
			planetSystem[ii].changeX(-this.speedXkmByS/frequency);
			planetSystem[ii].changeY(-this.speedYkmByS/frequency);
		}
		
	}
}
