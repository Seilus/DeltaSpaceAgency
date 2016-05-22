package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ShipStatus extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextArea sInfo;
	JSlider throttle;
	JSlider fuel;
	Ship rocket;
	
	public ShipStatus(Ship rocket) {
		this.rocket=rocket;
		this.setLayout(new FlowLayout(0));
		this.setBackground(Color.DARK_GRAY);
		//adding the button to toggle engine on/off
		JButton engineToggle=new JButton("ENGINE");
		engineToggle.setBackground(Color.RED);
		Font engineFont=new Font("Verdana", Font.BOLD, 12);
		engineToggle.setFont(engineFont);
		engineToggle.addActionListener(new EngineToggleListener(engineToggle, rocket));
		Dimension prefButton=new Dimension(120, 90);
		engineToggle.setMinimumSize(new Dimension(60, 45));
		engineToggle.setPreferredSize(prefButton);
		this.add(engineToggle);
		//adding slider that lets the user change engine power
		JSlider throttle=new JSlider(SwingConstants.VERTICAL, 0, 1000, 0);
		Dimension prefSizeThrottle=new Dimension(40, 90);
		throttle.setBackground(Color.DARK_GRAY);
		throttle.setPreferredSize(prefSizeThrottle);
		this.add(throttle);
		this.throttle=throttle;
		
		throttle.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				rocket.setThrottleValue(throttle.getValue());
			}
		});
		throttle.setValue(rocket.getThrottleValue());
		//slider showing fuel left
		JLabel fuelL=new JLabel("FUEL");
		JSlider fuel=new JSlider(SwingConstants.HORIZONTAL, 0, 7000, 7000);
		fuel.setBackground(Color.DARK_GRAY);
		fuel.add(fuelL);
		fuel.setEnabled(false);
		this.add(fuel);
		this.fuel=fuel;
		//box with ship information
		JTextArea shipInfo=new JTextArea(4, 1);
		shipInfo.setBackground(Color.BLACK);
		shipInfo.setEditable(false);
		Font shipFont = new Font("Verdana", Font.BOLD, 12);
		shipInfo.setFont(shipFont);
		shipInfo.setForeground(Color.WHITE);
		shipInfo.setText("Ship speed:"+Math.sqrt(Math.pow(rocket.getSpeedX(), 2)+Math.pow(rocket.getSpeedY(), 2))+"km/s\nCurrent throttle:"+rocket.getThrottleValue()/10+"%\nCurrent ship mass:"+(int)rocket.getMass()+"t\nRemaining Fuel:"+rocket.getFuelMass()/7+"%");
		this.add(shipInfo);
		this.sInfo=shipInfo;
	}
	
	public void update(){
		sInfo.setText("Ship speed:"+new DecimalFormat("#.##").format(Math.sqrt(Math.pow(rocket.getSpeedX(), 2)+Math.pow(rocket.getSpeedY(), 2)))+"km/s\nCurrent throttle:"+rocket.getThrottleValue()/10+"%\nCurrent ship mass:"+(int)rocket.getMass()+"t\nRemaining Fuel:"+rocket.getFuelMass()/7+"%");
		throttle.setValue(rocket.getThrottleValue());
		fuel.setValue((int)(rocket.getFuelMass()*10));
	}
	
}
