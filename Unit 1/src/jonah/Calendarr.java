package jonah;

/** Calendar IntroProblem 1
 *  take as input an integer representing the day of the week on which the month begins, and an integer which is the number of days in the month.
 *  October 4th, 2017
 *  @author Aidan Jonah
 */

import java.lang.Math;
import java.util.Scanner;

public class Calendarr {
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Pick a number between 1-7 to start the Calendar");
		int dayOfWeek = scan.nextInt();
		System.out.println("Pick the number of days, from 1 to 31, in the month.");
		int daysInMonth = scan.nextInt();
		
		if (dayOfWeek > 7) {
			System.out.print("Please try again");
			System.exit(0);
		}	
		if (daysInMonth > 31) {
			System.out.print("Please try again");
		System.exit(0);
		}
		
		System.out.println("       Sun     Mon     Tue     Wed     Thu     Fri     Sat");
		
	
		
		
        int a= 1;
	
		for (int i= 1; dayOfWeek >= 1 && a <= daysInMonth; i++)  {
			
			if (i< dayOfWeek)        
			System.out.print("\t");
			        
			else {
				System.out.print("\t" + a);
				a++;
			}
			        
			        
			 if (i%7== 0) {
				 
				 	System.out.println();

			        }
		
		
		}
	}
}
