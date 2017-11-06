package jonah;

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
	public static double factorial(double sendNumber){
		double a=0;
		double total=1;
		double tots;
		for (int i=1; i<=sendNumber; i++) {
			total = total*i; 
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
	public static long factorial(long sendNumber){
		long a=0;
		long total=1;
		long tots;
		for (int i=1; i<=sendNumber; i++) {
			total = total*i; 
		}
		return (long)total;
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

	private static int pythag(int sideA, int sideB) {
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
	private static double pythag(double sideA, double sideB) {
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
	private static long pythag(long sideA, long sideB) {
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

	private static int minArray (int [] arrayMin) {
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

	private static double minArray (double [] arrayMin) {
		int minIndices=0;
		for (int i=0; i<arrayMin.length; i++) {
			if (arrayMin[i]<arrayMin[minIndices]){
				minIndices=i;
			}

		}
		return (double)minIndices;
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

	private static long min (long [] arrayMin) {
		long minIndices=0;
		for (long i=0; i<arrayMin.length; i++) {
			if (arrayMin[(int) i]<arrayMin[(int) minIndices]){
				minIndices=i;
			}

		}
		return (long)minIndices;
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

	//				private static int numOfFactors(int factorNumber) {
	//					int compare = 0;
	//					int factor= 0;
	//					double valueFactor;
	//					for (int i=factorNumber;i>0; i--) {
	//						valueFactor= factorNumber/i;
	//						compare= (int)factorNumber/i;
	//						
	//					if (compare==valueFactor) {
	//						factor+= factor+1;
	//					}
	//				}
	//					return factor;
	//				}
	//		

	//number of factors
	//		private static double factoring(double factorNumber) {
	//			double compare = 0;
	//			double factor= 0;
	//			double valueFactor;
	//			for (int i=factorNumber;i>0; i--) {
	//				valueFactor= factorNumber/i;
	//				compare= (int)factorNumber/i;
	//				
	//			if (compare==valueFactor) {
	//				factor+= factor+1;
	//			}
	//			
	//		}	return factor;
	//		}

	//	private static long factoring(long factorNumber) {
	//	long compare = 0;
	//	long factor= 0;
	//	long valueFactor;
	//	for (int i=factorNumber;i>0; i--) {
	//		valueFactor= factorNumber/i;
	//		compare= (long)factorNumber/i;
	//		
	//	if (compare==valueFactor) {
	//		factor+= factor+1;
	//	}
	//	
	//}	return factor;
	//}	

	//private static int numOfFactors (int num) {
	//} 



				public static void main(String[] args) {
			//				Scanner scan = new Scanner(System.in);
			//				System.out.println("Do you want to use an int, double or long");
			//				String typeChoice= scan.nextLine();
			//
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
			//				}
			//				if (typeChoice.equalsIgnoreCase("long")){
			//					System.out.println("How long do you want the array to be?");
			//					long min= scan.nextLong();
			//					long[] arrayMin = new long [(int) min];
			//
			//					for (int i=0; i < arrayMin.length; i++) {
			//						System.out.println("Please input a number to compare");
			//						arrayMin[i]= scan.nextInt();
			//					}
			//					long arrayMi= min(arrayMin);
			//					System.out.println(arrayMi);	
			//				}
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
		}

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
		//			System.out.println("What number do you want to find the factorial of?");
		//			int typeFactorial= scan.nextInt();
		//			int sendNumber= factorial(typeFactorial);
		//			System.out.println(sendNumber);
		//		}
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



