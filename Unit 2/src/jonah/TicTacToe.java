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
		for (int i=0; i < gameSpaces.length; i++) {
				System.out.println("Starting with X, input the row and column you have chosen");
				int row = scan.nextInt();
				int column= scan.nextInt();
				
				int gameSpaces[row][column];
			}
		}

		for (int i=0; i < gameSpaces.length; i++) {
			for (int j=0; j<gameSpaces.length; j++) {
				System.out.println("Starting with O, input the row and column you have chosen");
				gameSpaces[i][j] = scan.nextInt();
				int oSpaces = gameSpaces[i][j];
			}	

		}

	}


	public static boolean noSame (String [][] gameSpaces) {
		boolean ans=false;
		if (oSpaces==xSpaces) {
			ans=true;
			break;
		}
		return ans;
	}  
	
}


