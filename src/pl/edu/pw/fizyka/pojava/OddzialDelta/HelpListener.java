package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpListener implements ActionListener{
	LanguageSelectionEnglish english;
	LanguageSelectionPolski polish;
	
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	MenuFrame menuFrame;
	public HelpListener(LanguageSelectionEnglish english,LanguageSelectionPolski polish){
		this.english=english;
		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(menuFrame.languageListener.polish){
			
			menuFrame.HelpText.setText(polish.help[0]);
			menuFrame.GameHelpFrame.setSize(550,350);
		}
		else{
		menuFrame.HelpText.setText(english.help[0]);
		menuFrame.GameHelpFrame.setSize(500,300);
		}
		menuFrame.GameHelpOtherPanel.add(menuFrame.HelpText);
		//menuFrame.GameHelpFrame.setSize(500,300);
		menuFrame.GameHelpFrame.add(menuFrame.GameHelpOtherPanel);
		menuFrame.GameHelpFrame.setVisible(true);
	}
	
}
