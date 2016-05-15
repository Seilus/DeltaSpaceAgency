package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ShipSteeringKeyboard implements KeyListener {

	Ship rocket;
	//GameWindow window;
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
        int key = e.getKeyCode(); 
		
		//System.out.println("lalala");
		switch(key) { 
		case KeyEvent.VK_RIGHT: 
			rocket.turnShip(-5);
			System.out.println(rocket.getAngle());
			break; 
		case KeyEvent.VK_LEFT: 
			rocket.turnShip(5);
			System.out.println(rocket.getAngle());
			break; 
		case KeyEvent.VK_UP:
			rocket.increaseThrottle(10);
			//System.out.println(rocket.getThrottleValue());
			break; 
		case KeyEvent.VK_DOWN: 
			rocket.increaseThrottle(-10);
			break; 
		} 
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public ShipSteeringKeyboard(Ship rocket){
		this.rocket=rocket;
		//this.window=okno;
	}

}
