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
	
	 
	 public int SelectedMission=-1;
	 JButton GameStartButton;
	 JLabel GameLabelStartInstructions, MissionSelection, LanguageSelection;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	LanguageChooserListener languageListener; 
	GameStartListener startListener;
	MissionSelectionClass missionListener;
	void setName(String menu[]){
		GameStartButton.setText(menu[0]);
		GameLabelStartInstructions.setText(menu[1]);
		MissionSelection.setText(menu[2]);
		LanguageSelection.setText(menu[3]);
	}
void setMission(int mission){
		SelectedMission=mission;
	}
	public MenuFrame(GameStartListener startListener,LanguageChooserListener languageListener,MissionSelectionClass missionListener) throws HeadlessException{
		setLayout(new GridLayout(4, 1));
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	     JPanel GamePanelTitle=new JPanel();
	     this.startListener=startListener;
	     this.languageListener=languageListener;
	     this.languageListener.setMenuFrame(this);
	     JPanel GamePanelStartInstructions= new JPanel();
	     JPanel GamePanelStart= new JPanel();
	     JPanel GamePanelMissionSelectionAndSomeMore= new JPanel();
	     
	    
	     GamePanelTitle.setBackground(Color.GRAY);
	     GamePanelStartInstructions.setBackground(Color.GRAY);
	     GamePanelStart.setBackground(Color.GRAY);
	     GamePanelMissionSelectionAndSomeMore.setBackground(Color.GRAY);
	     
	     
	     JLabel GameTitle=new JLabel("DELTA Space Agency");
	     GameTitle.setFont(new Font("Comic Sans", Font.BOLD, 20));	
	     GamePanelTitle.add(GameTitle);
	     
	      GameStartButton=new JButton(languageListener.Langmenu[0]);
	      GameLabelStartInstructions= new JLabel (languageListener.Langmenu[1]);
       GameLabelStartInstructions.setFont(new Font("Comic Sans", Font.BOLD, 14));
         GamePanelStartInstructions.add(GameLabelStartInstructions);
        GameStartButton.addActionListener(startListener);
	     GamePanelStart.add(GameStartButton);
	     
	 
	      MissionSelection= new JLabel (languageListener.Langmenu[2]);
	     MissionSelection.setFont(new Font("Comic Sans", Font.BOLD, 14));
	 
	    GamePanelMissionSelectionAndSomeMore.add(MissionSelection);
	    GamePanelMissionSelectionAndSomeMore.add(missionListener.MissionComboBox);
	    
	  
	    LanguageSelection= new JLabel (languageListener.Langmenu[3]);
	    LanguageSelection.setFont(new Font("Comic Sans", Font.BOLD, 14));
	  
	    GamePanelMissionSelectionAndSomeMore.add(LanguageSelection);
	    GamePanelMissionSelectionAndSomeMore.add(languageListener.LanguageComboBox);
	    languageListener.LanguageComboBox.addActionListener(languageListener);
	    this.revalidate();
	     this.add(GamePanelTitle);
	     this.add(GamePanelStartInstructions);
	     this.add(GamePanelStart);
	     this.add(GamePanelMissionSelectionAndSomeMore);
	     
	    
	}
}	

