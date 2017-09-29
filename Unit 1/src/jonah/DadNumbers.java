package jonah;
import java.util.Scanner;
//Find number of answers

public class DadNumbers {
	
	public static void main(String[] args) {
		
		int totalAnswer=0;
		
	Scanner scan= new Scanner (System.in);
	System.out.println("Which number does Natalie ask her dad for?");
	int natalieNumber= scan.nextInt();
	
	for (int i=1; natalieNumber >= 1 && natalieNumber <= 10;i++) {
		
		totalAnswer= natalieNumber % i;
		
		if (totalAnswer==0) {
			System.out.println("" + totalAnswer);
			
		}
}
	}
}