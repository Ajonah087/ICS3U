package jonah;

/** Goldilocks IntroProblem 5
 *  A program that reads in three weights and prints out the weight of Mama Bear&#39;s bowl.
 *  October 4th, 2017
 *  @author Aidan Jonah
 */

import java.util.Scanner;

public class Goldilocks {
  
 public static void main(String[] args) {
  
  Scanner scan= new Scanner (System.in);
  System.out.println("What is the weight of the first bowl?");
  int bowl1 = scan.nextInt();
  System.out.println("What is the weight of the second bowl?");
  int bowl2 = scan.nextInt();
  System.out.println("What is the weight of the third bowl?");
  int bowl3 = scan.nextInt();
  
  if (bowl1 > bowl2 && bowl2 > bowl3 || bowl3 > bowl2 && bowl1 < bowl2) {
   System.out.println("Mama bear's bowl is " + bowl2); 
  } 
  else if (bowl2 > bowl1 && bowl1 > bowl3 || bowl2 < bowl1 && bowl3 > bowl1) 
	  System.out.println("Mama bear's bowl is " + bowl1); 
  

  else if (bowl2 > bowl3 && bowl3 > bowl1 || bowl2 < bowl3 && bowl3 < bowl1)
	  System.out.println("Mama bear's bowl is " + bowl3);



 }
 
}

