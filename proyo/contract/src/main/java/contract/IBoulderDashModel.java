package contract;

import java.util.ArrayList;

import entity.Alive;
import entity.Block;
import model.Tile.Tile;

public interface IBoulderDashModel {

	public ArrayList<Block> getBlock  = new ArrayList<Block>();
	public ArrayList<Alive> getAlive = new ArrayList<Alive>();
	public void addBlock(Block block);
	
	public void removeBlock(Block block); 
	public void addAlive (Alive alive);
	public void removeAlive(Alive alive);
	public void addTile(Tile tile);
	public void removeTile(Tile tile);
	
	
}
