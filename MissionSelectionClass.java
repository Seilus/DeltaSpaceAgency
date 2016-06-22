package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author MS
 *Class for choosing game language, changes language to the one selected in missioncombobox
 */

public class MissionSelectionClass implements ActionListener{

	
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	MenuFrame menuFrame;
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		menuFrame.setMission(menuFrame.MissionComboBox.getSelectedIndex());
	}
}	
	
	
	

