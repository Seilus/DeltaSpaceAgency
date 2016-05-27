

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

 public  class LanguageChooserListener implements ActionListener{
	 public String Langmenu []=new String[4];
	 public String[] Languages ={"polski","english"};
	public int num=5;
	 JComboBox LanguageComboBox=new JComboBox(Languages);
	 JLabel test,test2;
	 
	 void setMenuFrame(MenuFrame menuFrame){
			this.menuFrame=menuFrame;
		}
	 
	 JButton test1;
	 //GameWindow window;
		//GameAnimation animation;
	 MenuFrame menuFrame;
	
	
    	@Override
		public void actionPerformed(ActionEvent e) {
			 if(LanguageComboBox.getSelectedIndex()==0){
				 //System.out.println("0");
				 num=0;
				LanguageSelectionPolski t= new LanguageSelectionPolski();
		    	menuFrame.setName(t.menu);
		    	 
		    	 
		    	 
		 		
			 }
			
			if(LanguageComboBox.getSelectedIndex()==1){
				 //System.out.println("1");
				 
				LanguageSelectionEnglish t=new LanguageSelectionEnglish();
				num=1;
				
				menuFrame.setName(t.menu);
		    	
		    	
		 		
			 }
			
    		
			}
    	
			public LanguageChooserListener(){
				
	    	 LanguageSelectionEnglish ttt=new LanguageSelectionEnglish();
	    	 for(int ii=0;ii<=3;ii++){
		    	  Langmenu[ii]=ttt.menu[ii];
	    	 }	 
					    	 
			
			 }
 }
	
