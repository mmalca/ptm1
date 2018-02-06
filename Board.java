package ex2;


public class Board {
	public DiskType mat[][];
	
	public boolean isValid(Position pos, Player player){//static?
		for (int row = -1; row <= 1; row++){
			for (int col = -1; col <= 1; col++){
				if (row == 0 && col == 0)
					continue;
				
				while ((mat[pos.x+row][pos.y+col] != player.getDiskType()) && (mat[pos.x+row][pos.y+col] != null)){
					row += pos.x;
					col += pos.y;
					
					if (pos.x < 0 || pos.x > mat.length || 
						pos.y < 0 || pos.y > mat[0].length) {
						break;
					}
					return false;
				}				
			}
		}
		return true;
		
				
				
				
		return true;//change
	}
	
	public void makeMove(Position newPos, Player player){
		if (isValid(newPos, player))
			//put his disk in new position
			//mat[newPos.x][newPos.y] = his disk
	}
	
	public String toString(){
		
		String str = "hi";//change
		
		
		return str;//change
	}
	
}
