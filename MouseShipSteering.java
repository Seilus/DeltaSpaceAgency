package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Timer;
/**
 * 
 * @author KM
 *class holds listeners responsible for making the ship turn constantly while mouse button is being held
 */
public class MouseShipSteering implements MouseListener {
	GameWindow okno;
	GameMap map;
	Ship rocket;
	Timer turn;
	public MouseShipSteering(GameWindow okno, Ship rocket, GameMap map){
		this.okno=okno;
		this.map=map;
		this.rocket=rocket;
		//timer allows for constant turning while mouse button is held
		Timer turn=new Timer(30, null);
		this.turn=turn;
		turn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//function takes mouse position and gradually turns ship in the direction of the lesser angle
				Point p=map.getMousePosition();
				try{
				int Y=(int) (-(p.getY()-(map.getHeight()/2)));
				int X=(int) (p.getX()-(map.getWidth()/2));
				double turnAngle=calculateTurn(X, Y);
				if(Math.abs(rocket.getAngle()-turnAngle)<180){
					if((rocket.getAngle()-turnAngle)>2){
						rocket.turnShip(-1);
					}
					else if((rocket.getAngle()-turnAngle)<-2){
						rocket.turnShip(1);
					}
				}
				else{
					if((rocket.getAngle()-turnAngle)>2){
						rocket.turnShip(1);
					}
					else if((rocket.getAngle()-turnAngle)<-2){
						rocket.turnShip(-1);
					}
				}
				
				}catch(Exception e){

					//System.err.println("Error: " + e.getMessage());
				}
			}
			
		});
	}
	
	@Override
	public void mouseClicked(MouseEvent m) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent m) {
		turn.start();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		turn.stop();
	}
	
	private double calculateTurn(int xCoordinate, int yCoordinate){
		double turnAngle=Math.atan((double)yCoordinate/(double)xCoordinate)*180/Math.PI;
		if(xCoordinate<map.getX()/2){
			turnAngle=180+Math.atan((double)yCoordinate/(double)xCoordinate)*180/Math.PI;
		}
		else if(xCoordinate>map.getX()/2 && yCoordinate<map.getY()/2){
			turnAngle=360+Math.atan((double)yCoordinate/(double)xCoordinate)*180/Math.PI;
		}
		return turnAngle;
		
	}

}
