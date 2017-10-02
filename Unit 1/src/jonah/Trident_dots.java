package jonah;

import java.util.Scanner;

public class Trident_dots {

	public static void main(String[] args) {

		Scanner scan= new Scanner (System.in);
		System.out.println("What is the height of the trident?");
		int h = scan.nextInt();
		System.out.println("What is the spacing of the trident?");
		int s = scan.nextInt();
		System.out.println("What is the length?");
		int t = scan.nextInt();




		for (int i=0; i < h; i++ ) {
			System.out.print("*");
			for (int a=0; a < s; a++) 
				System.out.print(" ");
		}
		for (int i=0; i < h; i++ ) {
			System.out.print("*");
			for (int a=0; a < s; a++) 
				System.out.print(" ");	
			System.out.print("*");



			for (int e=0 ; e<t; e++) 
				System.out.println();








		}
	}
}
