package pl.edu.pw.fizyka.pojava.OddzialDelta;

public class LanguageSelectionEnglish {
	String[]  menu;
	String[] missions;
	String[] game;
		public LanguageSelectionEnglish(){
			menu=new String[5];
			menu[0]="Start";
			menu[1]="Press button to start";
			menu[2]="Choose misson";
			menu[3]	= "Choose language";
			menu[4]="Help";
			missions=new String[2];
			missions[0]="Mission 1";
			missions[1]="Mission 2";
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
		}
}
