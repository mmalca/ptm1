package ex2;

import java.util.Scanner;

public class HumanPlayer {
	
	Position getNextMove(Board board){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please choose row number");
		int row = scanner.nextInt();
		
		System.out.println("please choose line number");
		int line = scanner.nextInt();

		Position pos = new Position (row,line);
		
		return pos;
	}

}
