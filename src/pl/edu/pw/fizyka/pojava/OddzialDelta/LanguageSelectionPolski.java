package pl.edu.pw.fizyka.pojava.OddzialDelta;

public class LanguageSelectionPolski {

	
	String[]  menu=new String[5];
	
	String[] game=new String[9];
	String[] planets=new String[9];
	String [] help=new String[1];
	//String[] missions={"Misja 1","Misja 2","Misja 3","Misja 4","Misja 5","Misja 6","Misja 7","Misja 8","Misja 9"};
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
			
		        
		        help=new String[1];
		        help[0]="W grze .... Wykonujesz misje kosmiczn\u0105. \nTwoje zadanie polega na wyl\u0105dowaniu rakiet\u0105 na planecie , wyznaczonej przez wybran\u0105 misj\u0119.\n"
+"Rakiet\u0105 steruj\u0119 si\u0119 klawiatur\u0105 (strza\u0142ki) lub myszk\u0105(zmiana k\u0105ta ruchu).\n Rakieta zacznie si\u0119 porusza\u0107 po naci\u015bni\u0119ciu przycisku Silnik.\n Paliwo rakiety jest ograniczone.\n"
+"\nLista misji:\n"
+"1.	Misja 1  Cel: S\u0142o\u0144ce\n"
+"2.	Misja 2  Cel: Merkury\n"
+"3.	Misja 3  Cel: Wenus\n"
+"4.	Misja 4  Cel: Mars\n" 
+"5.	Misja 5  Cel: Jowisz\n"
+"6.	Misja 6  Cel: Saturn\n"
+"7.	Misja 7  Cel: Uran\n"
+"8.	Misja 8  Cel: Neptun\n" 
+"Ka\u017cda misja rozpoczyna si\u0119 na Ziemi.\n";

            planets=new String[9];
            planets[0]="S\u0142\u0144ce";
			planets[1]="Merkury";
			planets[2]="Wenus";
			planets[3]="Ziemia";
			planets[4]="Mars";
			planets[5]="Jowisz";
			planets[6]="Saturn";
			planets[7]="Uran";
            planets[8]="Neptun";
		}
}
/*Ą - \u0104; ą - \u0105
Ć - \u0106; ć - \u0107
Ę - \u0118; ę - \u0119
Ł - \u0141; ł - \u0142
Ń - \u0143; ń - \u0144
Ó - \u00d3; ó - \u00f3
Ś - \u015a; ś - \u015b
Ź - \u0179; ź - \u017a
Ż - \u017b; ż - \u017c
*/
