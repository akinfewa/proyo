package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.sql.SQLException;
import java.util.Observer;

import contract.IAlive;
import contract.IBlock;
import contract.IBoulderDashController;
import contract.IBoulderDashModel;
import model.Tile.ITile;
import view.GameFrame.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {

	private BufferedImage texture[];
	private IBoulderDashController boulderDashController;
	
	public GraphicsBuilder(IBoulderDashController boulderDashController) throws SQLException{
		this.boulderDashController = boulderDashController;
		
		texture = boulderDashController.getSpriteTab();
	}
	
	@Override
	public void applyModelToGraphic(Graphics graphic, Observer observerImage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getGlobalWidth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getGlobalHeight() {
		// TODO Auto-generated method stub
		
	}
public void drawAlive ( IAlive alive, Graphics graphics, ImageObserver observer) {
	
}

public void drawBlock( IBlock block, Graphics graphics, ImageObserver observer) {
	
}

public void drawBackground(ITile tile) {
	
}

}
