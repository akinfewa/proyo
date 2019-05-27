package contract;

import entity.Alive;
import entity.Direction;

public interface IBlock {
	public void crush(Alive alive);
	public void slide(Direction direction);
	public void fall();
	public void setDirection(Direction direction);
	public Direction getDirection();
}
