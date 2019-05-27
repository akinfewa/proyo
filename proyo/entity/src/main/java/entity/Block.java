package entity;

import contract.IBlock;

public class Block implements IBlock{

	private int SPEED = 2; 
	private int WIDTH = 32;
	private int HEIGHT = 32;
	
	public void crush (Alive alive) {
		
	}
	
	public void slide (Direction direction) {
	
		
	}
	public void fall() {
		
	}
	public void setDirection ( Direction direction) {
		
	}
	
	public Direction getDirection() {
		return null;
		
	}
	public boolean isPickable() {
		return false;
	}
	
	public boolean isMovable() {
		return false;
		
	}
	public boolean isSolid() {
		return false;
		
	}
	
}
