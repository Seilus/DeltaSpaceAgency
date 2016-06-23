package pl.edu.pw.fizyka.pojava.OddzialDelta;
/**
 * 
 * @author MS
 *Polish language class, containing all needed text in this language
 */
public class LanguageSelectionPolski {

	String[]  menu;
	String[] game;
	String[] planets;
	String[] landing;
	String help;
	
	public LanguageSelectionPolski(){
		menu=new String[5];
		menu[0]="Start";
		menu[1]="Naci\u015bnij przycisk \u017ceby rozpocz\u0105\u0107";
		menu[2]="Wybierz misj\u0119";
		menu[3]= "Wybierz j\u0119zyk";
		menu[4]="Pomoc dla nowych graczy!";
		game=new String[9];
		game[0]="SILNIK";
		game[1]="Predko\u015b\u0107 statku";
		game[2]="Stan przepustnicy";
		game[3]="Masa statku";
		game[4]="Pozosta\u0142e paliwo";
		game[5]="Cel: ";
		game[6]="Odleg\u0142o\u015b\u0107 do celu: ";
		game[7]="Pr\u0119dko\u015b\u0107 celu: ";
		game[8]="Odleg\u0142o\u015b\u0107 do s\u0142o\u0144ca: "; 
		help=new String();
		help="Zagubiony w kosmosie.\nTw\u00f3j statek zosta\u0142 uszkodzony i dryfuje w przestrzeni.\nOd ciebie zale\u017cy, czy b\u0119dziesz kontynuowa\u0142 misj\u0119, czy te\u017c powr\u00f3cisz na Ziemi\u0119.\n"
		 		+ "Wybierz planet\u0119 docelow\u0105, i kontynuuj lot\n\nUwa\u017caj jednak, gdy\u017c obecny stan rakiety nie pozwoli na\nkontynuowanie lotu po wyl\u0105dowaniu.\n"
		 		+ "Monitoruj swoj\u0105 pr\u0119dko\u015b\u0107, poniewa\u017c system wspomagaj\u0105cy l\u0105dowanie zosta\u0142 wy\u0142\u0105czony\nwi\u0119c b\u0119dzie trzeba przeprowadzi\u0107 l\u0105dowanie bardzo delikatnie.\n"
		 		+ "Je\u015bli dasz si\u0119 ponie\u015b\u0107 rozpaczy, zawsze zostaje samob\u00f3jczy lot na s\u0142o\u0144ce,\nlub zderzenie z planet\u0105 z du\u017c\u0105 pr\u0119dko\u015bci\u0105.\n\n"
		 		+ "Niezale\u017cnie od wyboru, siadasz za sterami by zaznajomi\u0107 si\u0119 z maszyn\u0105.\n\n"
		 		+ "Sterowanie:\n"
		 		+ "Strza\u0142ki- Lewo/Prawo: obr\u00f3t statku, G\u00f3ra/D\u00f3\u0142: przyspiesz/zwolnij\n"
		 		+ "Lewy przycisk myszy: obr\u00f3t statku (z wi\u0119ksz\u0105 precyzj\u0105)\n"
		 		+ "Za pomoc\u0105 myszy mo\u017cna te\u017c sterowa\u0107 silnikiem i wajh\u0105 przepustnicy\n"
		 		+ "Spacja: wy\u0142\u0105cz/w\u0142\u0105cz silnik\n\n"
		 		+ "Radar w prawym dolnym rogu poprowadzi ci\u0119 do celu\n"
		 		+ "Zwracaj uwag\u0119 zar\u00f3wno na niego, jak i na dwa monitory wy\u015bwietlaj\u0105ce wa\u017cne informacje\n\n"
		 		+ "T\u0142o autorstwa Lyshastra";
		planets=new String[9];
        planets[0]="S\u0142o\u0144ce";
        planets[1]="Merkury";
		planets[2]="Wenus";
		planets[3]="Ziemia";
		planets[4]="Mars";
		planets[5]="Jowisz";
		planets[6]="Saturn";
		planets[7]="Uran";
        planets[8]="Neptun";
        
        landing=new String[10];
		landing[0]="Tak oto dobiega ko\u0144ca misja, i \u017cycie za\u0142ogi";
		landing[1]="Mimo niepowodzenia misji, statek wyl\u0105dowa\u0142 bezpiecznie";
		landing[2]="Bez paliwa na powr\u00f3t, pozostaje jedynie";
		landing[3]= "zutylizowa\u0107 pozosta\u0142\u0105 cz\u0119\u015b\u0107 zapas\u00f3w statku";
		landing[4]="Gratulacje!";
		landing[5]= "Pomimo przeszk\u00f3d, misja zako\u0144czy\u0142a si\u0119 sukcesem";
		landing[6]= "Statek ratowniczy jest ju\u017c w drodze";
		landing[7]= "by zabra\u0107 za\u0142og\u0119 do domu";
		landing[8]="I tak oto za\u0142oga wr\u00f3ci\u0142a do domu";
		landing[9]="nie zaznali chwa\u0142y zwyci\u0119stwa, ale uszli z \u017cyciem";
		}
}
/*
• - \u0104; π - \u0105
∆ - \u0106; Ê - \u0107
  - \u0118; Í - \u0119
£ - \u0141; ≥ - \u0142
— - \u0143; Ò - \u0144
” - \u00d3; Û - \u00f3
å - \u015a; ú - \u015b
è - \u0179; ü - \u017a
Ø - \u017b; ø - \u017c

*/

