package jonah;

import java.util.Scanner;

/**Magic Square Program
 * You are given a񂪐爏quare of numbers, determine if it is magic square.
 * October 26th, 2017
 * @author Aidan Jonah
 */

public class MagicSquare {

	public static void main(String[] args) {

		boolean ans;

		int [][] magicSquares = new int [4][4];
		Scanner scan = new Scanner(System.in);	
		int oneRow=0;
		int totalRow=0;
		int oneColumn=0;
		int totalColumn=0;
		
		for (int i=0; i<magicSquares.length; i++) {	
			for (int j=0; j<magicSquares.length; j++) {
				System.out.println("Print a number in row");
				magicSquares[i][j] = scan.nextInt();

			}}

		for (int i=0; i<magicSquares.length; i++) {	
			for (int j=0; j<magicSquares.length; j++) {
				oneRow+=magicSquares[0][i];
			}}

		for (int i=0; i<magicSquares.length; i++) {	
			for (int j=0; j<magicSquares.length; j++) {
				totalRow+=magicSquares[i][j];
			}}
		if (oneRow != totalRow) {
			ans=false;
		}	
		else  {
			ans=true;
		}
		
		for (int i=0; i<magicSquares.length; i++) {	
			for (int j=0; j<magicSquares.length; j++) {
				oneColumn+=magicSquares[0][i];
			}}

		for (int i=0; i<magicSquares.length; i++) {	
			for (int j=0; j<magicSquares.length; j++) {
				totalColumn+=magicSquares[i][j];
			}}
		
		if (oneColumn != totalColumn) {
			ans=false;
		}	
		else  {
			ans=true;
		}
		
		if (ans == true) {
					System.out.println("You got a magic square");
				}
	}

}







