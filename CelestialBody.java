package pl.edu.pw.fizyka.pojava.OddzialDelta;

public class CelestialBody {

	
	private int massKiloTonnes;
	//prędkości i położenia początkowe; składowa X i Y
	private double speedXkmBys;
	private double speedYkmBys;
	private double positionXkm;
	private double positionYkm;
	//promień
	private int radiuskm;
	
	CelestialBody(){
		massKiloTonnes=0;
		speedXkmBys=0;
		speedYkmBys=0;
		positionXkm=0;
		positionYkm=0;
	}
	CelestialBody(int initMass, double initSpeedX, double initSpeedY, int initPosX, int initPosY, int radius){
		massKiloTonnes=initMass;
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
	//zwraca prędkość X
	public double getSpeedX(){
		return speedXkmBys;	
	}
	//zwraca prędkość Y
	public double getSpeedY(){
		return speedYkmBys;
	}	
	//zwraca masę
	public int getMass(){
		return massKiloTonnes;
	}
	//zwraca promień ciała
	public int getRadius(){
		return radiuskm;
	}
	//zmiana położenia i prędkości
	public void changeX(double speedChangeX, int frequency){
		speedXkmBys+=speedChangeX;
		positionXkm+=speedXkmBys/frequency;	
	}
	public void changeY(double speedChangeY, int frequency){
		speedYkmBys+=speedChangeY;
		positionYkm+=speedYkmBys/frequency;
	}
}