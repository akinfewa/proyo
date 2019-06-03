package contract;

import entity.Direction;

/**
 *  The Ialive who define the position.
 * @author Damien
 * @param direction
 * 				Allow to manage a direction of an object. 
 */

public interface IAlive {
	public void xMove(Direction direction);
	public void yMove(Direction direction);
	public void die();
	public Direction getDirection();
	public void setDirection(Direction direction);
}
