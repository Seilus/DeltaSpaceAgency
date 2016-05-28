package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

 public  class LanguageChooserListener implements ActionListener{
	 public String Langmenu []=new String[5];
	 public String[] Languages ={"polski","english"};
	
	 JComboBox LanguageComboBox=new JComboBox(Languages);
	 JLabel test,test2;
	 
	 void setMenuFrame(MenuFrame menuFrame){
			this.menuFrame=menuFrame;
		}
	 
	 MenuFrame menuFrame;
	
    	@Override
		public void actionPerformed(ActionEvent e) {
			 if(LanguageComboBox.getSelectedIndex()==0){
				
				LanguageSelectionPolski t= new LanguageSelectionPolski();
		    	menuFrame.setName(t.menu);
		    
			 }
			
			if(LanguageComboBox.getSelectedIndex()==1){
				
				LanguageSelectionEnglish t=new LanguageSelectionEnglish();
				menuFrame.setName(t.menu);
		  
			 }
			
			}
    	
			public LanguageChooserListener(){
				
	    	 LanguageSelectionEnglish ttt=new LanguageSelectionEnglish();
	    	 for(int ii=0;ii<=4;ii++){
		    	  Langmenu[ii]=ttt.menu[ii];
	    	 }	 
			
			 }
 }
	

