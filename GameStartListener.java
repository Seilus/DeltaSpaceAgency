package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStartListener implements ActionListener {
	
	GameWindow window;
	MenuFrame menuFrame;
	GameAnimation animation;
	
	void setMenuFrame(MenuFrame menuFrame){
		this.menuFrame=menuFrame;
	}
	
	public GameStartListener(GameWindow window, GameAnimation animation){
		this.window=window;
		this.animation=animation;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		window.setVisible(true);
		animation.animationStart();
		menuFrame.setVisible(false);;
	}

}
