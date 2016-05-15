package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EngineToggleListener implements ActionListener {

	Ship rocket;
	JButton button;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
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
