package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 * 
 * @author KM & MS
 *	The class paints the ship in the middle, and all planets in their positions respective to the ship
 *	Also shows victory/loss messages after landing
 */
public class GameMap extends JPanel {
	private static final long serialVersionUID = 1L;

	private CelestialBody[] planetSystem;
	private Ship rocket;
	private BufferedImage image, image1, image2, image3, image4, image5, image6, image7, image8;
	public int starsLocationX[] =new int [1200];
	public int starsLocationY[]= new int[1200];
	Random stars;
	private int landingStatus;
	//private String[] landingMessages;
	private int planetLandedOn;
	public GameMap(CelestialBody[] planetarySystem, Ship rocket, String[] landingMessages) {
		landingStatus=0;
		planetSystem=planetarySystem;	
		Dimension pref=new Dimension(1200, 510);
		Dimension min=new Dimension(640, 480);
		this.setPreferredSize(pref);
		this.setMinimumSize(min);
		this.rocket=rocket;
		stars=new Random();
		//this.landingMessages=landingMessages;
		for(int ii=0;ii<1200;ii++){
			starsLocationX[ii]=stars.nextInt(1200);
			starsLocationY[ii]=stars.nextInt(1200);
		}

		File imageFile = new File("sun.png");
		try {
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile1 = new File("mercury.png");
		try {
			image1 = ImageIO.read(imageFile1);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile2 = new File("venus.png");
		try {
			image2 = ImageIO.read(imageFile2);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile3 = new File("Earth.png");
		try {
			image3 = ImageIO.read(imageFile3);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile4 = new File("Mars.png");
		try {
			image4 = ImageIO.read(imageFile4);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile5 = new File("Jupiter.png");
		try {
			image5 = ImageIO.read(imageFile5);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile6 = new File("Saturn.png");
		try {
			image6 = ImageIO.read(imageFile6);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile7 = new File("Uranus.png");
		try {
			image7 = ImageIO.read(imageFile7);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile8 = new File("Neptune.png");
		try {
			image8 = ImageIO.read(imageFile8);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
}
	
	public void changeLandingStatus(int landingStatus, int planet){
		this.landingStatus=landingStatus;
		planetLandedOn=planet;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
		Font drawFont=new Font("Tahoma", Font.BOLD, 14);
		g.setFont(drawFont);
		
		
		
		setBackground(Color.BLACK);
		for(int ii=0; ii<1200; ii++){
		if(ii>600){
			g.setColor(Color.LIGHT_GRAY);
		}
		else{
			g.setColor(Color.WHITE);
		}
		g.fillOval(starsLocationX[ii],starsLocationY[ii],3,3);
		}
	
		g.drawImage(image, (int)(planetSystem[0].getX()-planetSystem[0].getRadius())/6+this.getWidth()/2, (int)(planetSystem[0].getY()-planetSystem[0].getRadius())/6+this.getHeight()/2, planetSystem[0].getRadius()*2/6, planetSystem[0].getRadius()*2/6, this);
		g.drawImage(image1, (int)(planetSystem[1].getX()-planetSystem[1].getRadius())/6+this.getWidth()/2, (int)(planetSystem[1].getY()-planetSystem[1].getRadius())/6+this.getHeight()/2, planetSystem[1].getRadius()*2/6, planetSystem[1].getRadius()*2/6, this);
		g.drawImage(image2, (int)(planetSystem[2].getX()-planetSystem[2].getRadius())/6+this.getWidth()/2, (int)(planetSystem[2].getY()-planetSystem[2].getRadius())/6+this.getHeight()/2, planetSystem[2].getRadius()*2/6, planetSystem[2].getRadius()*2/6, this);
		g.drawImage(image3, (int)(planetSystem[3].getX()-planetSystem[3].getRadius())/6+this.getWidth()/2, (int)(planetSystem[3].getY()-planetSystem[3].getRadius())/6+this.getHeight()/2, planetSystem[3].getRadius()*2/6, planetSystem[3].getRadius()*2/6, this);
		g.drawImage(image4, (int)(planetSystem[4].getX()-planetSystem[4].getRadius())/6+this.getWidth()/2, (int)(planetSystem[4].getY()-planetSystem[4].getRadius())/6+this.getHeight()/2, planetSystem[4].getRadius()*2/6, planetSystem[4].getRadius()*2/6, this);
		g.drawImage(image5, (int)(planetSystem[5].getX()-planetSystem[5].getRadius())/6+this.getWidth()/2, (int)(planetSystem[5].getY()-planetSystem[5].getRadius())/6+this.getHeight()/2, planetSystem[5].getRadius()*2/6, planetSystem[5].getRadius()*2/6, this);
		g.drawImage(image6, (int)(planetSystem[6].getX()-planetSystem[6].getRadius())/6+this.getWidth()/2-13, (int)(planetSystem[6].getY()-planetSystem[6].getRadius())/6+this.getHeight()/2-10, planetSystem[6].getRadius()*2/6+26, planetSystem[6].getRadius()*2/6+20, this);
		g.drawImage(image7, (int)(planetSystem[7].getX()-planetSystem[7].getRadius())/6+this.getWidth()/2, (int)(planetSystem[7].getY()-planetSystem[7].getRadius())/6+this.getHeight()/2, planetSystem[7].getRadius()*2/6, planetSystem[7].getRadius()*2/6, this);
		g.drawImage(image8, (int)(planetSystem[8].getX()-planetSystem[8].getRadius())/6+this.getWidth()/2, (int)(planetSystem[8].getY()-planetSystem[8].getRadius())/6+this.getHeight()/2, planetSystem[8].getRadius()*2/6, planetSystem[8].getRadius()*2/6, this);
		g.setColor(Color.YELLOW);
		g.drawLine(this.getWidth()/2, this.getHeight()/2, this.getWidth()/2+(int)(12*Math.cos(rocket.getAngle()*2*Math.PI/360)), this.getHeight()/2-(int)(12*Math.sin(rocket.getAngle()*2*Math.PI/360)));
		g.setColor(Color.RED);
		g.fillOval(this.getWidth()/2-2, this.getHeight()/2-2, 4, 4);
		
		if(landingStatus==1){
		g.setColor(Color.red);
		g.fillRect(0, 2*this.getHeight()/3, this.getWidth(), this.getHeight()/3);
		}
		else if(landingStatus==2){
		g.setColor(Color.yellow);
		g.fillRect(0, 2*this.getHeight()/3, this.getWidth(), this.getHeight()/3);
		g.setColor(Color.black);
		g.drawString("alamakota", 20, 3*this.getHeight()/4);	
		
		}
		else if(landingStatus==3){
		g.setColor(Color.green);
		g.fillRect(0, 2*this.getHeight()/3, this.getWidth(), this.getHeight()/3);
		g.setColor(Color.WHITE);
		int flagXCoordinate=(int)planetSystem[planetLandedOn].getX()+this.getWidth()/2;
		int flagYCoordinate=(int)planetSystem[planetLandedOn].getY()-planetSystem[planetLandedOn].getRadius()+this.getHeight()/2-38;
		g.fillRect(flagXCoordinate, flagYCoordinate, 5, 40);	
		File im=new File("flag.png");
		BufferedImage img = null;
		try {
			img = ImageIO.read(im);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Eror, hasło nieprawidłowe");
		}
		g.drawImage(img, flagXCoordinate+5, flagYCoordinate, 50, 30, null);
		}
	}
}
	
	
	


