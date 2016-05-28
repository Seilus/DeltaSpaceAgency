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
	
	JTextArea sInfo,sInfoV,shipInfo;
	JSlider throttle;
	JSlider fuel;
	Ship rocket;
	JButton engineToggle;
	
	LanguageChooserListener languageListener;
	
    void setNameShip(String game[]){
    	sInfo.setText("\n"+game[1]+"\n"+game[2]+"\n"+game[3]+"\n"+game[4]+"\n");
    	engineToggle.setText(game[0]);
	}
	LanguageSelectionEnglish tt= new LanguageSelectionEnglish();
	
	public ShipStatus(Ship rocket,LanguageChooserListener languageListener) {
		this.languageListener=languageListener;
	     this.languageListener.setShipStatus(this);
		
		this.rocket=rocket;
		this.setLayout(new FlowLayout(0));
		this.setBackground(Color.DARK_GRAY);
		//adding the button to toggle engine on/off
	    engineToggle=new JButton(tt.game[0]);
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
	     shipInfo=new JTextArea(4, 1);
		JTextArea shipInfoValues=new JTextArea(4,1);
		shipInfo.setBackground(Color.BLACK);
		shipInfo.setEditable(false);
		Font shipFont = new Font("Verdana", Font.BOLD, 12);
		shipInfo.setFont(shipFont);
		shipInfo.setForeground(Color.WHITE);
		shipInfo.setText("\n"+tt.game[1]+"\n"+tt.game[2]+"\n"+tt.game[3]+"\n"+tt.game[4]+"\n");
		
		shipInfoValues.setBackground(Color.BLACK);
		shipInfoValues.setEditable(false);
		shipInfoValues.setFont(shipFont);
		shipInfoValues.setForeground(Color.WHITE);
		
		shipInfoValues.setText("\n"+Math.sqrt(Math.pow(rocket.getSpeedX(), 2)+Math.pow(rocket.getSpeedY(), 2))+"km/s\n"+rocket.getThrottleValue()/10+"%\n"+(int)rocket.getMass()+"t\n"+rocket.getFuelMass()/7+"%\n");
		this.add(shipInfo);
		this.add(shipInfoValues);
		this.sInfo=shipInfo;
		this.sInfoV=shipInfoValues;
	}
	
	public void update(){
		sInfoV.setText("\n"+new DecimalFormat("#.##").format(Math.sqrt(Math.pow(rocket.getSpeedX(), 2)+Math.pow(rocket.getSpeedY(), 2)))+"km/s\n"+rocket.getThrottleValue()/10+"%\n"+(int)rocket.getMass()+"\n"+rocket.getFuelMass()/7+"%\n");
		throttle.setValue(rocket.getThrottleValue());
		fuel.setValue((int)(rocket.getFuelMass()*10));
	}
	
}
