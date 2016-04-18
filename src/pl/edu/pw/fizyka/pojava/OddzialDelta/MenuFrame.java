package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.*;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public MenuFrame() throws HeadlessException{
		setLayout(new GridLayout(4, 1));
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	     JPanel P1=new JPanel();
	     JPanel P2= new JPanel();
	     JPanel P3= new JPanel();
	     JPanel P4= new JPanel();
	     
	     P1.setBackground(Color.GRAY);
	     P2.setBackground(Color.GRAY);
	     P3.setBackground(Color.GRAY);
	     P4.setBackground(Color.GRAY);
	     
	     JLabel p1=new JLabel("Gra - symulacja układu słonecznego.");
	     p1.setFont(new Font("Comic Sans", Font.BOLD, 20));	
	     P1.add(p1);
	     
	     JButton p2=new JButton("Start");
         JLabel p3= new JLabel (" Naciśnij przycisk żeby rozpocząć");
         p3.setFont(new Font("Comic Sans", Font.BOLD, 14));
         P2.add(p3);
	     P3.add(p2);
	     
	     JLabel p5= new JLabel (" Wybierz misję");
	     p5.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    JComboBox p4=new JComboBox();
	    P4.add(p5);
	    P4.add(p4);
	    
	    JLabel p6= new JLabel (" Wybierz język");
	     p6.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    JComboBox p7=new JComboBox();
	    P4.add(p6);
	    P4.add(p7);
	    
	     
	     this.add(P1);
	     this.add(P2);
	     this.add(P3);
	     this.add(P4);
	     
	}
}	
