package pl.edu.pw.fizyka.pojava.OddzialDelta;

public class GravityCalculator {
	static int calculationsFrequencyHz=1;
	static double gravEarthMass=3.988*Math.pow(10, 14);
	GravityCalculator(){
	}
	static void computeAcceleration(CelestialBody[] planetSystem,  int frequency){
		if(frequency>1&&frequency<100){
			calculationsFrequencyHz=frequency;
		}
		double accXkmBySt0[]=new double[planetSystem.length];
		double accYkmBySt0[]=new double[planetSystem.length];
		//Dla każdego ciała obliczamy siłę działającą w chwili t0 ( a raczej przyspieszenie)
		for(int jj=0; jj>planetSystem.length; jj++){
			accXkmBySt0[jj]=0; 
			accYkmBySt0[jj]=0;
			for(int ii=0; ii>planetSystem.length; ii++){
				double distanceRkm=Math.sqrt(Math.pow(planetSystem[jj].getX()-planetSystem[ii].getX(),2)+Math.pow(planetSystem[jj].getY()-planetSystem[ii].getY(), 2));
				if(distanceRkm!=0){
					accXkmBySt0[jj]+=gravEarthMass*planetSystem[ii].getMass()*(planetSystem[jj].getX()-planetSystem[ii].getX())/Math.pow(distanceRkm, 3);
					accYkmBySt0[jj]+=gravEarthMass*planetSystem[ii].getMass()*(planetSystem[jj].getY()-planetSystem[ii].getY())/Math.pow(distanceRkm, 3);
				}
			}
		}
		//obliczamy o ile przesunąłby się obiekt pod działaniem takiej siły
		double projectedDisplacementYkm[]=new double[planetSystem.length], projectedDisplacementXkm[]=new double[planetSystem.length];
		double projectedAccXkmBys[]=new double[planetSystem.length], projectedAccYkmBys[]=new double[planetSystem.length];
		for(int dd=0; dd>planetSystem.length; dd++){
			projectedDisplacementXkm[dd]=(planetSystem[dd].getSpeedX()+accXkmBySt0[dd])/calculationsFrequencyHz;
			projectedDisplacementYkm[dd]=(planetSystem[dd].getSpeedX()+accYkmBySt0[dd])/calculationsFrequencyHz;
		}
		//Z wzoru trapezów obliczamy zmianę prędkości ciała
		double speedChangeYkmByS[]=new double[planetSystem.length], speedChangeXkmByS[]=new double[planetSystem.length];
		for(int jj=0; jj<planetSystem.length; jj++){
			for(int ii=0; ii<planetSystem.length; ii++){
				double distanceRkm=Math.sqrt(Math.pow((planetSystem[jj].getX()+projectedDisplacementXkm[jj])-(planetSystem[ii].getX()+projectedDisplacementXkm[ii]), 2)+Math.pow((planetSystem[jj].getY()+projectedDisplacementYkm[jj])-(planetSystem[ii].getY()+projectedDisplacementYkm[ii]), 2));
				if(distanceRkm!=0){
					projectedAccXkmBys[jj]+=gravEarthMass*planetSystem[ii].getMass()*((planetSystem[jj].getX()+projectedDisplacementXkm[jj])-(planetSystem[ii].getX()+projectedDisplacementXkm[ii]))/Math.pow(distanceRkm, 3);
					projectedAccYkmBys[jj]+=gravEarthMass*planetSystem[ii].getMass()*((planetSystem[jj].getY()+projectedDisplacementYkm[jj])-(planetSystem[ii].getY()+projectedDisplacementYkm[ii]))/Math.pow(distanceRkm, 3);
				}
			}
		
			speedChangeXkmByS[jj]=((accXkmBySt0[jj]+projectedAccXkmBys[jj])/calculationsFrequencyHz);
			speedChangeYkmByS[jj]=((accYkmBySt0[jj]+projectedAccYkmBys[jj])/calculationsFrequencyHz);
			planetSystem[jj].movementX(-speedChangeXkmByS[jj], calculationsFrequencyHz);
			planetSystem[jj].movementY(-speedChangeYkmByS[jj], calculationsFrequencyHz);
		}
	}
}