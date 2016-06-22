package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author MS
 *	
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
		menuFrame.GameHelpFrame.setSize(600,300);
		menuFrame.HelpText.setOpaque(false);
		
		//menuFrame.GameHelpFrame.setSize(500,300);
		//menuFrame.GameHelpFrame.add(menuFrame.GameHelpOtherPanel);
		
		menuFrame.GameHelpOtherPanel.repaint();
		menuFrame.HelpText.setEditable(false);
		menuFrame.GameHelpOtherPanel.setEnabled(false);
		Font helpFont=new Font("Tahoma", Font.BOLD, 11);
	    menuFrame.HelpText.setForeground(Color.YELLOW);
	    menuFrame.HelpText.setFont(helpFont);
	     menuFrame.GameHelpFrame.setVisible(true);
	     menuFrame.GameHelpOtherPanel.add(menuFrame.HelpText);
		 
		//menuFrame.GameHelpFrame.add(menuFrame.GameHelpOtherPanel);
	}
	
}
