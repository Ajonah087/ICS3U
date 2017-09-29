package jonah;
import java.util.Scanner;

public class squared {
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("How many tiles does Gigi have");
		int gigiTiles = scan.nextInt();
		int numberOfSquares= (int) Math.sqrt(gigiTitles);
		System.out.println("The largest square that she can build has side length of" + numberOfSquares);
		
		
}}
