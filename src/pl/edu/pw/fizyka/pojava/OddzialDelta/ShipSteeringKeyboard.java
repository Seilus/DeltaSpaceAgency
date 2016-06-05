package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

public class ShipSteeringKeyboard implements KeyEventDispatcher {
	//listener for steering the ship with arrow keys 
	Ship rocket;

	
	public boolean dispatchKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub
        int key = e.getKeyCode(); 
		
		switch(key) { 
		case KeyEvent.VK_RIGHT: 
			rocket.turnShip(-5);
			break; 
		case KeyEvent.VK_LEFT: 
			rocket.turnShip(5);
			break; 
		case KeyEvent.VK_UP:
			rocket.increaseThrottle(10);
			break; 
		case KeyEvent.VK_DOWN: 
			rocket.increaseThrottle(-10);
			break;	
		} 
		return false;
	}
	public ShipSteeringKeyboard(Ship rocket){
		this.rocket=rocket;
	}

}
