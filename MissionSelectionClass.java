package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author MS
 *Class managing mission selection for the game
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
	
	
	

