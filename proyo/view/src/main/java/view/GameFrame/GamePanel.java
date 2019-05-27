package view.GameFrame;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import view.GameFrame.IGraphicsBuilder;

public class GamePanel extends JPanel implements Observer {

	private IGraphicsBuilder graphicBuilder;

	public GamePanel (IGraphicsBuilder graphicBuilder) {
		graphicBuilder = graphicBuilder;
		
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent (Graphics graphic) {
	} 

}
