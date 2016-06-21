package pl.edu.pw.fizyka.pojava.OddzialDelta;
/**
 * 
 * @author MS
 *
 */
public class LanguageSelectionPolski {

	
	String[]  menu=new String[5];
	
	String[] game=new String[9];
	String[] planets=new String[9];
	String [] help=new String[1];
	String[] missions;
		public LanguageSelectionPolski(){
			menu=new String[5];
			menu[0]="Start";
			menu[1]="Naci\u015bnij przycisk \u017ceby rozpocz\u0105\u0107";
			menu[2]="Wybierz misj\u0119";
			menu[3]= "Wybierz j\u0119zyk";
			menu[4]="Pomoc";
			game=new String[9];
			game[0]="SILNIK";
			game[1]="Predko\u015bc statku";
			game[2]="Aktualna przepustnica";
			game[3]="Aktualna masa statku";
			game[4]="Pozosta\u0142e paliwo";
		 
			game[5]="Nazwa najbli\u017cszej planety";
			game[6]="Odleg\u0142o\u015b\u0107 do najbli\u017cszej planety";
			game[7]="X odleg\u0142o\u015b\u0107 do planety";
			game[8]="Y odleg\u0142o\u015b\u0107 do planety";
			
		        
		        help=new String[2];
		        help[0]="W grze DELTA SPACE AGENCY w1ykonujesz misje kosmiczn\u0105. \nTwoje zadanie polega na wyl\u0105dowaniu rakiet\u0105 na planecie , wyznaczonej przez wybran\u0105 misj\u0119.\n"
+"Rakiet\u0105 steruj\u0119 si\u0119 klawiatur\u0105 (strza\u0142ki) lub myszk\u0105(zmiana k\u0105ta ruchu).\n Rakieta zacznie si\u0119 porusza\u0107 po naci\u015bni\u0119ciu przycisku Silnik.\n Paliwo rakiety jest ograniczone.\n"
+"\nLista misji:\n"
+"1.	Misja 1  Cel: Merkury\n"
+"2.	Misja 2  Cel: Wenus\n"
+"3.	Misja 3  Cel: Ziemia\n"
+"4.	Misja 4  Cel: Mars\n" 
+"5.	Misja 5  Cel: Jowisz\n"
+"6.	Misja 6  Cel: Saturn\n"
+"7.	Misja 7  Cel: Uran\n"
+"8.	Misja 8  Cel: Neptun\n" 
+"Ka\u017cda misja rozpoczyna si\u0119 na Ziemi.\n";

            planets=new String[9];
            planets[0]="";
			planets[1]="Merkury";
			planets[2]="Wenus";
			planets[3]="Ziemia";
			planets[4]="Mars";
			planets[5]="Jowisz";
			planets[6]="Saturn";
			planets[7]="Uran";
            planets[8]="Neptun";
            
            missions=new String[8];
           
            missions[0]= "Misja 1";
            missions[1]= "Misja 2";
            missions[2]= "Misja 3";
            missions[3]= "Misja 4";
            missions[4]= "Misja 5";
            missions[5]= "Misja 6";
            missions[6]= "Misja 7";
            missions[7]= "Misja 8";
           
            
		}
}
/*Ä„ - \u0104; Ä… - \u0105
Ä† - \u0106; Ä‡ - \u0107
Ä� - \u0118; Ä™ - \u0119
Ĺ� - \u0141; Ĺ‚ - \u0142
Ĺ� - \u0143; Ĺ„ - \u0144
Ă“ - \u00d3; Ăł - \u00f3
Ĺš - \u015a; Ĺ› - \u015b
Ĺą - \u0179; Ĺş - \u017a
Ĺ» - \u017b; ĹĽ - \u017c
*/
