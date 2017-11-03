package jonah;

/** Bowtie IntroProblem 2
 *  Program should take as input the height H of the bow tie, where H is an odd positive integer greater than or equal to 5, and create the bowtie.
 *  October 4th, 2017
 *  @author Aidan Jonah
 */

import java.util.Scanner;

public class BowTie {
  public static void main(String[] args) {
    int h;
    int x = 0, y = 0;
    
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input the height of the bowtie");
    h = scan.nextInt();
    
    for (x=1; x<=h; x=x+2 ) { 
      for ( y=0; y<x; y++ ) System.out.print("*"); 
      for ( y=2*x; y<2*h; y++ ) System.out.print(" ");
      for ( y=0; y<x; y++ ) System.out.print("*"); 
      System.out.println();
    } 
    for (x=h-2; x>0; x=x-2 ) { 
      for ( y=0; y<x; y++ ) System.out.print("*"); 
      for ( y=2*x; y<2*h; y++ ) System.out.print(" "); 
      for ( y=0; y<x; y++ ) System.out.print("*"); 
      System.out.println();
    }  
    
  }
  
}