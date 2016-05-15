package pl.edu.pw.fizyka.pojava.OddzialDelta;

public class CelestialBody {

	
	private double massT;
	//prędkości i położenia początkowe; składowa X i Y
	private double speedXkmBys;
	private double speedYkmBys;
	private double positionXkm;
	private double positionYkm;
	//promień
	private int radiuskm;
	
	CelestialBody(){
		massT=0;
		speedXkmBys=0;
		speedYkmBys=0;
		positionXkm=0;
		positionYkm=0;
	}
	CelestialBody(double initMass, double initSpeedX, double initSpeedY, int initPosX, int initPosY, int radius){
		massT=initMass;
		speedXkmBys=initSpeedX;
		speedYkmBys=initSpeedY;
		positionXkm=initPosX;
		positionYkm=initPosY;
		radiuskm=radius;
	}
	//zwraca położenie w X
	public double getX(){
		return positionXkm;	
	}
	//zwraca położenie w Y
	public double getY(){
		return positionYkm;
	}
	public void changeX(double posX){
		this.positionXkm+=posX;
	}
	public void changeY(double posY){
		this.positionYkm+=posY;
	}
	//zwraca prędkość X
	public double getSpeedX(){
		return speedXkmBys;	
	}
	//zwraca prędkość Y
	public double getSpeedY(){
		return speedYkmBys;
	}	
	//zwraca masę
	public double getMass(){
		return massT;
	}
	//zwraca promień ciała
	public int getRadius(){
		return radiuskm;
	}
	//zmiana położenia i prędkości
	public void movementX(double speedChangeX, int frequency){
		speedXkmBys+=speedChangeX;
		positionXkm+=speedXkmBys/frequency;	
	}
	public void movementY(double speedChangeY, int frequency){
		speedYkmBys+=speedChangeY;
		positionYkm+=speedYkmBys/frequency;
	}
}