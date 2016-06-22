package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
/**
 * 
 * @author KM
 *Listener responsible for turning the engine on/off and switching button color
 */
public class EngineToggleListener implements ActionListener {
	Ship rocket;
	JButton button;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(rocket.getFuelMass()>0){
			rocket.toggleEngine();
			if(button.getBackground()==Color.RED){
				button.setBackground(Color.GREEN);
			}
			else{
				button.setBackground(Color.RED);
			}
		}
		else{
			button.setBackground(Color.RED);
		}
	}
	
	public EngineToggleListener(JButton but, Ship rocket){
		this.rocket=rocket;
		this.button=but;
	}

}
