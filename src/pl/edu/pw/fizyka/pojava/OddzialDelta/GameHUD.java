package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GameHUD extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameHUD() {
		this.setLayout(new GridLayout());
		this.setBackground(Color.DARK_GRAY);
		Image engineOff = null;
		try {
		    engineOff = ImageIO.read(new File("Untitled.png"));
		}
		catch (IOException e) {
		}
		BackgroundPanel engineToggle=new BackgroundPanel(engineOff, 0);
		this.add(engineToggle);
		ImageIcon engineOffIcon=new ImageIcon(engineOff);
		//JButton engineToggle=new JButton();
		
		//engineToggle.setOpaque(false);
		//engineToggle.setContentAreaFilled(false);
		//engineToggle.setBorderPainted(false);
		//engineToggle.setFocusPainted(false);
		//Dimension minEngine=new Dimension(50, 50);
		//engineToggle.setMinimumSize(minEngine);
		this.add(engineToggle);
	}

	public GameHUD(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GameHUD(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public GameHUD(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
