package pl.edu.pw.fizyka.pojava.OddzialDelta;
/**
 * 
 * @author MS
 *English language class, containing all needed text in this language
 */
public class LanguageSelectionEnglish {
	String[]  menu;	
	String[] game;
	String help;
	String[] landing;
	String[]planets;

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
			game[5]="Destination: ";
			game[6]="Distance to target: ";
			game[7]="Speed of planet: ";
			game[8]="Distance to the sun: ";
			
			 help=new String();
			 help="You're stranded in space.\nYour ship has been damaged and is adrift in space .\nIt is up to you whether you continue the mission or seek haven back on Earth. \n"
			 		+ "Choose the planet you wish to land on, and continue your journey. \n\nBut be warned, as the rocket's current state will not allow you\nto continue flight once you touch down on any planet.\n"
			 		+ "Pay great mind to your velocity, as the landing assist system has been disabled, \nso you have to touch the ship down gently if you wish to survive the landing.\n"
			 		+ "If you let hopelessnes overtake you, you can always deliberately crash, or fly into the sun.\n\n"
			 		+ "Whatever your choice, you sit down at the controls to get a feel of the machine\n\n"
			 		+ "Controls:\n"
			 		+ "Arrow keys- Left/Right: turn ship, Up/Down: accelerate/decelerate\n"
			 		+ "Mouse left burron: turn ship (more precise than arrow keys)\n"
			 		+ "Mouse can also toggle engine and change throttle on the dashboard\n"
			 		+ "Spacebar: toggle engine on/off\n\n"
			 		+ "The radar in the lower right corner will inform you of the destination's position\n"
			 		+ "Pay close attention to it and the two displays giving vital information";
			
			
             planets=new String[9];

			planets[0]="Sun";
			planets[1]="Mercury";
			planets[2]="Venus";
			planets[3]="Earth";
			planets[4]="Mars";
			planets[5]="Jupiter";
			planets[6]="Saturn";
			planets[7]="Uranus";
			planets[8]="Neptune";
			
			landing=new String[10];
			landing[0]="And so the mission comes to a bitter end, with no survivors";
			landing[1]="Although the mission goals have not been met, the craft landed safely";
			landing[2]="With no fuel for the return trip, all that remains,";
			landing[3]= "is set up what's left of the research outpost";
			landing[4]="Congratulations!";
			landing[5]= "Despite the hardships, the mission was a success.";
			landing[6]= "A recovery craft is on it's way, to provide supplies";
			landing[7]= "and extract the remaining crew";
			landing[8]="The crew is now safely back on Earth.";
			landing[9]="Not as heroes, but at least as survivors";
		}
}
