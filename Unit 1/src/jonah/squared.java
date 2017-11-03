package jonah;

/** Squared IntroProblem 8
 *  A program that inputs the number of tiles and then prints out the maximum side length.
 *  October 4th, 2017
 *  @author Aidan Jonah
 */


import java.util.Scanner;

public class squared {
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("How many tiles does Gigi have?");
		int gigiTiles = scan.nextInt();
		int numberOfSquares= (int) Math.sqrt(gigiTiles);
		System.out.println("The largest square that she can build has side length of " + numberOfSquares);
		
		
}
	
	}
