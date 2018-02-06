package ex2;

public abstract class Player {
	private DiskType diskType;
	
	public DiskType getDiskType(){
		return diskType;
	}
	
	abstract Position getNextMove(Board board);

}
