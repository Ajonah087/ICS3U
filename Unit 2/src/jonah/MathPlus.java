package jonah;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.Scanner;

public class MathPlus {

	/**
	 * Adds num1 and num2 together
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Sum of first and second
	 */
	public static int add(int num1, int num2) {

		int total= num1 + num2;
		return total;

	}

	/**
	 * Subtracts num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Difference of first and second
	 */

	public static int subtract(int num1, int num2) {

		int total= num1 - num2;
		return total;

	}
	/**
	 * Multiplies num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Product of first and second
	 */
	public static int multiply(int num1, int num2) {

		int total= num1 * num2;
		return total;

	}
	/**
	 * Divides num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Quotient of first and second
	 */
	public static int divide(int num1, int num2) {

		int total= num1 / num2;
		return total;

	}

	/**
	 * Adds num1 and num2 together
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Sum of first and second
	 */

	public static double add(double num1, double num2) {

		double total= num1 + num2;
		return total;

	}
	/**
	 * Subtracts num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Difference of first and second
	 */
	public static double subtract(double num1, double num2) {

		double total= num1 - num2;
		return total;

	}
	/**
	 * Multiplies num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Product of first and second
	 */
	public static double multiply(double num1, double num2) {

		double total= num1 * num2;
		return total;

	}
	/**
	 * Divides num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Quotient of first and second
	 */
	public static double divide(double num1, double num2) {

		double total= num1 / num2;
		return total;

	}


	/**
	 * Adds num1 and num2 together
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Sum of first and second
	 */
	public static long add(long num1, long num2) {

		long total= num1 + num2;
		return total;

	}

	/**
	 * Subtracts num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Difference of first and second
	 */

	public static long subtract(long num1, long num2) {

		long total= num1 - num2;
		return total;

	}
	/**
	 * Multiplies num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Product of first and second
	 */
	public static long multiply(long num1, long num2) {

		long total= num1 * num2;
		return total;

	}
	/**
	 * Divides num1 by num2
	 * 
	 * @param num1
	 * 				First operand
	 * @param num2
	 * 				Second operand
	 * @return
	 * 				Quotient of first and second
	 */
	public static long divide(long num1, long num2) {

		long total= num1 / num2;
		return total;

	}	


	/**
	 * Adds all indices in [] arrayNums
	 * 
	 * @param arrayNums
	 * 				First operand
	 * @return
	 * 				Total of all values in the array
	 */
	public static int sum (int [] arrayNums) {
		int total = 0; 
		for (int i=0; i< arrayNums.length; i++) {
			total = total+=arrayNums[i];
		}
		return total;
	}

	/**
	 * Adds all indices in [] arrayNums
	 * 
	 * @param arrayNums
	 * 				First operand
	 * @return
	 * 				Total of all values in the array
	 */
	public static long sum (long [] arrayNums) {
		long total = 0; 
		for (int i=0; i< arrayNums.length; i++) {
			total = total+=arrayNums[i];
		}
		return (long)total;
	}

	/**
	 * Adds all indices in [] arrayNums
	 * 
	 * @param arrayNums
	 * 				First operand
	 * @return
	 * 				Total of all values in the array
	 */
	public static double sum (double [] arrayNums) {
		double total = 0; 
		for (int i=0; i< arrayNums.length; i++) {
			total = total+=arrayNums[i];
		}
		return (double)total;
	}

	/**
	 * Multiply typeFactorial by all nums lower than it
	 * 
	 * @param typeFactorial
	 * 				First operand
	 * @return
	 * 				The total of the factorial
	 */
	public static int factorial(int sendNumber){
		int a=0;
		int total=1;
		int tots;
		for (int i=1; i<=sendNumber; i++) {
			total = total*i; 
		}
		return total;
	}

	/**
	 * Multiply typeFactorial by all nums lower than it
	 * 
	 * @param typeFactorial
	 * 				First operand
	 * @return
	 * 				The total of the factorial
	 */
//	public static double factorial(double sendNumber){
//		double a=0;
//		double total=1;
//		double tots;
//		for (int i=1; i<=sendNumber; i++) {
//			total = total*i; 
//		}
//		return (double)total;
//	}
//
//	/**
//	 * Multiply typeFactorial by all nums lower than it
//	 * 
//	 * @param typeFactorial
//	 * 				First operand
//	 * @return
//	 * 				The total of the factorial
//	 */
//	public static long factorial(long sendNumber){
//		long a=0;
//		long total=1;
//		long tots;
//		for (int i=1; i<=sendNumber; i++) {
//			total = total*i; 
//		}
//		return (long)total;
//	}

	/**
	 * Puts sideA by sideB to the power of 2, adds num1 and num2 together and then square roots the combined answer to get side c
	 * 
	 * @param sideA
	 * 				First operand
	 * @param sideB
	 * 				Second operand
	 * @return
	 * 				Length of side c
	 */

	public static int pythag(int sideA, int sideB) {
		int total;
		total= (int) Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
		return total;
	}


	/**
	 * Puts sideA by sideB to the power of 2, adds num1 and num2 together and then square roots the combined answer to get side c
	 * 
	 * @param sideA
	 * 				First operand
	 * @param sideB
	 * 				Second operand
	 * @return
	 * 				Length of side c
	 */
	public static double pythag(double sideA, double sideB) {
		double total;
		total= Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
		return total;
	}

	/**
	 * Puts sideA by sideB to the power of 2, adds num1 and num2 together and then square roots the combined answer to get side c
	 * 
	 * @param sideA
	 * 				First operand
	 * @param sideB
	 * 				Second operand
	 * @return
	 * 				Length of side c
	 */
	public static long pythag(long sideA, long sideB) {
		long total;
		total= (long) Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
		return total;
	}





	/**
	 * Compares all numbers inputted into int [] arrayMin, and find the lowest value, inputs the indices its' in
	 * 
	 * @param int [] arrayMin
	 * 				First operand
	 * 
	 * @return
	 * 				Location of indice in array with lowest value
	 */

	public static int minArray (int [] arrayMin) {
		int minIndices=0;
		for (int i=0; i<arrayMin.length; i++) {
			if (arrayMin[i]<arrayMin[minIndices]){
				minIndices=i;
			}

		}
		return minIndices;
	}

	/**
	 * Compares all numbers inputted into int [] arrayMin, and find the lowest value, inputs the indices its' in
	 * 
	 * @param int [] arrayMin
	 * 				First operand
	 * 
	 * @return
	 * 				Location of indice in array with lowest value
	 */

	public static double minArray (double [] arrayMin) {
		int minIndices=0;
		for (int i=0; i<arrayMin.length; i++) {
			if (arrayMin[i]<arrayMin[minIndices]){
				minIndices=i;
			}

		}
		return (double)minIndices;
	}	

	/**
	 * Compares all numbers inputted into int [] arrayMax, finds the lowest value and inputs the indices it's in.
	 * 
	 * @param int [] arrayMax
	 * 				First operand
	 * 
	 * @return
	 * 				Location of indice in array with highest value
	 */
	public static int maxArray (int [] arrayMax) {
		int minIndices= 0;
		for (int i=1; i<arrayMax.length; i++) {
			if (arrayMax[i]>arrayMax[0]){
				minIndices=i;
			}

		}
		return minIndices;
	}


	/**
	 * Compares all numbers inputted into double [] arrayMax, finds the lowest value and inputs the indices it's in.
	 * 
	 * @param double [] arrayMax
	 * 				First operand
	 * 
	 * @return
	 * 				Location of indice in array with highest value
	 */
	public static double maxArray (double [] arrayMax) {
		double minIndices=0;
		for (int i=1; i<arrayMax.length; i++) {
			if (arrayMax[i]>arrayMax[0]){
				minIndices=i;
			}

		}
		return (double)minIndices;
	}


	/**
	 * Compares all numbers inputted into long [] arrayMax, finds the lowest value and inputs the indices it's in.
	 * 
	 * @param long [] arrayMax
	 * 				First operand
	 * 
	 * @return
	 * 				Location of indice in array with highest value
	 */
	public static long maxArray (long [] arrayMax) {
		long minIndices= 0;
		for (int i=1; i<arrayMax.length; i++) {
			if (arrayMax[i]>arrayMax[0]){
				minIndices=i;
			}

		}
		return minIndices;
	}


	/**
	 * Compares all numbers inputted into int [] arrayMin, and find the lowest value, inputs the indices its' in
	 * 
	 * @param int [] arrayMin
	 * 				First operand
	 * 
	 * @return
	 * 				Location of indice in array with lowest value
	 */

	public static int min (long [] arrayMin) {
		int minIndices=0;
		for (int i=0; i<arrayMin.length; i++) {
			if (arrayMin[ i]<arrayMin[minIndices]){
				minIndices=i;
			}

		}
		return minIndices;
	}	

	
	/**
	 * Recieves int factorNumber and finds the number of factors
	 * 
	 * @param int factorNumber
	 * 				First operand
	 * 
	 * @return
	 * 				The number of factors
	 */

	public static int factoring(int factorNumber) {
		int compare = 0;
		int factor= 0;
		double valueFactor;
		for (int i=factorNumber;i>0; i--) {
			valueFactor= factorNumber/i;
			compare= (int)factorNumber/i;

			if (compare==valueFactor) {
				factor+= factor+1;
			}
		}
		return factor;
	}


	/**
	 * Recieves int factorNumber and finds the number of factors
	 * 
	 * @param int factorNumber
	 * 				First operand
	 * 
	 * @return
	 * 				The number of factors
	 */
	public static double factoring(double factorNumber) {
		double compare = 0;
		double factor= 0;
		double valueFactor;
		for (int i=(int) factorNumber;i>0; i--) {
			valueFactor= factorNumber/i;
			compare= (int)factorNumber/i;

			if (compare==valueFactor) {
				factor+= factor+1;
			}

		}	return factor;
	}

	/**
	 * Recieves int factorNumber and finds the number of factors
	 * 
	 * @param int factorNumber
	 * 				First operand
	 * 
	 * @return
	 * 				The number of factors
	 */
	public static long factoring(long factorNumber) {
		long compare = 0;
		long factor= 0;
		long valueFactor;
		for (int i=(int) factorNumber;i>0; i--) {
			valueFactor= factorNumber/i;
			compare= (long)factorNumber/i;

			if (compare==valueFactor) {
				factor= factor+1;
			}

		}	return factor;
	}	
	
	
	/**
	 * Recieves int factorNumber and finds the factors
	 * 
	 * @param int factorNumber
	 * 				First operand
	 * 
	 * @return int [] diffArray
	 * 				Return all the factors
	 */
	public static int [] factors (int factorNumber) {
		int [] diffArray= new int [factoring(factorNumber)];
		int returned=0;
		double division;
		int counter=0;
		for (int i=1; i < diffArray.length; i++) {
			division= factorNumber%i;
			if (division == 0) {
				diffArray[counter]= factorNumber/i;
			}
	} return diffArray;
	}

	/**
	 * Receives double [] arrayMe and finds the factors
	 * 
	 * @param double [] arrayMe
	 * 				First operand
	 * 
	 * @return total
	 * 				The average of all the numbers in the array
	 */
	
	public static double mean (double [] arrayMe) {
		double starter = 0; 
		double total=0;
	// want to get length of array holding numbers to properly divide the combined number
		for (int i=0; i < arrayMe.length; i++) {
			starter = starter+=arrayMe[i];
			total = starter/arrayMe.length;
		}
		
		return total;
	}
	
	/**
	 * Receives double [] arrayMedian and finds the middle numbers
	 * 
	 * @param double [] arrayMedian
	 * 				First operand
	 * 
	 * @return total
	 * 				The middle number of all the numbers in the array
	 */
	public static double median (double [] arrayMedian) throws ArithmeticException {
		double mediiian=0;
		if (arrayMedian.length%2 ==1) {
			mediiian= (arrayMedian.length-1+arrayMedian.length) /2;
			return mediiian;
		}	
		else if (arrayMedian.length%2==0) { 
			mediiian= arrayMedian.length/2;
			return mediiian;
		}
		else {
			throw new ArithmeticException("Please try again");
		}
	}
	
 	/**
	 * Receives double [] arrayMo and finds the factors
	 * 
	 * @param double [] arrayMo
	 * 				First operand
	 * 
	 * @return total
	 * 				The most occurring value of all the numbers in the array
	 */
	
	public static double mode (double [] arrayMo) {
		double counter = 0;
		double counter2= 0;
		double var=0;
		for (int i=0; i < arrayMo.length; i++){
			for (int j=i+1; j < arrayMo.length; j++) {
			if (arrayMo[i] == arrayMo[j]) {
				counter++;
			}
		if (counter > counter2) {
			counter2=counter;
			var= arrayMo[i];
		}
		counter=0;
	} 
	}return var;
	}
	
	/**
	 * Receives double a, double b and double c and finds the roots
	 * 
	 * @param double a
	 * 				First operand
	 * 
	 * @param double b
	 * 				Second operand
	 * 
	 * @param double c
	 * 				Third operand
	 * 
	 * @return array
	 * 				The value of the roots
	 * @return ArithmeticException
	 *  			It will print out the message, "No real roots"
	 */
	
	
	public static double[] Quadratic(double a, double b, double c) throws ArithmeticException {

		double discr= (Math.sqrt(Math.pow(b, 2) - 4*a*c));
		if (discr<0) {
			throw new ArithmeticException("No real roots");
		}
		else if (discr==0) {
			double [] array = new double[1];
			double ans= -b/2*a;
			array[0]= ans;
			return array;
		}
		else {
			double [] array = new double[2];
			double ans= ((-b+(Math.sqrt((Math.pow(b, 2)) - 4*a*c)))/2*a);
			array[0] = ans;
		
			double anss= ((-b-(Math.sqrt((Math.pow(b, 2)) - 4*a*c)))/2*a);
			array[1] = anss;
			return array;
		}
		
	}


	/**
	 * Receives integerA & integerB and returns the combination
	 * 
	 * @param int integerA
	 * 				First operand
	 *
	 * @param int integerB
	 * 				First operand
	 * 
	 * @return 
	 * 				returns the permutation
	 */
	public static double comb (int integerA, int integerB) {
		int fact = factorial(integerA);
		int fact2 = factorial(integerB);
		int permutation= (fact)/(fact2*(fact-fact2));
		return permutation;
	}
	
	
	/**
	 * Receives integerA & integerB and returns the combination
	 * 
	 * @param int integerA
	 * 				First operand
	 *
	 * @param int integerB
	 * 				First operand
	 * 
	 * @return combination
	 * 				returns the combination
	 */
	public static double permut (int integerN, int integerR) {
		int fact = factorial(integerN);
		int fact2 = factorial(integerR);
		int combination= (fact)/(fact-fact2);
		return combination;
	}
		
	

//	private static ArrayList<Integer> findFactors (int factorNumber){
//	ArrayList<Integer> diffArray= new ArrayList<Integer>();	
//	int returned=0;
//	double division;
//	//int counter=0;
//	for (int i=1; i < diffArray.size(); i++) {
//		division= factorNumber%i;
//		if (division == 0) {
//			diffArray.add(factorNumber/i);
//		}
//	
//}
//return diffArray;
//}
		
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to use an int, double or long");
		String typeChoice= scan.nextLine();
		
		if (typeChoice.equalsIgnoreCase("long")){
			System.out.println("How long do you want the array to be?");
			long min= scan.nextLong();
			long[] arrayMin = new long [(int) min];

			for (int i=0; i < arrayMin.length; i++) {
				System.out.println("Please input a number to compare");
				arrayMin[i]= scan.nextInt();
			}
			long arrayMi= min(arrayMin);
			System.out.println(arrayMi);	
		}
		
//		System.out.println("Please input an integer");
//		int integerA= scan.nextInt();
//		System.out.println("Please input another integer");
//		int integerB= scan.nextInt();
//		int perms= (int) permut(integerA,integerB);
//		System.out.println(perms);
		
		
//		System.out.println("Please input an integer");
//		int integerN= scan.nextInt();
//		System.out.println("Please input another integer");
//		int integerR= scan.nextInt();
//		int perm= (int) permut(integerN,integerR);
//		System.out.println(perm);
		
//		System.out.println("How long do you want the array to be?");
//		double medians= scan.nextDouble();
//		double[] arrayMedian = new double [(int)medians];
//		for (int i=0; i < arrayMedian.length; i++) {
//			System.out.println("Please input a number to compare");
//			arrayMedian[i]= scan.nextDouble();
//}
//	double arrayMed= mean(arrayMedian);
//	System.out.println(arrayMed);
	
//			System.out.println("What is the value of A?");
//			double a= scan.nextDouble();
//			System.out.println("What is the value of B?");
//			double b= scan.nextDouble();
//			System.out.println("What is the value of C?");
//			double c= scan.nextDouble();
//			double [] arrayQuadratic= Quadratic(a,b,c);
//			
//			try {
//				double [] roots= Quadratic(a,b,c);
//					for (int i=0; i<roots.length;i++) {
//					System.out.println(arrayQuadratic[i]);
//			}
//			}
//			catch (ArithmeticException ae) {
//			System.out.println(ae.getMessage());	
//			}
//			

//		if (typeChoice.equalsIgnoreCase("double")) {
//						System.out.println("How long do you want the array to be?");
//						double means= scan.nextDouble();
//						double[] arrayMean = new double [(int)means];
//						
//						for (int i=0; i < arrayMean.length; i++) {
//											System.out.println("Please input a number to compare");
//											arrayMean[i]= scan.nextDouble();
//						}
//									double arrayMe= mean(arrayMean);
//									System.out.println("The average of all the values in the array is " + arrayMe);
		
//		if (typeChoice.equalsIgnoreCase("double")) {
//			System.out.println("How long do you want the array to be?");
//			double mode= scan.nextDouble();
//			double[] arrayMode = new double [(int)mode];
//			
//			for (int i=0; i < arrayMode.length; i++) {
//								System.out.println("Please input a number to compare");
//								arrayMode[i]= scan.nextDouble();
//			}
//						double arrayMo= mode(arrayMode);
//						System.out.println(arrayMo);
		
//		if (typeChoice.equalsIgnoreCase("int")) {
//			System.out.println("What number do you want to find the factors of?");
//			int factorNumber= scan.nextInt();
//			int sendLength= factoring(factorNumber);
//			ArrayList<Integer> diffArray= findFactors(factorNumber);
//			for (int i=0; i < diffArray.size(); i++) {
//			System.out.println(diffArray.get(i));
//		}
//		}
	
		
		
	}
		//		if (typeChoice.equalsIgnoreCase("int")) {
		//			System.out.println("How long do you want the array to be?");
		//			int max= scan.nextInt();
		//			int[] arrayMax = new int [max];
		//
		//			for (int i=0; i < arrayMax.length; i++) {
		//				System.out.println("Please input a number to compare");
		//				arrayMax[i]= scan.nextInt();
		//			}
		//			int arrayMa= maxArray(arrayMax);
		//			System.out.println(arrayMa);
		//		}
		//		if (typeChoice.equalsIgnoreCase("double")) {
		//			System.out.println("How long do you want the array to be?");
		//			double max= scan.nextDouble();
		//			double[] arrayMax = new double [(int) max];
		//
		//			for (int i=0; i < arrayMax.length; i++) {
		//				System.out.println("Please input a number to compare");
		//				arrayMax[i]= scan.nextDouble();
		//			}
		//			double arrayMa= maxArray(arrayMax);
		//			System.out.println(arrayMa);
		//		}
		//
		//		if (typeChoice.equalsIgnoreCase("long")) {
		//			System.out.println("How long do you want the array to be?");
		//			long max= scan.nextLong();
		//			long[] arrayMax = new long [(int) max];
		//
		//			for (int i=0; i < arrayMax.length; i++) {
		//				System.out.println("Please input a number to compare");
		//				arrayMax[i]= scan.nextLong();
		//			}
		//			long arrayMa= maxArray(arrayMax);
		//			System.out.println(arrayMa);
		//		}



		//				if (typeChoice.equalsIgnoreCase("int")) {
		//					System.out.println("How long do you want the array to be?");
		//					int min= scan.nextInt();
		//					int[] arrayMin = new int [min];
		//
		//					for (int i=0; i < arrayMin.length; i++) {
		//						System.out.println("Please input a number to compare");
		//						arrayMin[i]= scan.nextInt();
		//					}
		//					int arrayMi= minArray(arrayMin);
		//					System.out.println(arrayMi);
//						}

		//					if (typeChoice.equalsIgnoreCase("double")){
		//						System.out.println("How long do you want the array to be?");
		//						double min= scan.nextLong();
		//						double[] arrayMin = new double [(int) min];
		//
		//						for (int i=0; i < arrayMin.length; i++) {
		//							System.out.println("Please input a number to compare");
		//							arrayMin[i]= scan.nextInt();
		//						}
		//						double arrayMi= minArray(arrayMin);
		//						System.out.println(arrayMi);		

		//		if (typeChoice.equalsIgnoreCase("int")) {
		//			System.out.println("What number do you want to find the factors of?");
		//			int factorNumber= scan.nextInt();
		//			int swapMethod= factoring(factorNumber);
		//			System.out.println(swapMethod);
		//		}

		//if (typeChoice.equalsIgnoreCase("double")) {
		//System.out.println("What number do you want to find the factors of?");
		//double factorNumber= scan.nextDouble();
		//double swapMethod= factoring(factorNumber);
		//System.out.println(swapMethod);
	//}

	//			if (typeChoice.equalsIgnoreCase("long")) {
	//			System.out.println("What number do you want to find the factors of?");
	//			long factorNumber= scan.nextLong();
	//			long swapMethod= factoring(factorNumber);
	//			System.out.println(swapMethod);
	//		}

	//		if (typeChoice.equalsIgnoreCase("int")) {
	//			System.out.println("What is length of side a?");
	//			int sideA= scan.nextInt();
	//			System.out.println("What is length of side b?");
	//			int sideB= scan.nextInt();
	//			int sidesAll= pythag(sideA,sideB);
	//			System.out.println("The side is " + sidesAll + " cm long");
	//		}
	//		
	//		if (typeChoice.equalsIgnoreCase("double")) {
	//			System.out.println("What is length of side a?");
	//			double sideA= scan.nextDouble();
	//			System.out.println("What is length of side b?");
	//			double sideB= scan.nextDouble();
	//			double sidesAll= pythag(sideA,sideB);
	//			System.out.println("The side is " + sidesAll + " cm long");
	//		}
	//		
	//		if (typeChoice.equalsIgnoreCase("long")) {
	//			System.out.println("What is length of side a?");
	//			long sideA= scan.nextLong();
	//			System.out.println("What is length of side b?");
	//			long sideB= scan.nextLong();
	//			long sidesAll= pythag(sideA,sideB);
	//			System.out.println("The side is " + sidesAll + " cm long");			
	//		}

	//		if (typeChoice.equalsIgnoreCase("int")) {
				
			
	//
	//		if (typeChoice.equalsIgnoreCase("double")) {
	//			System.out.println("What number do you want to find the factorial of?");
	//			double typeFactorial= scan.nextDouble();
	//			double sendNumber= factorial(typeFactorial);
	//			System.out.println(sendNumber);
	//		}
	//
	//		// goes weird here//   if (typeChoice.equalsIgnoreCase("long")) {
	//			System.out.println("What number do you want to find the factorial of?");
	//			long typeFactorial= scan.nextLong();
	//			long sendNumber= factorial(typeFactorial);
	//			System.out.println(sendNumber);
	//		}


	//		Scanner scan = new Scanner(System.in);
	//		System.out.println("Do you want to use an int, double or long");
	//		String typeChoice= scan.nextLine();
	//		
	//		if (typeChoice.equalsIgnoreCase("int")) {
	//		System.out.println("How long do you want the array to be?");
	//		int arrayLength= scan.nextInt();
	//		int[] arrayNums = new int [arrayLength];
	//
	//		for (int i=0; i < arrayNums.length; i++) {
	//			System.out.println("Please input a number to add");
	//			arrayNums[i]= scan.nextInt();
	//				}
	//		int arrayAdd= sum(arrayNums);
	//		System.out.println("When you add all the numbers in the array together you get " + arrayAdd);
	//		}
	//		
	//		if (typeChoice.equalsIgnoreCase("double")) {
	//		System.out.println("How long do you want the array to be?");
	//		double arrayLength= scan.nextDouble();
	//		double[] arrayNums = new double [(int) arrayLength];
	//
	//			for (int i=0; i < arrayNums.length; i++) {
	//				System.out.println("Please input a number to add");
	//				arrayNums[i]= scan.nextInt();
	//					}
	//			double arrayAdd= sum(arrayNums);
	//			System.out.println("When you add all the numbers in the array together you get " + arrayAdd);
	//		}
	//		
	//		if (typeChoice.equalsIgnoreCase("long")) {
	//			System.out.println("How long do you want the array to be?");
	//			long arrayLength= scan.nextLong();
	//			long[] arrayNums = new long [(int) arrayLength];
	//
	//				for (int i=0; i < arrayNums.length; i++) {
	//					System.out.println("Please input a number to add");
	//					arrayNums[i]= scan.nextInt();
	//						}
	//				long arrayAdd= sum(arrayNums);
	//				System.out.println("When you add all the numbers in the array together you get " + arrayAdd);
	//			}

	//	System.out.println("Do you want to add, subtract, multiply or divide");
	//	String mathChoice= scan.nextLine();
	//	System.out.println("Do you want to use an int, double or long");
	//	String typeChoice= scan.nextLine();
	//
	//	if (typeChoice.equalsIgnoreCase("int"))
	//		if (mathChoice.equalsIgnoreCase("add")) {
	//			System.out.print("Please input a number");
	//			int num1= scan.nextInt();
	//			System.out.println("Please input a second number");
	//			int num2= scan.nextInt();
	//			int addnum= add(num1,num2);
	//			System.out.println("When you add these two numbers you get " + addnum);
	//		}
	//
	//	if (typeChoice.equalsIgnoreCase("double")) 
	//		if (mathChoice.equalsIgnoreCase("add")) {
	//			System.out.print("Please input a number");
	//			double num1= scan.nextDouble();
	//			System.out.println("Please input a second number");
	//			double num2= scan.nextDouble();
	//			double addnum= add(num1,num2);
	//			System.out.println("When you add these two numbers you get " + addnum);
	//		}
	//
	//		if (typeChoice.equalsIgnoreCase("long")) 
	//			if (mathChoice.equalsIgnoreCase("add")) {
	//				System.out.print("Please input a number");
	//				long num1= scan.nextLong();
	//				System.out.println("Please input a second number");
	//				long num2= scan.nextLong();
	//				long addnum= add(num1,num2);
	//				System.out.println("When you add these two numbers you get " + addnum);
	//			}
	//
	//		
	//		if (typeChoice.equalsIgnoreCase("int"))
	//			if (mathChoice.equalsIgnoreCase("subtract")) {
	//				System.out.print("Please input a number");
	//				int num1= scan.nextInt();
	//				System.out.println("Please input a second number");
	//				int num2= scan.nextInt();
	//				int subtractnum= subtract(num1,num2);
	//				System.out.println("When you subtract these two numbers you get " + subtractnum);
	//			}
	//
	//		if (typeChoice.equalsIgnoreCase("double"))
	//			if (mathChoice.equalsIgnoreCase("subtract")) {
	//				System.out.print("Please input a number");
	//				double num1= scan.nextDouble();
	//				System.out.println("Please input a second number");
	//				double num2= scan.nextDouble();
	//				double subtractnum= subtract(num1,num2);
	//				System.out.println("When you subtract these two numbers you get " + subtractnum);
	//			}
	//
	//		if (typeChoice.equalsIgnoreCase("long"))
	//			if (mathChoice.equalsIgnoreCase("subtract")) {
	//				System.out.print("Please input a number");
	//				long num1= scan.nextLong();
	//				System.out.println("Please input a second number");
	//				long num2= scan.nextLong();
	//				long subtractnum= subtract(num1,num2);
	//				System.out.println("When you subtract these two numbers you get " + subtractnum);
	//			}
	//
	//		if (typeChoice.equalsIgnoreCase("double"))
	//			if (mathChoice.equalsIgnoreCase("multiply")) {
	//				System.out.print("Please input a number");
	//				double num1= scan.nextDouble();
	//				System.out.println("Please input a second number");
	//				double num2= scan.nextDouble();
	//				double multiplynum= multiply(num1,num2);
	//				System.out.println("When you multiply these two numbers you get " + multiplynum);
	//			}
	//		if (typeChoice.equalsIgnoreCase("long"))
	//			if (mathChoice.equalsIgnoreCase("multiply")) {
	//				System.out.print("Please input a number");
	//				long num1= scan.nextLong();
	//				System.out.println("Please input a second number");
	//				long num2= scan.nextLong();
	//				long multiplynum= multiply(num1,num2);
	//				System.out.println("When you multiply these two numbers you get " + multiplynum);
	//			}
	//
	//		if (typeChoice.equalsIgnoreCase("int"))
	//			if (mathChoice.equalsIgnoreCase("multiply")) {
	//				System.out.print("Please input a number");
	//				int num1= scan.nextInt();
	//				System.out.println("Please input a second number");
	//				int num2= scan.nextInt();
	//				int multiplynum= multiply(num1,num2);
	//				System.out.println("When you multiply these two numbers you get " + multiplynum);
	//			}
	//
	//		if (typeChoice.equalsIgnoreCase("int"))
	//			if (mathChoice.equalsIgnoreCase("divide")) {
	//				System.out.print("Please input a number");
	//				int num1= scan.nextInt();
	//				System.out.println("Please input a second number");
	//				int num2= scan.nextInt();
	//				int dividenum= divide(num1,num2);
	//				System.out.println("When you divide these two numbers you get " + dividenum);
	//			}
	//
	//	if (typeChoice.equalsIgnoreCase("double"))
	//		if (mathChoice.equalsIgnoreCase("divide")) {
	//			System.out.print("Please input a number");
	//			double num1= scan.nextDouble();
	//			System.out.println("Please input a second number");
	//			double num2= scan.nextDouble();
	//			double dividenum= divide(num1,num2);
	//			System.out.println("When you divide these two numbers you get " + dividenum);
	//		}
	//
	//	if (typeChoice.equalsIgnoreCase("long"))
	//		if (mathChoice.equalsIgnoreCase("divide")) {
	//			System.out.print("Please input a number");
	//			long num1= scan.nextLong();
	//			System.out.println("Please input a second number");
	//			long num2= scan.nextLong();
	//			long dividenum= divide(num1,num2);
	//			System.out.println("When you divide these two numbers you get " + dividenum);
	//		}
	}




