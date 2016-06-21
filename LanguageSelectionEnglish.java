package pl.edu.pw.fizyka.pojava.OddzialDelta;
/**
 * 
 * @author MS
 *
 */




public class LanguageSelectionEnglish {
	String[]  menu;
	
	String[] game;
	String[] help;
	String[]planets;
	String [] missions;
		public LanguageSelectionEnglish(){
			menu=new String[5];
			menu[0]="Start";
			menu[1]="Press button to start";
			menu[2]="Choose misson";
			menu[3]	= "Choose language";
			menu[4]="Help";
			
			game=new String[9];
			game[0]="ENGINE";
			game[1]="Ship speed";
			game[2]="Current throttle";
			game[3]="Current ship mass";
			game[4]="Remaining Fuel";
			game[5]="Name of the nearest planet";
			game[6]="Distance to nearest planet";
			game[7]="X distance to planet";
			game[8]="Y distance to planet";
			
			 help=new String[2];
			 help[0]="In the game DELTA SPACE AGENCY you fullfill space mission.\n Your task is to land rocket on the planet dependent of the mission choosen.\n "
			 		+ "Rocket is controlled by keyboard (arrows) or mouse (change of angle of movement).\n Rocket will start moving after clicking  Engine.\n Rocket fuel is limited."
                     +"\nList of missions:\n"
             +"1.	Mission 1  Cel: Mercury\n"
             +"2.	Mission 2  Cel: Wenus\n"
             +"3.	Mission 3  Cel: Earth\n"
             +"4.	Mission 4  Cel: Mars\n "
            +"5.	Mission 5  Cel: Jupiter\n"
             +"6.	Mission 6  Cel: Saturn\n"
             +"7.	Mission 7  Cel: Uranus\n"
             +"8.	Mission 8  Cel: Neptun\n" 
             +"Each mission starts on Earth.\n";
			 
			
			
             planets=new String[9];

			planets[0]="Sun";
			planets[1]="Mercury";
			planets[2]="Wenus";
			planets[3]="Earth";
			planets[4]="Mars";
			planets[5]="Jupiter";
			planets[6]="Saturn";
			planets[7]="Uranus";
			planets[8]="Neptun";
			
			missions=new String[8];
			missions[0]= "Mission 1";
			missions[1]= "Mission 2";
			missions[2]= "Mission 3";
			missions[3]= "Mission 4";
			missions[4]= "Mission 5";
			missions[5]= "Mission 6";
			missions[6]= "Mission 7";
			missions[7]= "Mission 8";

}
}
