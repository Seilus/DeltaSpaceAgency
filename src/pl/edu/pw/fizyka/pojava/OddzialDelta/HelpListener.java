package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author MS
 *	Class function is to manage help panel displaying information about the game	
 */
public class HelpListener implements ActionListener{
	
	LanguageSelectionEnglish english;
	LanguageSelectionPolski polish;
	
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	MenuFrame menuFrame;

	public HelpListener(LanguageSelectionEnglish english,LanguageSelectionPolski polish){
 		this.english=english;
 		this.polish=polish;
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		menuFrame.GameHelpOtherPanel.add(menuFrame.HelpText);
		menuFrame.GameHelpFrame.setSize(640,480);
		menuFrame.GameHelpFrame.add(menuFrame.GameHelpOtherPanel);
		menuFrame.GameHelpFrame.setVisible(true);
	}
	
}
