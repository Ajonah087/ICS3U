package jonah;

/** Trident IntroProblem 3
 *  This program accepts as input the parameters t, s, and h, and prints the appropriate trident.
 *  October 4th, 2017
 *  @author Aidan Jonah
 */

import java.util.Scanner;

public class Trident_dots {

	public static void main(String[] args) {

		Scanner scan= new Scanner (System.in);
		System.out.println("What is the length of the handle?");
		int h = scan.nextInt();
		System.out.println("What is the spacing of the trident?");
		int s = scan.nextInt();
		System.out.println("What is the height of the prongs?");
		int t = scan.nextInt();

		for (int r=0; r < t; r++) {
				System.out.print("*");
				for (int a=0; a < s; a++) 
					System.out.print(" ");
				System.out.print("*");
				for (int a=0; a < s; a++) 
					System.out.print(" ");
				System.out.println("*");
		}
		
		for (int x=0; x < 2 * s + 3; x++) {
			System.out.print("*");
		}
		
			System.out.println();
		for (int x=0; x < h; x++) {
			for (int e=0; e < s + 1; e++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}}}		
			
			









	



