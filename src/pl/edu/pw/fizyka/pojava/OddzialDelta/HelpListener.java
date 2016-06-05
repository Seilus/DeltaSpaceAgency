package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpListener implements ActionListener{
	LanguageSelectionEnglish english;
	
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	MenuFrame menuFrame;
	public HelpListener(LanguageSelectionEnglish english){
		this.english=english;
		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		menuFrame.HelpText.setText(english.help[0]);
		menuFrame.GameHelpOtherPanel.add(menuFrame.HelpText);
		menuFrame.GameHelpFrame.setSize(400,200);
		menuFrame.GameHelpFrame.add(menuFrame.GameHelpOtherPanel);
		menuFrame.GameHelpFrame.setVisible(true);
	}
	
}
