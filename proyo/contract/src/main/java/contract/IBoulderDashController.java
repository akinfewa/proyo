package contract;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import entity.Alive;
import entity.Block;

/**
 * 
 * @author Damien
 * @param getBlock
 *  
 *
 */

public interface IBoulderDashController {
	public ArrayList<Block> getBlock  = new ArrayList<Block>();
	public ArrayList<Alive> getAlive = new ArrayList<Alive>();
	public void addBlock(Block block);
	public BufferedImage[] getSpriteTab();
}
