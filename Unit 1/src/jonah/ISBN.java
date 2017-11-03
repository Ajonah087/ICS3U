package jonah;

/** ISBN IntroProblem 6
 *  A program to compute the 1-3- sum of a 13-digit number. It will input the last three digits
 *  October 4th, 2017
 *  @author Aidan Jonah
 */

import java.util.Scanner;

public class ISBN {

 public static void main(String[] args) {

int total = 9*1+7*3+8*1+0*3+9*1+2*3+1*1+4*3+1*1+8*3;
int num1;
int num2;
int num3;

 Scanner scan= new Scanner (System.in);
 System.out.println("Please enter a value for number 1: ");
 num1 = scan.nextInt();
 System.out.println("Please enter a value for number 2: ");
 num2 = scan.nextInt();
 System.out.println("Please enter a value for number 3: ");
 num3 = scan.nextInt();
 num1 = num1 * 1;
 num2 = num2 * 3;
 num3 = num3 * 1;
 total = total + num1 + num2 + num3;
 
System.out.println("The 1-3 sum is " + total);
  }
}

