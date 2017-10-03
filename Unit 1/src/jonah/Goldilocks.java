package jonah;
import java.util.Scanner;

public class Goldilocks {
		
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("What is the weight of the first bowl?");
		int firstBowl = scan.nextInt();
		System.out.println("What is the weight of the second bowl?");
		int twoBowl = scan.nextInt();
		System.out.println("What is the weight of the third bowl?");
		int thirdBowl = scan.nextInt();
		
		if (firstBowl > twoBowl && twoBowl < thirdBowl) {
			System.out.println("Mama bear's bowl is" + twoBowl); 
		}	
		else if (twoBowl > firstBowl && firstBowl < thirdBowl)
			System.out.println("Mama bear's bowl is" + firstBowl); 
		
		else if (twoBowl > thirdBowl && thirdBowl < firstBowl)
			System.out.println("Mama bear's bowl is, " + thirdBowl); 
		
		else
			System.out.println("Please input 3 different numbers");

		
		}
	}

	