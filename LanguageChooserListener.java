package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

 public  class LanguageChooserListener implements ActionListener{
	 public String Langmenu []=new String[5];
	 public String[] Languages ={"english","polski"};
	
	 JComboBox LanguageComboBox=new JComboBox(Languages);
	 JLabel test,test2;
	 
	 void setMenuFrame(MenuFrame menuFrame){
			this.menuFrame=menuFrame;
		}
	 void setPlanetInfo(PlanetInfo planetInfo){
			this.planetInfo=planetInfo;
		}
	 void setShipStatus(ShipStatus shipStatus){
		 this.shipStatus=shipStatus;
	 }
		PlanetInfo planetInfo;
	    MenuFrame menuFrame;
	    ShipStatus shipStatus;
	
    	@Override
		public void actionPerformed(ActionEvent e) {
			 if(LanguageComboBox.getSelectedIndex()==0){
				
				LanguageSelectionEnglish t= new LanguageSelectionEnglish();
		    	menuFrame.setName(t.menu);
		        planetInfo.setNamePlanet(t.game);
		        shipStatus.setNameShip(t.game);
			 }
			
			if(LanguageComboBox.getSelectedIndex()==1){
				
				LanguageSelectionPolski t=new LanguageSelectionPolski();
				menuFrame.setName(t.menu);
		        planetInfo.setNamePlanet(t.game);
		        shipStatus.setNameShip(t.game);
			 }
			
			}
    	
			public LanguageChooserListener(){
				
	    	 LanguageSelectionEnglish ttt=new LanguageSelectionEnglish();
	    	 for(int ii=0;ii<=4;ii++){
		    	  Langmenu[ii]=ttt.menu[ii];
	    	 }	 
			
			 }
 }
	


