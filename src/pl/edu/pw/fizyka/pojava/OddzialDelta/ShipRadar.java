package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class ShipRadar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.DARK_GRAY);
		g.fillOval(0, 0, this.getWidth(), this.getHeight());
	}
	public ShipRadar() {
		// TODO Auto-generated constructor stub
	}

	public ShipRadar(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public ShipRadar(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public ShipRadar(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}