package contract;
import java.util.ArrayList;
import entity.Alive;
import entity.Block;

public interface IBoulderDashController {
	public ArrayList<Block> getBlock  = new ArrayList<Block>();
	public ArrayList<Alive> getAlive = new ArrayList<Alive>();
	public void addBlock(Block block);
}
