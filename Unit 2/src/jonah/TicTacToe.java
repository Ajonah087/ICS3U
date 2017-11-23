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
		char [][] gameSpaces = new char [3][3];
		char specSpace;
		char turn='X'; 
		boolean checkX = true;
		boolean checkY = true;


		for (int i=0; i < 5; i++) {
			System.out.println("Starting with X, input the row and column you have chosen, pick number between 1-3");
			while (checkX || checkY == false)
				System.out.println("Starting with X, input the row and column you have chosen, pick number between 1-3");
				int row = scan.nextInt();
				int column= scan.nextInt();
	
				if (turn == 'X') {
					checkX = gameSpacesX(row,column,gameSpaces);
				}
				else {
					checkY = gameSpacesY(row,column);			
				}
				
				if (checkX==false) {
					System.out.println("This spot has already been selected");
				}
				if (checkY==false) {
					System.out.println("This spot has already been selected");
				}
		}
			//end do...while loop
			

				for (int a=0; a< gameSpaces.length; a++) {
					if (noSame(gameSpaces)==true) {
						System.out.println("You have won the game!");
					}
					else {

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
	



	public static boolean gameSpacesX (int row, int column, char[][] gameSpaces) {
		boolean truth= false;
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
	
public static boolean printBoard (int [][] gameSpaces) {
	for (int z=0; z < 3; z++) { 
		System.out.println("_" + gameSpaces[0][0] + "_" + gameSpaces[0][1] + "_" + gameSpaces[0][2] );
		}
	
	
	return false;
}
	public static boolean noSame (char [][] gameSpaces) {
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


