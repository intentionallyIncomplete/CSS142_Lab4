
/**
 * Write a description of class Lab4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.*;

public class Lab04 {

	/**
	 * main method (driver) to execute all the method calls properly
	 *
	 * @param args
	 */

	//initialize variable with 1 for starting point
	//if this is going to work, based on the math, we need to use a 'long' access modifier
	private int grainsRice = 1;
	private int grainsTotal;


	public static void main(String[] args) {

		Lab04 l4 = new Lab04();
		//l4.countGrains();

		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter a whole number");
		//int numberInput = scanner.nextInt();
		//l4.powerOfTwo(numberInput);
		//l4.numBackward(numberInput);

		//		System.out.println("Enter a size for a line");
		//		int size = scanner.nextInt();
		//		l4.straightLine(size);

		System.out.println("Enter a size for a box");
		int boxSize = scanner.nextInt();
		l4.boxMaker(boxSize);
	}


	public void countGrains() {

		// declare and initialize your variables first, if any
		for(int i =0;i<=64;i++){
			grainsRice *= 2;
			grainsTotal += grainsRice;
			System.out.println("Day " + i + " and you got " + grainsRice + " grain(s) of rice "+
					"for a total of " + grainsTotal + " grain(s)");
		}
	}

	/**
	 * Determines if a number is power of 2 and displays result per lab instructions
	 * @param numberInput
	 */
	public void powerOfTwo (int numberInput) {
		int newNum = 2;
		int expCount = 0;
		while(newNum <= numberInput){
			newNum *= 2;
			expCount++;
		}
		System.out.println(numberInput + " is 2 to the power of " + expCount);
	}

	/**
	 * Reverses the digits of a given integer, i.e. 12345 would become 54321 per lab instructions
	 *
	 * @param number
	 */
	public static void numBackward(int numberInput) {
		int num = numberInput;
		int rev = 0;
		int temp;
		while (num > 0)
		{
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		if(numberInput == rev){
			System.out.println(numberInput + " is a palidrome");
		}else{
			System.out.println(numberInput + " is not a palidrome");
		}
	}

	/**
	 * Produces and displays a straight line using asterisks per lab instructions
	 */

	public void straightLine(int size) {
		for(int i=0;i<size;i++){
			System.out.print("*");
			for(int j=0;j<size-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * void method that asks the user for an integer x (using Scanner), and prints box using asterisks
	 * refer to detailed instructions in lab description part 6
	 */

	public static void boxMaker(int boxSize) {
		int height = 0;
		while(height < boxSize){
			height++;
			System.out.print("*");
		}
		System.out.println();
		height = 0;
		while(height < boxSize - 2){
			height++;
			System.out.print("*"); 
			int width = 0;
			while(width < boxSize - 2){
				width++;
				System.out.print(" "); 
			}
			System.out.println("*"); 
		}
		height = 0;
		while(height < boxSize){
			height++;
			System.out.print("*");
		}
	}

	/**
	 *  void method to print a shape that is a triangular pattern with sides of 6 asterisks
	 *  refer to detailed instructions in lab description part 7a
	 */

	public static void shape7a(int number) {

		// declare and initialize your variables first, if any then start writing your code



	}


	/**
	 * void method to print a shape that is an "X" pattern with arms of 3 asterisks each.
	 * refer to detailed instructions in lab description part 7b
	 */

	public static void shape7b(int number) {

		// declare and initialize your variables first, if any then start writing your code



	}

} // end class Lab4






