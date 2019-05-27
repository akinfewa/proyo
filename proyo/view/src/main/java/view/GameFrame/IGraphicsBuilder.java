package view.GameFrame;

import java.awt.Graphics;
import java.util.Observer;

public interface IGraphicsBuilder {

	public void applyModelToGraphic ( Graphics graphic, Observer observerImage);
	
	public void getGlobalWidth(); 
	public void getGlobalHeight();
	
}
