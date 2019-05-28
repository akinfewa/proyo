package model.Tile;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Tile implements ITile{
	
	private boolean isBreakable;
	private boolean isSolid;
	ArrayList couleurs = new ArrayList();
	
	public void tile(BufferedImage texture, int id){
		
	}

	@Override
	public boolean getIsSolid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsBreakable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsSolid(boolean isSolid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIsBreakable(boolean isBreakable) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
