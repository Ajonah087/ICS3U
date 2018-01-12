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
		boolean checkX = false;
		boolean checkY = false;

		

		System.out.print("Is X, or O, starting off the tic-tac-toe game?");
		turn=scan.next().charAt(0);
		
		do{
			int row = 0;
			int column = 0;
			while (checkX  == false || checkY == false ) {
				checkX = true;
				checkY = true;
				System.out.println("Starting with " + turn + " input the row and column you have chosen, pick number between 1-3");
				row = scan.nextInt();
				column= scan.nextInt();

				if (turn == 'X') {
					checkX = gameSpacesX(row,column,gameSpaces);
				}
				else {
					checkY = gameSpacesY(row,column,gameSpaces);			
				}

				if (checkX==false) {
					System.out.println("This spot has already been selected");
				}
				if (checkY==false) {
					System.out.println("This spot has already been selected");
				}

			}

				if (turn=='X') {
					turn='O';
					printBoard(gameSpaces,row,column);
				}
				else {
					turn='X';
					printBoard(gameSpaces,row,column);
				}
				checkX = false;
				checkY = false;
		}while(!noSame(gameSpaces));				


		if(turn == 'O') {
			System.out.println("Game Over! X Won");
		}
		else {
			System.out.println("Game Over! O Won");
		}

	}









	public static boolean gameSpacesX (int row, int column, char[][] gameSpaces) {
		boolean truth= false;
		if (gameSpaces[row-1][column-1] == '\u0000') {
			truth=true;
			gameSpaces[row-1][column-1] = 'X';
		}
		else  {
			System.out.println("This spot has already been selected");
			truth=false;
		}

		return truth;
	}

	public static boolean gameSpacesY (int row, int column, char[][] gameSpaces) {
		boolean truth= false;
		if (gameSpaces[row-1][column-1] == '\u0000') {
			truth=true;
			gameSpaces[row-1][column-1] = 'O';
		}
		else  {
			System.out.println("This spot has already been selected");
			truth=false;
		}
		return truth;
	}
	

	public static void printBoard (char [][] gameSpaces,int row, int column) {

		System.out.println(gameSpaces[0][0] + "   |   " + gameSpaces[0][1] + "   |   " + gameSpaces[0][2]);
		System.out.println("____________________");
		System.out.println(gameSpaces[1][0] + "   |   " + gameSpaces[1][1] + "   |   " + gameSpaces[1][2]);
		System.out.println("____________________");
		System.out.println(gameSpaces[2][0] + "   |   " + gameSpaces[2][1] + "   |   "+ gameSpaces[2][2]);



	}

	public static boolean noSame (char [][] gameSpaces) {
		boolean ans=false;
		for (int i=0; i < gameSpaces.length; i++) {
			if ((gameSpaces[1][0]==gameSpaces[1][1] && gameSpaces[1][1]==gameSpaces[1][2]) && gameSpaces[1][0]!='\u0000') {
				
				ans=true;
				break;
			}
			else if ((gameSpaces[0][1]==gameSpaces[1][1] && gameSpaces[1][1]==gameSpaces[2][1])&& gameSpaces[2][1]!='\u0000') {
				ans=true;
				break;
			}
			else if ((gameSpaces[0][0]==gameSpaces[1][1] && gameSpaces[2][2]==gameSpaces[1][1])&& gameSpaces[2][2]!='\u0000') {
				ans=true;
				break;
			}
			else if ((gameSpaces[2][0]==gameSpaces[1][1] && gameSpaces[1][1]==gameSpaces[0][2])&& gameSpaces[0][2]!='\u0000') {
				ans=true;
				break;
			}
			else {
				if ((gameSpaces[0][0]==gameSpaces[1][1] && gameSpaces[2][2]==gameSpaces[1][1])&& gameSpaces[1][1]!='\u0000') {
					ans=true;
					break;
				}
				else if ((gameSpaces[2][0]==gameSpaces[1][1] && gameSpaces[1][1]==gameSpaces[0][2])&& gameSpaces[2][0]!='\u0000') {
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


