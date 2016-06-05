package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class MissionSelectionClass implements ActionListener{
	 public String [] Missions={"Mission 1","Mission 2"}; 
	 MenuFrame menuFrame;
	 JComboBox MissionComboBox=new JComboBox(Missions);
@Override
public void actionPerformed(ActionEvent e) {
	 if(MissionComboBox.getSelectedIndex()==0){
		 menuFrame.setMission(0);
		
	 }
	
	if(MissionComboBox.getSelectedIndex()==1){
		 menuFrame.setMission(1);
		
	 }
	
	
	}

	
	
	
	
	
	
	
}