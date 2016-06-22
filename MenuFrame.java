package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.MutableComboBoxModel;
/**
 * 
 * @author M.S.
 *the first component that appears when program is run. Allows for choosing of destination, language
 *and, of course, starting the mission
 */

public class MenuFrame extends JFrame {
		
	JScrollPane scroll;
	int SelectedMission=1;
	JButton GameStartButton, GameHelpButton;
	JLabel GameLabelStartInstructions, MissionSelection, LanguageSelection;
	GameHelpOtherPanel GameHelpOtherPanel;
	JFrame GameHelpFrame;
	JTextArea HelpText;
	JComboBox<String> MissionComboBox;
	MutableComboBoxModel<String> modelMission;
	BufferedImage image;
	GameHelp GameHelp;
	 
	private static final long serialVersionUID = 1L;
	
	LanguageChooserListener languageListener; 
	GameStartListener startListener;
	MissionSelectionClass missionListener;
	HelpListener helpListener;
	
	
	public void setMissionBox(){
		for(int jj=0; jj<9; jj++){
			modelMission.removeElementAt(8-jj);
		}
		for(int ii=0; ii<9; ii++){
			modelMission.addElement(languageListener.planets[ii]);
		}
	}	
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
	void setHelpInfo(String help){
		HelpText.setText(help);
	}

	int getMission(){
		return SelectedMission;
	}

	class GameHelp extends JPanel{
		private static final long serialVersionUID = 1L;
		//przeładuj metode paintComponent
		@Override
		protected  void paintComponent( Graphics g ){
		super.paintComponent( g );
		Image im = getToolkit().getImage("tech_detail.jpg");
		g.drawImage( im, 0, 0, this );
		}
	}
	class GamePanelTitle extends JPanel{
		//przeladuj metode paintComponent
		private static final long serialVersionUID = 1L;

		@Override
		protected  void paintComponent( Graphics g ){
		super.paintComponent( g );
		Image imi = getToolkit().getImage("deltaspacetitle.png");
		g.drawImage( imi, 0, 0, this );
		}
	}
	class GameHelpOtherPanel extends JPanel{
		private static final long serialVersionUID = 1L;

		//przeladuj metode paintComponent
		@Override
		protected  void paintComponent( Graphics g ){
		super.paintComponent(g);
	  	Image imi2 = getToolkit().getImage("free_space_galaxy_texture_by_lyshastra-d77gofi.png");
	  	g.drawImage( imi2, 0, 0, this );
		}
	}
	public MenuFrame(GameStartListener startListener, LanguageChooserListener languageListener, MissionSelectionClass missionListener,HelpListener helpListener) throws HeadlessException{
		
		setLayout(new GridLayout(5, 1));
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    GamePanelTitle GamePanelTitle=new GamePanelTitle();
	    HelpText=new JTextArea();
	    HelpText.setEditable(false);
	    Font helpFont=new Font("Tahoma", Font.BOLD, 11);
	    HelpText.setForeground(Color.YELLOW);
	    HelpText.setFont(helpFont);
	    HelpText.setOpaque(false);
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
	    
	    GameHelpFrame=new JFrame();
	    GameHelpOtherPanel = new GameHelpOtherPanel();
	    GameHelpOtherPanel.repaint(); 
	    GameHelp=new GameHelp();
	    scroll = new JScrollPane(GameHelpOtherPanel);
	    GameHelpFrame.add(scroll);
	    //GamePanelTitle.setBackground(Color.GRAY);
	    GamePanelStartInstructions.setBackground(Color.DARK_GRAY);
	     
	    GamePanelStart.setBackground(Color.DARK_GRAY);
	    
	    GamePanelMissionSelectionAndSomeMore.setBackground(Color.DARK_GRAY);
	 
	     
	    GameHelp.repaint();
	    GameHelp.setOpaque(false);
       
	    GamePanelTitle.repaint();
	    GamePanelTitle.setOpaque(false);
	    
	    GameStartButton=new JButton(languageListener.Langmenu[0]);
	    GameStartButton.setForeground(Color.DARK_GRAY);
	    GameStartButton.setBackground(Color.LIGHT_GRAY);
	     
	    GameLabelStartInstructions= new JLabel (languageListener.Langmenu[1]);
	    GameLabelStartInstructions.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    GameLabelStartInstructions.setForeground(Color.LIGHT_GRAY);
	    GamePanelStartInstructions.add(GameLabelStartInstructions);
	    GameStartButton.addActionListener(missionListener);
	    GameStartButton.addActionListener(startListener);
	    GamePanelStart.add(GameStartButton);
	      
	 
	    MissionSelection= new JLabel (languageListener.Langmenu[2]);
	    MissionSelection.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    MissionSelection.setForeground(Color.LIGHT_GRAY);
	   MissionComboBox=new JComboBox<String>();
	   modelMission=(MutableComboBoxModel<String>)MissionComboBox.getModel();
	   for(int ii=0; ii<9; ii++){
	 	modelMission.addElement(languageListener.planets[ii]);		
	   }
       // MissionComboBox.addActionListener(missionListener);
	    GamePanelMissionSelectionAndSomeMore.add(MissionSelection);
	    GamePanelMissionSelectionAndSomeMore.add(MissionComboBox);
	    
	   //	MissionComboBox.setForeground(Color.DARK_GRAY);
	   // MissionComboBox.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    //MissionComboBox.setBackground(Color.LIGHT_GRAY);
	    
	    
	    LanguageSelection= new JLabel (languageListener.Langmenu[3]);
	    LanguageSelection.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    LanguageSelection.setForeground(Color.LIGHT_GRAY);
	    GamePanelMissionSelectionAndSomeMore.add(LanguageSelection);
	    GamePanelMissionSelectionAndSomeMore.add(languageListener.LanguageComboBox);
	    languageListener.LanguageComboBox.addActionListener(languageListener);
	    
	    languageListener.LanguageComboBox.setForeground(Color.DARK_GRAY);
	    languageListener.LanguageComboBox.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    languageListener.LanguageComboBox.setBackground(Color.LIGHT_GRAY);
	    
	    GameHelpButton= new JButton(languageListener.Langmenu[4]);
	    GameHelpButton.setFont(new Font("Comic Sans", Font.BOLD, 14));
	    GameHelpButton.setForeground(Color.DARK_GRAY);
	    GameHelpButton.setBackground(Color.LIGHT_GRAY);
	    GameHelpButton.addActionListener(helpListener);
	    GameHelp.add(GameHelpButton);
	    GameHelpFrame.setSize(640,480);
	    this.revalidate();
	    this.add(GamePanelTitle);
	    this.add(GamePanelStartInstructions);
	    this.add(GamePanelStart);
	    this.add(GamePanelMissionSelectionAndSomeMore);
	    this.add(GameHelp);
	    this.setResizable(false);
	    
	}
} 