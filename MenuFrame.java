package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	GameStartListener startListener;
	
	public MenuFrame(GameStartListener startListener) throws HeadlessException{
		setLayout(new GridLayout(4, 1));
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	     JPanel GamePanelTitle=new JPanel();
	     this.startListener=startListener;
	     JPanel GamePanelStartInstructions= new JPanel();
	     JPanel GamePanelStart= new JPanel();
	     JPanel GamePanelMissionSelectionAndSomeMore= new JPanel();
	     
	     /*
		 ActionListener startListener = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					
				}
		    };
	     */
	     GamePanelTitle.setBackground(Color.GRAY);
	     GamePanelStartInstructions.setBackground(Color.GRAY);
	     GamePanelStart.setBackground(Color.GRAY);
	     GamePanelMissionSelectionAndSomeMore.setBackground(Color.GRAY);
	     
	     JLabel GameTitle=new JLabel("Gra - symulacja układu słonecznego.");
	     GameTitle.setFont(new Font("Comic Sans", Font.BOLD, 20));	
	     GamePanelTitle.add(GameTitle);
	     
	     JButton GameStartButton=new JButton("Start");
         JLabel GameLabelStartInstructions= new JLabel (" Naciśnij przycisk żeby rozpocząć");
         GameLabelStartInstructions.setFont(new Font("Comic Sans", Font.BOLD, 14));
         GamePanelStartInstructions.add(GameLabelStartInstructions);
         GameStartButton.addActionListener(startListener);
	     GamePanelStart.add(GameStartButton);
	     
	     JLabel MissionSelection= new JLabel (" Wybierz misję");
	     MissionSelection.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    JComboBox MissionComboBox=new JComboBox();
	    GamePanelMissionSelectionAndSomeMore.add(MissionSelection);
	    GamePanelMissionSelectionAndSomeMore.add(MissionComboBox);
	    
	    JLabel LanguageSelection= new JLabel (" Wybierz język");
	    LanguageSelection.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    JComboBox LanguageComboBox=new JComboBox();
	    GamePanelMissionSelectionAndSomeMore.add(LanguageSelection);
	    GamePanelMissionSelectionAndSomeMore.add(LanguageComboBox);
	    
	     
	     this.add(GamePanelTitle);
	     this.add(GamePanelStartInstructions);
	     this.add(GamePanelStart);
	     this.add(GamePanelMissionSelectionAndSomeMore);
	     
	}
}	
