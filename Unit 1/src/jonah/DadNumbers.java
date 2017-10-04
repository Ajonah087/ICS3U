package jonah;
import java.util.Scanner;

public class DadNumber {
 
 public static void main(String[] args) {

   int natalieNumber;
   
 Scanner scan= new Scanner (System.in);
 
  System.out.println("What number does Natalie's dad give her? ");
  natalieNumber = scan.nextInt();
  
  if (natalieNumber == 1) {
   System.out.println("1"); 
  } else if (natalieNumber == 2 || natalieNumber == 3) {
   System.out.println("2"); 
  } else if (natalieNumber == 4 || natalieNumber == 5) {
   System.out.println("3"); 
  } else if (natalieNumber == 6 || natalieNumber == 7) {
   System.out.println("4"); 
  } else if (natalieNumber == 8 || natalieNumber == 9) {
   System.out.println("5"); 
  } else if (natalieNumber == 10) {
   System.out.println("6"); 
  } else {
   System.out.println("Invalid Input."); 
  }
  
  }
}
