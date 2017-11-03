package jonah;


/** DadNumbers IntroProblem 7
 *  The program makes sure that Natalie's Daddy gives the correct number of answers.
 *  October 4th 2017
 *  @author Aidan Jonah
 */



import java.util.Scanner;

public class DadNumberrs {
 
 public static void main(String[] args) {

   int natalieNumber;
   
 Scanner scan= new Scanner (System.in);
 
  System.out.println("What number does Natalie's dad give her? ");
  natalieNumber = scan.nextInt();
  
  if (natalieNumber == 1) {
   System.out.println("There is 1 answer"); 
  } else if (natalieNumber == 2 || natalieNumber == 3) {
   System.out.println("There are 2 answers"); 
  } else if (natalieNumber == 4 || natalieNumber == 5) {
   System.out.println("There are 3 answers"); 
  } else if (natalieNumber == 6 || natalieNumber == 7) {
   System.out.println("There are 4 answers"); 
  } else if (natalieNumber == 8 || natalieNumber == 9) {
   System.out.println("There are 5 answers"); 
  } else if (natalieNumber == 10) {
   System.out.println("There are 6 answers"); 
  } else {
   System.out.println("Invalid Input."); 
  }
  }
}

