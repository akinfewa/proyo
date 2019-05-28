package model.Tile;

public interface ITile {
	
	public abstract boolean getIsSolid();
	public abstract boolean getIsBreakable();
	
	public abstract void setIsSolid(boolean isSolid);
	public abstract void setIsBreakable(boolean isBreakable);

}
