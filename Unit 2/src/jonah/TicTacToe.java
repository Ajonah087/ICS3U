/**
 * 
 */
package jonah;

import java.util.Scanner;

/**
 * @author 343057964
 *
 */
public class TicTacToe {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean ans;
		int [][] gameSpaces = new int [3][3];
		int specSpace;
		int turn=0;


		for (int i=0; i < 5; i++) {
			System.out.println("Starting with X, input the row and column you have chosen, pick number between 1-3");
			int row = scan.nextInt();
			int column= scan.nextInt();
			specSpace=0;

			gameSpaces[row-1][column-1]= specSpace;
			int arrayXY= (specSpace);
			boolean checkX = gameSpacesX(row,column);
			boolean checkY = gameSpacesY(row,column);

			for (int e=0; e < 5; e++) {
				if (gameSpacesX(row,column)==false) {
					System.out.println("This spot has already been selected");
				}
				else if (gameSpacesX(row,column)==true) {

				}

				if (gameSpacesY(row,column)==false) {
					System.out.println("This spot has already been selected");
				}
				else if (gameSpacesY(row,column)==true) {

				}

				for (int a=0; a< gameSpaces.length; a++) {
					if (noSame(gameSpaces)==true) {
						System.out.println("You have won the game!");
					}
					else {

					}
				}
				for (int z=0; z < 3; z++) { 
				System.out.println("    |     |     ");
				}

			}
		}
		//		if (truth==false) {
		//			System.out.println("This spot has already been selected");
		//		}
		//		
		//		else if (ans==true) {
		//			System.out.println("You have won the game!");
		//		}
		//		else {
		//			
		//		}
		//		
		//		}
	}



	public static boolean gameSpacesX (int row, int column) {
		boolean truth= false;
		int [][] gameSpaces = new int[3][3];
		if (gameSpaces[row][column] == 0) {
			truth=true;
			gameSpaces[row-1][column-1] = 'X';
			if (gameSpaces[row-1][column-1] != 0) {
				System.out.println("This spot has already been selected");
				truth=false;
			}
		}
		return truth;
	}

	public static boolean gameSpacesY (int row, int column) {
		boolean truth= false;
		int [][] gameSpaces = new int[3][3];
		if (gameSpaces[row][column] == 0) {
			truth=true;

			if (gameSpaces[row-1][column-1] != 0) {
				gameSpaces[row-1][column-1] = 'Y';
				System.out.println("This spot has already been selected");
				truth=false;

			}
		}
		return truth;
	}

	public static boolean noSame (int [][] gameSpaces) {
		boolean ans=false;
		for (int i=0; i < gameSpaces.length; i++) {
			if ((gameSpaces[i][0]==gameSpaces[i][1] && gameSpaces[i][1]==gameSpaces[i][2])) {
				ans=true;
				break;
			}
			else if ((gameSpaces[0][i]==gameSpaces[1][i] && gameSpaces[1][i]==gameSpaces[2][i])) {
				ans=true;
				break;
			}
			else if ((gameSpaces[0][0]==gameSpaces[1][1] && gameSpaces[2][2]==gameSpaces[1][1])) {
				ans=true;
				break;
			}
			else if ((gameSpaces[2][0]==gameSpaces[1][1] && gameSpaces[1][1]==gameSpaces[0][2])) {
				ans=true;
				break;
			}
			else {
				if ((gameSpaces[0][0]==gameSpaces[1][1] && gameSpaces[2][2]==gameSpaces[1][1])) {
					ans=true;
					break;
				}
				else if ((gameSpaces[2][0]==gameSpaces[1][1] && gameSpaces[1][1]==gameSpaces[0][2])) {
					ans=true;
					break;
				}
				else {
					ans=false;
				}

			}
		}
		return ans;
	}
}


