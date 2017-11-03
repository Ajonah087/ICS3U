package jonah;

/**Array Intro Problem 3
 * A program that reads in a list of names from the keyboard, and then calls a method to output the list twice, first in the order that it was input, and then in reverse order.
 * October 16th 2017
 * @author Aidan Jonah
 */


import java.util.Scanner;

public class oppositenames {

	public static void main(String[] args) {

		int listOfNames= 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("How many names will be in the list?");
		int x= scan.nextInt();
		scan.nextLine();

		String [] numNames = new String [x];

		System.out.println("Enter the " + x + " names one by one.");
		for (int i=0; i<x; i++) {
			numNames[i] = scan.nextLine();
		}

		for (int a=0; a<x;a++) {
			System.out.println("" + numNames[a]);
		}
		
		for (int e = x-1; e >= 0; e--) {
			System.out.println("" + numNames[e]);
	}
}
}
