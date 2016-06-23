package pl.edu.pw.fizyka.pojava.OddzialDelta;
/**
 * 
 * @author KM
 * Class checks whether ship has landed- and with what results
 */
public class Landing {
	public static boolean checkLanding(Ship rocket, CelestialBody[] planetSystem, GameMap map){
		boolean rightPlanet=false;
		boolean landed=false;
		for(int ii=0; ii<planetSystem.length; ii++){

			double distance=Math.sqrt(Math.pow(planetSystem[ii].getX(), 2)+Math.pow(planetSystem[ii].getY(), 2));

			if(distance<=planetSystem[ii].getRadius()){
				if(ii==rocket.getDestination()){
					rightPlanet=true;
				}
				landed=true;
				map.changeLandingStatus(checkSpeed(rocket, planetSystem[ii], rightPlanet), ii);
			}
		}
		return landed;
	}
	//checks the speed with which ship collided with planet and reacts appropriately
	private static int checkSpeed(Ship rocket, CelestialBody planet, boolean rightPlanet){
		double relativeSpeed=Math.sqrt(Math.pow(planet.getSpeedX()-rocket.getSpeedX(), 2)+Math.pow(planet.getSpeedY()-rocket.getSpeedY(), 2));
		int landingStatus=0;
		if(relativeSpeed<=100){
			if(rightPlanet){
				landingStatus=3;
			}
			else{
				landingStatus=2;
			}
		}
		else{
			landingStatus=1;
		}
		return landingStatus;
	}
	
}
