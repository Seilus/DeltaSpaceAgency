import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpListener implements ActionListener{
	
	
	
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	MenuFrame menuFrame;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		menuFrame.HelpText.setText("Info");
		menuFrame.GameHelpOtherPanel.add(menuFrame.HelpText);
		menuFrame.GameHelpFrame.setSize(400,200);
		menuFrame.GameHelpFrame.add(menuFrame.GameHelpOtherPanel);
		menuFrame.GameHelpFrame.setVisible(true);
	}
	
}
