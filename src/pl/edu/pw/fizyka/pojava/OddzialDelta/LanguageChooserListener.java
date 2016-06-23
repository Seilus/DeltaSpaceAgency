
package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 * 
 * @author MS
 *Class for choosing game language, changes language to the one selected in missioncombobox
 */

 public  class LanguageChooserListener implements ActionListener{
	 boolean polish;
	 public String Langmenu []=new String[5];
	 public String[] Languages ={"english","polski"};

	 JComboBox<Object> LanguageComboBox=new JComboBox<Object>(Languages);

	 JLabel test,test2;
	 MenuFrame menuFrame;
	 LanguageSelectionEnglish englishLang;
	 LanguageSelectionPolski polishLang;
	 
	 HelpListener help;
	 String[] planets;
	 void setMenuFrame(MenuFrame menuFrame){
			this.menuFrame=menuFrame;
			menuFrame.setHelpInfo(englishLang.help);
	}
	 
	
    	@Override
		public void actionPerformed(ActionEvent e) {
			 if(LanguageComboBox.getSelectedIndex()==0){
				
		    	menuFrame.setName(englishLang.menu);
		    	menuFrame.setHelpInfo(englishLang.help);
		    	menuFrame.setName(englishLang.menu);
		    	menuFrame.HelpText.setText(englishLang.help);
				menuFrame.GameHelpFrame.setSize(500,300);
		    	polish=false;
		    	planets=englishLang.planets;
		    	menuFrame.setMissionBox();
		    	menuFrame.validate();
		    	// planetInfo.setNamePlanet(t.game);
		    	//shipStatus.setNameShip(t.game);
			 }
			
			if(LanguageComboBox.getSelectedIndex()==1){
				menuFrame.setName(polishLang.menu);
				menuFrame.setHelpInfo(polishLang.help);
				menuFrame.setName(polishLang.menu);
				menuFrame.HelpText.setText(polishLang.help);
				menuFrame.GameHelpFrame.setSize(550,350);
				planets=polishLang.planets;
				menuFrame.setMissionBox();
				polish=true;
				menuFrame.validate();
		        //planetInfo.setNamePlanet(t.game);
		        //shipStatus.setNameShip(t.game);
			 }
			
			}
    	
			public LanguageChooserListener(LanguageSelectionEnglish englishLang, LanguageSelectionPolski polishLang){
				this.englishLang=englishLang;
				this.polishLang=polishLang;
				//menuFrame.HelpText.setText(englishLang.help);
				//menuFrame.GameHelpFrame.setSize(500,300);
				for(int ii=0;ii<=4;ii++){
					Langmenu[ii]=englishLang.menu[ii];
				}
				planets=new String[9];
				planets=englishLang.planets;
			 }
 }	
