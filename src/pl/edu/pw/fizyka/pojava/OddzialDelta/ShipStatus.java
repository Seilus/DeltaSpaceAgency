package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class ShipStatus extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShipStatus() {
		this.setLayout(new FlowLayout(0));
		//adding the button to toggle engine on/off- changing color will be implemented (probably move button to separate class)		
		this.setBackground(Color.DARK_GRAY);
		JButton engineToggle=new JButton("ENGINE");
		engineToggle.setBackground(Color.RED);
		Font engineFont=new Font("Verdana", Font.BOLD, 12);
		engineToggle.setFont(engineFont);
		Dimension prefButton=new Dimension(120, 90);
		engineToggle.setPreferredSize(prefButton);
		this.add(engineToggle);
		//adding slider that lets the user change engine power
		JSlider throttle=new JSlider(SwingConstants.VERTICAL, 0, 100, 0);
		Dimension prefSizeThrottle=new Dimension(40, 90);
		throttle.setBackground(Color.DARK_GRAY);
		throttle.setPreferredSize(prefSizeThrottle);
		this.add(throttle);
		//slider showing fuel left
		JLabel fuelL=new JLabel("FUEL");
		JSlider fuel=new JSlider(SwingConstants.HORIZONTAL, 0, 1000, 1000);
		fuel.setBackground(Color.DARK_GRAY);
		fuel.add(fuelL);
		fuel.setEnabled(false);
		this.add(fuel);
		//box with ship information
		JTextArea shipInfo=new JTextArea(4, 1);
		shipInfo.setBackground(Color.BLACK);
		shipInfo.setEditable(false);
		Font shipFont = new Font("Verdana", Font.BOLD, 12);
		shipInfo.setFont(shipFont);
		shipInfo.setForeground(Color.WHITE);
		shipInfo.setText("Ship speed\nCurrent throttle\nCurrent ship mass\nRemaining Fuel\n ");
		this.add(shipInfo);
}

	public ShipStatus(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ShipStatus(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public ShipStatus(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
