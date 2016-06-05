package pl.edu.pw.fizyka.pojava.OddzialDelta;

public class Landing {
	//checks whether ship touched down on the surface of a planet
	public static void checkLanding(Ship rocket, CelestialBody[] planetSystem, GameMap map){
		boolean rightPlanet=false;
		for(int ii=0; ii<planetSystem.length; ii++){
			double distance=Math.sqrt(Math.pow(planetSystem[ii].getX()-map.getWidth()/2, 2)+Math.pow(planetSystem[ii].getY()-map.getHeight()/2, 2));
			if(distance==0){
				if(ii==rocket.getDestination()){
					rightPlanet=true;
				}
				checkSpeed(rocket, planetSystem[ii], rightPlanet);
			}
		}
	}
	//checks the speed with which ship collided with planet and reacts appropriately
	private static void checkSpeed(Ship rocket, CelestialBody planet, boolean rightPlanet){
		double relativeSpeed=Math.sqrt(Math.pow(planet.getSpeedX()-rocket.getSpeedX(), 2)+Math.pow(planet.getSpeedY()-rocket.getSpeedY(), 2));
		if(relativeSpeed<=2){
			if(rightPlanet){
				landingRightPlanet();
			}
			else{
				landingWrongPlanet();
			}
		}
		else{
			crash();
		}
	}
	
	private static void landingRightPlanet(){
		
	}
	
	private static void landingWrongPlanet(){
		
	}
	
	private static void crash(){
		
	}
	
}
