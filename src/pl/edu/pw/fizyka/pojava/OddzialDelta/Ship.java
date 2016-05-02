package pl.edu.pw.fizyka.pojava.OddzialDelta;

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
	public Ship(double speedX, double speedY){
		shipMassT=300;
		fuelMassT=700;
		forceOfEngineN=70000;
		speedXkmByS=speedX;
		speedYkmByS=speedY;
		positionXkm=GameMap.WIDTH/2;
		positionYkm=GameMap.HEIGHT/2;
	}
	
	public int getThrottleValue(){
		return throttleValue; 
	}
	
	public void setThrottleValue(int throttle){
		throttleValue=throttle;
	}
	
	public void burnFuel(){
		
	}
	
	public double getPosX(){
		return positionXkm;
	}
	
	public double getPosY(){
		return positionYkm;
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