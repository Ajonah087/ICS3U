package jonah;

/**Array Intro Problem 2 
 * A program that plays a guessing game with the user. It has an array with 20 objects.
 * October 16th 2017
 * @author Aidan Jonah
 */

import java.util.Scanner;

public class TwentyObjectsProgram {

	public static void main(String[] args) {
		
		 String [] listOfAnimals = {"cat","dog","giraffe","zebra","lion","ostrich","badger","beaver","bison","porcupine","lizard","parrot","sheep","buffalo","bufoon","eagle", "racoon", "sloth", "panda", "dolphin"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, lets play a guessing game. Think of an animal and press a key when you are ready.");
		
		for (int i=0; i <= 20; i++) {
			
			int nosame = (int) (Math.random() * 20);
			while (listOfAnimals[nosame]==(null)) { 
				
				nosame = (int) (Math.random() * 20);
			}
			
			System.out.println("Is it " + listOfAnimals[nosame]);
			listOfAnimals[nosame] = (null);
			String choice = scan.nextLine();
			
			if (choice.equalsIgnoreCase("yes")) {
				System.out.println("Yes, I am the champion!");
				i=20;
			}
			if (i == 19) {
				System.out.println("Please try again");
			}
			
			
	}
	}	
}
