package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameMap extends JPanel {
	//Class paints the ship in the middle, and all planets in their respective positions
	private static final long serialVersionUID = 1L;

	private CelestialBody[] planetSystem;
	MenuFrame menuFrame;
	private Ship rocket;
	int missionSelected;
	Random r=new Random();
	private BufferedImage image, image1, image2, image3, image4, image5, image6, image7, image8;
   public int starsLocationX[] =new int [1200];
	public int starsLocationY[]= new int[1200];

	public GameMap(CelestialBody[] planetarySystem, Ship rocket,MenuFrame menuFrame) {
		this.menuFrame=menuFrame;
		for(int ii=0;ii<1200;ii++){
			starsLocationX[ii]=r.nextInt(1200);
			starsLocationY[ii]=r.nextInt(1200);
		}
		planetSystem=planetarySystem;	
		Dimension pref=new Dimension(1200, 510);
		Dimension min=new Dimension(640, 480);
		this.setPreferredSize(pref);
		this.setMinimumSize(min);
		this.rocket=rocket;
		missionSelected=menuFrame.SelectedMission;

		File imageFile = new File("sun_transparent_background_sun_world_by_royalblueiv-d6r3ze7.png");
		try {
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile1 = new File("mercury-transparent.png");
		try {
			image1 = ImageIO.read(imageFile1);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile2 = new File("venus-transparent.png");
		try {
			image2 = ImageIO.read(imageFile2);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile3 = new File("The_Earth_seen_from_Apollo_17_with_transparent_background.png");
		try {
			image3 = ImageIO.read(imageFile3);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile4 = new File("Mars_transparent.png");
		try {
			image4 = ImageIO.read(imageFile4);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile5 = new File("484px-Jupiter_(transparent).png");
		try {
			image5 = ImageIO.read(imageFile5);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile6 = new File("Saturnx.png");
		try {
			image6 = ImageIO.read(imageFile6);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile7 = new File("3D_Uranus.png");
		try {
			image7 = ImageIO.read(imageFile7);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		File imageFile8 = new File("Neptune_cutout.png");
		try {
			image8 = ImageIO.read(imageFile8);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
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
		
		
		
		for(int ii=0; ii<planetSystem.length; ii++){
			if(ii==0){
				g.drawImage(image, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
				}
			
			if(ii==1){
				g.drawImage(image1, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
				
			}else if(ii==2){
				g.drawImage(image2, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
			}else if(ii==3){
				
			g.drawImage(image3, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
			}else if(ii==4){
				g.drawImage(image4, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
			}else if(ii==5){
				g.drawImage(image5, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
			}else if(ii==6){
				g.drawImage(image6, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
			}else if(ii==7){
				g.drawImage(image7, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
			}else if(ii==8){
				g.drawImage(image8, (int)planetSystem[ii].getX()-planetSystem[ii].getRadius()+this.getWidth()/2, (int)planetSystem[ii].getY()-planetSystem[ii].getRadius()+this.getHeight()/2, planetSystem[ii].getRadius()*2, planetSystem[ii].getRadius()*2, this);
			}
			else{
				
			}
		
		}
		
		g.setColor(Color.CYAN);
		g.drawLine(this.getWidth()/2, this.getHeight()/2, this.getWidth()/2+(int)(12*Math.cos(rocket.getAngle()*2*Math.PI/360)), this.getHeight()/2-(int)(12*Math.sin(rocket.getAngle()*2*Math.PI/360)));
		g.setColor(Color.RED);
		g.fillOval(this.getWidth()/2-2, this.getHeight()/2-2, 4, 4);
		g.setColor(Color.ORANGE);
		g.drawOval((int)(planetSystem[missionSelected].getX()-planetSystem[missionSelected].getRadius()+this.getWidth()/2), (int)(planetSystem[missionSelected].getY()-planetSystem[missionSelected].getRadius()+this.getHeight()/2), (planetSystem[missionSelected].getRadius()*2), (planetSystem[missionSelected].getRadius()*2));
		g.drawOval((int)(planetSystem[missionSelected].getX()-planetSystem[missionSelected].getRadius()+this.getWidth()/2), (int)(planetSystem[missionSelected].getY()-planetSystem[missionSelected].getRadius()+this.getHeight()/2), (planetSystem[missionSelected].getRadius()*2)+1, (planetSystem[missionSelected].getRadius()*2)+1);
		g.drawOval((int)(planetSystem[missionSelected].getX()-planetSystem[missionSelected].getRadius()+this.getWidth()/2), (int)(planetSystem[missionSelected].getY()-planetSystem[missionSelected].getRadius()+this.getHeight()/2), (planetSystem[missionSelected].getRadius()*2)+2, (planetSystem[missionSelected].getRadius()*2)+2);
	}
}
	
	
