package pl.edu.pw.fizyka.pojava.OddzialDelta;


import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class GameWindow extends JFrame implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameWindow(GameMap map, GameHUD hud) throws HeadlessException {
		GridBagLayout gridBag=new GridBagLayout();
		GridBagConstraints gridC=new GridBagConstraints();
		setLayout(gridBag);
		gridC.weighty=0.85;
		gridC.weightx=1d;
		gridC.ipadx=1;
		gridC.ipady=1;
		gridC.fill=GridBagConstraints.BOTH;
		gridBag.setConstraints(map, gridC);
		this.add(map);
		gridC.weighty=0.15;
		gridC.gridy=1;
		gridC.weightx=1d;
		gridC.ipadx=1;
		gridC.ipady=1;
		gridC.fill=GridBagConstraints.BOTH;
		gridBag.setConstraints(hud, gridC);
		this.add(hud);
		this.setTitle("DELTA Space Agency");
		this.setSize(1200, 600);
		
	}

@Override
    public void keyPressed(KeyEvent ke) {
        int key = ke.getKeyCode(); 
		switch(key) { 
		case KeyEvent.VK_RIGHT: 
		
		break; 
		case KeyEvent.VK_LEFT: 
		
			break; 
		case KeyEvent.VK_UP: 

			break; 
		case KeyEvent.VK_DOWN: 
		
			break; 
		} 
	}
	 @Override
	    public void keyReleased(KeyEvent arg0) {}
	 
	    @Override
	    public void keyTyped(KeyEvent arg0){}
	    
	    
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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CelestialBody[] planetSystem=new CelestialBody[3];{
			planetSystem[0]=new CelestialBody(42, 0, 0.018, 300, -100, 25);
			planetSystem[1]=new CelestialBody(9005500, 0, 0, 200, -100, 65);
			planetSystem[2]=new CelestialBody(60, 0.15, 0, -100, -300, 20);
		}
<<<<<<< HEAD
		MenuFrame t= new MenuFrame();
		t.setSize(640, 480); 
		t.setVisible(true);
		Ship rocket=new Ship(0, 0);
		GameMap testMap=new GameMap(planetSystem, rocket);
=======
		Ship Ship= new Ship(10,2);
		 MenuFrame t= new MenuFrame();
		 t.setSize(640, 480); 
			t.setVisible(true);	
		GameMap testMap=new GameMap(planetSystem,Ship);
>>>>>>> 5fc0c40cf62e9eedbce24fce538d9dd6ee72e3f9
		GameHUD testHUD=new GameHUD();
		GameWindow okno=new GameWindow(testMap, testHUD);
		Ship Ship=new Ship();
	        Ship.shipMovement(planetSystem);
		okno.setVisible(true);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//rocket.setPosX(testMap.getWidth()/2);
		//rocket.setPosY(testMap.getHeight()/2);
		boolean collisionDetector=false;

		while(collisionDetector==false){
<<<<<<< HEAD
			GravityCalculation.computeGPlanets(planetSystem, 5);
			GravityCalculation.computeGShip(planetSystem, 5, rocket);
			rocket.shipMovement(planetSystem, 5);
=======
			GravityCalculation.computeGPlanets(planetSystem, 2);
>>>>>>> 5fc0c40cf62e9eedbce24fce538d9dd6ee72e3f9
			testMap.repaint();
			for(int ii=0; ii<planetSystem.length; ii++){
				System.out.println(planetSystem[ii].getX()+", "+planetSystem[ii].getY());
				for(int jj=0; jj<planetSystem.length; jj++){
					if(jj!=ii){
						if(Math.sqrt(Math.pow((planetSystem[jj].getX())-(planetSystem[ii].getX()), 2)+Math.pow((planetSystem[jj].getY())-(planetSystem[ii].getY()), 2))<=((planetSystem[jj].getRadius())+(planetSystem[ii].getRadius()))){
							collisionDetector=true;

						}	
							
					}
				}
			}
		
			try {
				TimeUnit.MILLISECONDS.sleep(1);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}			
}

