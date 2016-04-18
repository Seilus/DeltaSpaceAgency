package pl.edu.pw.fizyka.pojava.OddzialDelta;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Engine extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//BufferedImage engineOff= null;
	Dimension actual=new Dimension(50, 50);
	BufferedImage img= null;
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, actual.width, actual.height, null);
        //g.drawRect(0, 0, 50, 50);
	} 
	public Engine(BufferedImage img) {
		// TODO Auto-generated constructor stub
		//BufferedImage engineOff = null;

		
		/*ComponentListener resizeButton=new ComponentListener(){

			@Override
			public void componentHidden(ComponentEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void componentMoved(ComponentEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void componentResized(ComponentEvent arg0) {
				actual=getSize();
				g.dispose();
				g.drawImage(img, 0, 0, actual.width, actual.height, null);
			}

			@Override
			public void componentShown(ComponentEvent arg0) {
				// TODO Auto-generated method stub
				
			}};
			this.addComponentListener(resizeButton);
			*/
			this.setVisible(true);
	}

	public Engine(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Engine(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Engine(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
