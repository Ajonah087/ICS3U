package jonah;

/**Array Intro Problem 4 
 * A program that prints out the lyrics to "if you're happy and you know it" with 10 different actions & uses a loop to print different verses
 * October 10th 2017
 * @author Aidan Jonah
 */

import java.util.Scanner;

public class Happyknowit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\



		String [] happyVerse = {"clap your hands", "stomp your feet", "jump around", "run all day", "do backflips", "dance all day", "play all day", "go to gym every day", "play hockey", "play videogames"};

		for (int i=0; i<happyVerse.length; i++) {

			System.out.println("If you're happy and you know it, " + happyVerse[i]);
			System.out.println("If you're happy and you know it, " + happyVerse[i]);
			System.out.println("If you're happy and you know it, then your face will surely show it");
			System.out.println("If you're happy and you know it, " + happyVerse[i]);
			System.out.println("");
			
		}
	}

}
