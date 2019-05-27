package view.GameFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import view.GraphicsBuilder;

public class GameFrame extends JFrame implements KeyListener{

	private IEventPerformer iEventPerformer;
	private IGraphicsBuilder igraphicBuilder;

	public GameFrame(String title, int width, int height, IEventPerformer performer, GraphicsBuilder graphicsBuilder){
		igraphicBuilder = graphicsBuilder;
		
	}
	
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

}
