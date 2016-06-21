
package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 * 
 * @author MS
 *
 */

 public  class LanguageChooserListener implements ActionListener{
	 boolean polish;
	 Vector<String> missions;
	 public String Langmenu []=new String[5];
	 public String[] Languages ={"english","polski"};
	 JComboBox<Object> LanguageComboBox=new JComboBox<Object>(Languages);
	 JLabel test,test2;
	 MenuFrame menuFrame;
	 LanguageSelectionEnglish englishLang;
	 LanguageSelectionPolski polishLang;
	 HelpListener help;
	 String[] missionsSelection;
	 void setMenuFrame(MenuFrame menuFrame){
			this.menuFrame=menuFrame;
		}
	 
	
    	@Override
		public void actionPerformed(ActionEvent e) {
			 if(LanguageComboBox.getSelectedIndex()==0){
			   menuFrame.setHelpInfo(englishLang.help);
		    	menuFrame.setName(englishLang.menu);
		    	for(int ii=0;ii<8;ii++){
		    		missions.removeElement(polishLang.missions[ii]);
		    		missions.addElement(englishLang.missions[ii]);
		            
		            }
		    	
		    	polish=false;
		    	// planetInfo.setNamePlanet(t.game);
		    	//shipStatus.setNameShip(t.game);
			 }
			
			if(LanguageComboBox.getSelectedIndex()==1){
				menuFrame.setHelpInfo(polishLang.help);
				menuFrame.setName(polishLang.menu);
				for(int ii=0;ii<8;ii++){
					missions.removeElement(englishLang.missions[ii]);
					missions.addElement(polishLang.missions[ii]);
	            }
				
				
				polish=true;
		        //planetInfo.setNamePlanet(t.game);
		        //shipStatus.setNameShip(t.game);
			 }
			
			}
    	
			public LanguageChooserListener(LanguageSelectionEnglish englishLang, LanguageSelectionPolski polishLang){
				this.englishLang=englishLang;
				this.polishLang=polishLang;
				missions=new  Vector<String>(); 
				for(int ii=0;ii<=4;ii++){
					Langmenu[ii]=englishLang.menu[ii];
				}	 			
				

					for(int ii=0;ii<8;ii++){
						missions.addElement(englishLang.missions[ii]);
			            
			            }
				

			 }
 }
	
