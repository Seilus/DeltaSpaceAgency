package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameWindow() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public GameWindow(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GameWindow(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GameWindow(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CelestialBody[] planetSystem=new CelestialBody[3];{
			planetSystem[0]=new CelestialBody(42, 0, 0.018, 600, 350, 25);
			planetSystem[1]=new CelestialBody(1055, 0, 0, 350, 350, 65);
			planetSystem[2]=new CelestialBody(63, 0.015, 0, 350, 100, 20);
		}
		
		GameMap testMap=new GameMap(planetSystem);	
		GameWindow okno=new GameWindow();
		okno.setSize(1000, 800);
		okno.setContentPane(testMap);
		okno.setVisible(true);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean collisionDetector=false;

		while(collisionDetector==false){
			GravityCalculator.computeAcceleration(planetSystem, 2);
			okno.setContentPane(testMap);
			//System.out.println(planetSystem[1].getSpeedX());
			for(int ii=0; ii<planetSystem.length; ii++){
				for(int jj=0; jj<planetSystem.length; jj++){
					if(jj!=ii){
						if(Math.sqrt(Math.pow((planetSystem[jj].getX())-(planetSystem[ii].getX()), 2)+Math.pow((planetSystem[jj].getY())-(planetSystem[ii].getY()), 2))<=((planetSystem[jj].getRadius())+(planetSystem[ii].getRadius()))){
							collisionDetector=true;
						}	
							
					}
				}
			}
		
			try {
				TimeUnit.NANOSECONDS.sleep(100);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}			
}

