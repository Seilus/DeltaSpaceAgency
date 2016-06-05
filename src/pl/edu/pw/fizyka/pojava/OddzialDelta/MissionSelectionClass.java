package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MissionSelectionClass implements ActionListener{

	
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	MenuFrame menuFrame;
		
	
	
@Override
public void actionPerformed(ActionEvent e) {
	 if(menuFrame.MissionComboBox.getSelectedIndex()==0){
		 menuFrame.setMission(0);
		
	 }
	
	if(menuFrame.MissionComboBox.getSelectedIndex()==1){
		 menuFrame.setMission(1);
		
	 }
	 if(menuFrame.MissionComboBox.getSelectedIndex()==2){
		 menuFrame.setMission(2);
		
	 }
	
	if(menuFrame.MissionComboBox.getSelectedIndex()==3){
		 menuFrame.setMission(3);
		
	 }
	 if(menuFrame.MissionComboBox.getSelectedIndex()==4){
		 menuFrame.setMission(4);
		
	 }
	
	if(menuFrame.MissionComboBox.getSelectedIndex()==5){
		 menuFrame.setMission(5);
		
	 }
	if(menuFrame.MissionComboBox.getSelectedIndex()==6){
		 menuFrame.setMission(6);
		
	 }
	
	if(menuFrame.MissionComboBox.getSelectedIndex()==7){
		 menuFrame.setMission(7);
		
	 }
	 if(menuFrame.MissionComboBox.getSelectedIndex()==8){
		 menuFrame.setMission(8);
		
	 }
	
	if(menuFrame.MissionComboBox.getSelectedIndex()==9){
		 menuFrame.setMission(9);
	}

}
	
	
	
	
	
	
}
