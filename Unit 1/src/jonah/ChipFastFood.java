package jonah;
import java.util.Scanner;

public class ChipFastFood {


	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("What burger do you want? Choose a number from 1 to 4");
		int menuBurger = scan.nextInt();
		System.out.println("What drink do you want? Choose a number from 1 to 4");
		int menuDrink = scan.nextInt();
		System.out.println("What side order do you want? Choose a number from 1 to 4");
		int menuSideOrder = scan.nextInt();	
		System.out.println("What dessert do you want? Choose a number from 1 to 4");
		int menuDessert = scan.nextInt();
		
		int calories= 0;
		int burger=0;
		int drink=0;
		int side=0;
		int dessert=0;
		int total=0;
		
		switch (menuBurger) {
		
			case 1: burger= 461;
			break;
			
			case 2: burger= 431;
			break;
			
			case 3: burger= 420;
			break;
			
			case 4: burger= 0;
			break;
				
			
		}
		
		switch (menuDrink) {
			
			case 1: drink= 130;
			break;
			
			case 2: drink= 160;
			break;
			
			case 3: drink= 118;
			break;
			
			case 4: drink= 0;
			break;
		
		}
		
          switch (menuSideOrder) {
			
			case 1: side= 100;
			break;
			
			case 2: side= 57;
			break;
			
			case 3: side= 70;
			break;
			
			case 4: side= 0;
			break;	
	}
          
          switch (menuDessert) {
			
			case 1: dessert= 167;
			break;
			
			case 2: dessert= 266;
			break;
			
			case 3: dessert= 75;
			break;
			
			case 4: dessert= 0;
			break;
	
		}
          
          total= dessert + side + drink + burger;
          System.out.println("Your total calorie count is " + total);
	
	
	}
	}


