package pl.edu.pw.fizyka.pojava.OddzialDelta;


public class Ship{
	private int shipMassT;
	private float fuelMassT;
	private int forceOfEngineN;
	//tangens tego kąta będzie określał kierunek ruchu statku
	private double turningAngleDeg;
	private double speedXkmByS;
	private double speedYkmByS;
	double accXkmBySGrav;
	double accYkmBySGrav;
	//pomiędzy 0 a 1000
	private int throttleValue;
	//zmieniane przez przycisk silnika i spację.
	private boolean engineToggle;
	public Ship(double speedX, double speedY){
		shipMassT=300;
		fuelMassT=700;
		forceOfEngineN=200000;
		speedXkmByS=speedX;
		speedYkmByS=speedY;
		engineToggle=false;
		throttleValue=0;
		turningAngleDeg=0;
	
	}
	
	public int getThrottleValue(){
		return throttleValue; 
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
			fuelMassT-=0.2*throttleValue/1000;
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
		//System.out.println("X: "+accX);
		//System.out.println("Y: "+accY);
		this.speedXkmByS+=accX/frequency;
		this.speedYkmByS+=accY/frequency;
		for(int ii=0; ii<planetSystem.length; ii++){
			planetSystem[ii].changeX(-this.speedXkmByS/frequency);
			planetSystem[ii].changeY(-this.speedYkmByS/frequency);
		}
		
	}
}
