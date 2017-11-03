package jonah;

import java.util.Scanner;

/**Deal or No Deal Program
 * Deal or No Deal Game
 * October 18th, 2017
 * @author Aidan Jonah
 */

public class DealOrNoDeal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] briefcost = {100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
		
		System.out.println("How many cases were opened, up to 10?");
		int casesOpened = scan.nextInt();		
		
		System.out.println("Which case was chosen?");
			int caseChosen = 0;
			for (int i = 0; i<casesOpened ; i++) {
			caseChosen = scan.nextInt();
			briefcost[caseChosen-1]=0;
		}
		
		System.out.println("What is the banker's offer?");
		int bankerOffer = scan.nextInt();
		
		
		int remainingAmount=0;
		for (int i=0; i<10; i++)
		{		
			remainingAmount += briefcost[i];
			
		}

			
		if ((remainingAmount/10-casesOpened) < bankerOffer) {
			System.out.println("Deal");
		}
		
		
		else {
			System.out.println("No deal");
		}
		
}
}