package entity;

import contract.IBlock;

public class Block implements IBlock{

	private int SPEED = 2; 
	private int WIDTH = 32;
	private int HEIGHT = 32;
	

	@Override
	public void crush(Alive alive) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void slide(Direction direction) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fall() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Boolean isPickable() {
		return null;
		
	}
	public Boolean isMovable() {
		return null;
	
	}
	public Boolean isSolid() {
		return null;
	
	}
	
}
