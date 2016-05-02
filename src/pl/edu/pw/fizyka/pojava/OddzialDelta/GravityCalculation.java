package pl.edu.pw.fizyka.pojava.OddzialDelta;

public class GravityCalculation{
	static double gravConstantT=6.673*Math.pow(10, -8);
	GravityCalculation(){	
	}
	public void computeGPlanets(CelestialBody[] planetSystem, int frequency){
		
		for(int ii=0; ii<planetSystem.length; ii++){
			double accXkmByS=0;
			double accYkmByS=0;
			
			for(int jj=0; jj<planetSystem.length; jj++){
				double distanceRkm=Math.sqrt(Math.pow(planetSystem[jj].getX()-planetSystem[ii].getX(),2)+Math.pow(planetSystem[jj].getY()-planetSystem[ii].getY(), 2));
				if(distanceRkm!=0){
					accXkmByS+=gravConstantT*planetSystem[ii].getMass()*(planetSystem[jj].getX()-planetSystem[ii].getX())/Math.pow(distanceRkm, 3);
					accYkmByS+=gravConstantT*planetSystem[ii].getMass()*(planetSystem[jj].getY()-planetSystem[ii].getY())/Math.pow(distanceRkm, 3);
				}
			}
			planetSystem[ii].movementX(accXkmByS/frequency, frequency);
			planetSystem[ii].movementY(accYkmByS/frequency, frequency);
		}
	}
	public void computeGShip(CelestialBody[] planetSystem, int frequency, Ship rocket){
		double accXkmByS=0;
		double accYkmByS=0;
		for(int jj=0; jj<planetSystem.length; jj++){
			double distanceRkm=Math.sqrt(Math.pow(planetSystem[jj].getX()-rocket.getPosX(),2)+Math.pow(planetSystem[jj].getY()-rocket.getPosY(), 2));
			if(distanceRkm!=0){
				accXkmByS+=gravConstantT*rocket.getMass()*(planetSystem[jj].getX()-rocket.getPosX())/Math.pow(distanceRkm, 3);
				accYkmByS+=gravConstantT*rocket.getMass()*(planetSystem[jj].getY()-rocket.getPosY())/Math.pow(distanceRkm, 3);
			}
		}
		rocket.accXkmBySGrav=accXkmByS;
		rocket.accYkmBySGrav=accYkmByS;
	}
}
