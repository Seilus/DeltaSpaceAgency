package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuFrame extends JFrame {
	//the first component that appears when program is run. Allows for choosing of destination, flag
	//and, of course, starting the mission
		
	  int SelectedMission;
	 JButton GameStartButton, GameHelpButton;
	 JLabel GameLabelStartInstructions, MissionSelection, LanguageSelection;
	 JPanel GameHelpOtherPanel;
	 JFrame GameHelpFrame;
	 JTextArea HelpText;
	 JComboBox<?> MissionComboBox;
	 
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	LanguageChooserListener languageListener; 
	GameStartListener startListener;
	MissionSelectionClass missionListener;
	HelpListener helpListener;
	
	void setName(String menu[]){
		GameStartButton.setText(menu[0]);
		GameLabelStartInstructions.setText(menu[1]);
		MissionSelection.setText(menu[2]);
		LanguageSelection.setText(menu[3]);
		GameHelpButton.setText(menu[4]);
	}
void setMission(int mission){
		 SelectedMission=mission;
	}
void setHelpInfo(String[]help){
	HelpText.setText(help[0]);
}
//int getMission(){
	//return SelectedMission;
//}
	public MenuFrame(GameStartListener startListener, LanguageChooserListener languageListener, MissionSelectionClass missionListener,HelpListener helpListener) throws HeadlessException{
		setLayout(new GridLayout(5, 1));
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	     JPanel GamePanelTitle=new JPanel();
	     
	     this.startListener=startListener;
	     this.languageListener=languageListener;
	     this.languageListener.setMenuFrame(this);
	     this.startListener.setMenuFrame(this);
	     this.helpListener=helpListener;
	     this.helpListener.setMenuFrame(this);
	     this.missionListener=missionListener;
	     this.missionListener.setMenuFrame(this);
	     
	    
	   
	     JPanel GamePanelStartInstructions= new JPanel();
	     JPanel GamePanelStart= new JPanel();
	     JPanel GamePanelMissionSelectionAndSomeMore= new JPanel();
	     JPanel GameHelp= new JPanel();
	     GameHelpFrame=new JFrame();
	     GameHelpOtherPanel = new JPanel();
	     HelpText=new JTextArea();
	    
	     GamePanelTitle.setBackground(Color.GRAY);
	     GamePanelStartInstructions.setBackground(Color.GRAY);
	     GamePanelStart.setBackground(Color.GRAY);
	     GamePanelMissionSelectionAndSomeMore.setBackground(Color.GRAY);
	     GameHelp.setBackground(Color.LIGHT_GRAY);
	     
	     JLabel GameTitle=new JLabel("DELTA Space Agency");
	     GameTitle.setFont(new Font("Comic Sans", Font.BOLD, 20));	
	     GamePanelTitle.add(GameTitle);
	     
	     GameStartButton=new JButton(languageListener.Langmenu[0]);
	     GameStartButton.setForeground(Color.DARK_GRAY);
	     GameStartButton.setBackground(Color.LIGHT_GRAY);
	      
	     GameLabelStartInstructions= new JLabel (languageListener.Langmenu[1]);
         GameLabelStartInstructions.setFont(new Font("Comic Sans", Font.BOLD, 14));
         GamePanelStartInstructions.add(GameLabelStartInstructions);
         GameStartButton.addActionListener(startListener);
	     GamePanelStart.add(GameStartButton);
	      
	 
	      MissionSelection= new JLabel (languageListener.Langmenu[2]);
	      MissionSelection.setFont(new Font("Comic Sans", Font.BOLD, 14));
	      
	     MissionComboBox=new JComboBox(languageListener.englishLang.missions);
          MissionComboBox.addActionListener(missionListener);
	    GamePanelMissionSelectionAndSomeMore.add(MissionSelection);
	    GamePanelMissionSelectionAndSomeMore.add(MissionComboBox);
	    
	   	MissionComboBox.setForeground(Color.DARK_GRAY);
	    MissionComboBox.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    MissionComboBox.setBackground(Color.LIGHT_GRAY);
	    
	    
	    LanguageSelection= new JLabel (languageListener.Langmenu[3]);
	    LanguageSelection.setFont(new Font("Comic Sans", Font.BOLD, 14));
	  
	    GamePanelMissionSelectionAndSomeMore.add(LanguageSelection);
	    GamePanelMissionSelectionAndSomeMore.add(languageListener.LanguageComboBox);
	    languageListener.LanguageComboBox.addActionListener(languageListener);
	    
	    languageListener.LanguageComboBox.setForeground(Color.DARK_GRAY);
	    languageListener.LanguageComboBox.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    languageListener.LanguageComboBox.setBackground(Color.LIGHT_GRAY);
	    
	    GameHelpButton= new JButton(languageListener.Langmenu[4]);
	    GameHelpButton.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    GameHelpButton.addActionListener(helpListener);
	    GameHelp.add(GameHelpButton);
	      
	     this.revalidate();
	     this.add(GamePanelTitle);
	     this.add(GamePanelStartInstructions);
	     this.add(GamePanelStart);
	     this.add(GamePanelMissionSelectionAndSomeMore);
	     this.add(GameHelp);
	    
	}
}	
