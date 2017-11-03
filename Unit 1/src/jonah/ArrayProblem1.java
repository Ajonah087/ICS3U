package jonah;

/**Array Intro Problem 1 
 * Create random number generator & an array where numbers up to 12 are stored. Output the Total and the Number of Rolls it was hit on out of 10000.
 * October 10th 2017
 * @author Aidan Jonah
 */
 
import java.util.Scanner;

public class ArrayProblem1 {

	public static void main(String[] args) {

		int [] dice = new int[11]; 


		System.out.println("Total               Number of Rolls");
		



			for (int i=0; i < 10000; i++) {
				int rollOne= (int) (Math.random() * 6) + 1;
				int rollTwo= (int) (Math.random() * 6) + 1;
				int total= rollOne + rollTwo;
				if (total == 2) {
					dice[0]+= 1;
				}
				else if (total == 3) { 
					dice[1]+= 1;	
				}
				else if (total == 4) { 
					dice[2]+= 1;	
				}
				else if (total == 5) { 
					dice[3]+= 1;	
				}
				else if (total == 6) { 
					dice[4]+= 1;
				}
				else if (total == 7) { 
					dice[5]+= 1;	
				}	
				else if (total == 8) { 
					dice[6]+= 1;	
				}
				else if (total == 9) { 
					dice[7]+= 1;	
				}
				else if (total == 10) { 
					dice[8]+= 1;	
				}
				else if (total == 11) { 
					dice[9]+= 1;	
				}
				else if (total == 12) { 
					dice[10]+= 1;	
				}
	
			}
						
			System.out.println("  2" + "                      " + dice[0] );
			System.out.println("  3" + "                      " + dice[1]);
			System.out.println("  4" + "                      " + dice[2]);
			System.out.println("  5" + "                     " + dice[3]);
			System.out.println("  6" + "                     " + dice[4]);
			System.out.println("  7" + "                     " + dice[5]);
			System.out.println("  8" + "                     " + dice[6]);
			System.out.println("  9" + "                     " + dice[7]);
			System.out.println("  10" + "                     " + dice[8]);
			System.out.println("  11" + "                     " + dice[9]);
			System.out.println("  12" + "                     " + dice[10]);
			
			
			
			//int numRolls = 0;
			//int numRolls2 = numRolls + 1;
			//System.out.println("" + numRolls2);




		}

	}
