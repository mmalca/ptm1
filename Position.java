package ex2;

public class Position {
	int x;
	int y;
	
	public Position(int row, int line){
		x = row;
		y = line;
	}

	public String toString() {
		return ("(" + x + "," + y + ")");
}
	

}
