package pl.edu.pw.fizyka.pojava.OddzialDelta;

public class LanguageSelectionEnglish {
	String[]  menu;
	String[] missions;
	String[] game;
	String [] help;
	String[]planets;
	
		public LanguageSelectionEnglish(){
			menu=new String[5];
			menu[0]="Start";
			menu[1]="Press button to start";
			menu[2]="Choose misson";
			menu[3]	= "Choose language";
			menu[4]="Help";
			missions=new String[9];
			missions[0]="Mission 1";
			missions[1]="Mission 2";
			missions[2]="Mission 3";
			missions[3]="Mission 4";
			missions[4]="Mission 5";
			missions[5]="Mission 6";
			missions[6]="Mission 7";
			missions[7]="Mission 8";
			missions[8]="Mission 9";
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
			help=new String[1];
			help[0]="In the game …. You fullfill space mission. Your task is to land rocket on the planet dependent of the mission choosen. 
Rocket is controlled by keyboard (arrows) or mouse (change of angle of movement). Rocket will start moving after clicking  Engine. Rocket’s fuel is limited.
List of missions:
1.	Mission 1 – Cel: Sun
2.	Mission 2 – Cel: Mercury
3.	Mission 3 – Cel: Wenus 
4.	Mission 4 - Cel: Mars 
5.	Mission 5 – Cel: Jupiter 
6.	Mission 6 – Cel: Saturn 
7.	Mission 7 -  Cel: Uranus
8.	Mission 8 – Cel: Neptun 
Each mission starts on Earth.";
planets=new String[9];

			planets[0]="Sun";
			planets[1]="Mercury";
			planets[2]="Wenus";
			planets[3]="Earth";
			planets[4]="Mars";
			missions[5]="Jupiter";
			missions[6]="Saturn";
			missions[7]="Uranus";
			missions[8]="Neptun";
		}
}
