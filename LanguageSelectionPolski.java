package pl.edu.pw.fizyka.pojava.OddzialDelta;
/**
 * 
 * @author MS
 *
 */
public class LanguageSelectionPolski {

	String[]  menu;
	String[] game;
	String[] planets;
	String[] landing;
	String help;
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
		game[2]="Stan przepustnicy";
		game[3]="Masa statku";
		game[4]="Pozosta\u0142e paliwo";
		game[5]="Cel: ";
		game[6]="Odleg\u0142o\u015b\u0107 do celu: ";
		game[7]="Prędkość celu: ";
		game[8]="Odległość do słońca: "; 
		help=new String();
		help="Zagubiony w kosmosie.\nTwój statek został uszkodzony i dryfuje w przestrzeni.\nOd ciebie zależy, czy będziesz kontynuował misję, czy też powrócisz na Ziemię.\n"
		 		+ "Wybierz planetę docelową, i kontynuuj lot\n\nUważaj jednak, gdyż obecny stan rakiety nie pozwoli na\nkontynuowanie lotu po wylądowaniu.\n"
		 		+ "Monitoruj swoją prędkość, ponieważ system wspomagający lądowanie został wyłączony\nwięc będzie trzeba przeprowadzić lądowanie bardzo delikatnie.\n"
		 		+ "Jeśli dasz się ponieść rozpaczy, zawsze zostaje samobójczy lot na słońce,\nlub zderzenie z planetą z dużą prędkością.\n\n"
		 		+ "Niezależnie od wyboru, siadasz za sterami by zaznajomić się z maszyną.\n\n"
		 		+ "Sterowanie:\n"
		 		+ "Strzałki- Lewo/Prawo: obrót statku, Góra/Dół: przyspiesz/zwolnij\n"
		 		+ "Lewy przycisk myszy: obrót statku (z większą precyzją)\n"
		 		+ "Za pomocą myszy można też sterować silnikiem i wajhą przepustnicy\n"
		 		+ "Spacja: wyłącz/włącz silnik\n\n"
		 		+ "Radar w prawym dolnym rogu poprowadzi cię do celu\n"
		 		+ "Zwracaj uwagę zarówno na niego, jak i na dwa monitory wyświetlające ważne informacje";
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
		landing[0]="Tak oto dobiega końca misja, i życie załogi";
		landing[1]="Mimo niepowodzenia misji, statek wylądował bezpiecznie";
		landing[2]="Bez paliwa na powrót, pozostaje jedynie";
		landing[3]= "zutylizować pozostałą część zapasów statku";
		landing[4]="Gratulacje!";
		landing[5]= "Pomimo przeszkód, misja zakończyła się sukcesem";
		landing[6]= "Statek ratowniczy jest już w drodze";
		landing[7]= "by zabrać załogę do domu";
		landing[8]="I tak oto załoga wróciła do domu";
		landing[9]="nie zaznali chwały zwycięstwa, ale uszli z życiem";
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

