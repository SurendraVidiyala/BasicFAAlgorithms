package InterviewPrograms.Math;

import java.util.Scanner;

public class SumOfNNumbers {

	/**
	 * @author surendra_vidiyala 03/30/2018
	 *
	 */
	// Write a function that takes a value N and returns the sum of 1 to N.

	public static int sum(int num) {

		int sum = 0;
		for (int i = 0; i <= num; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Random Number: ");
		String input = sc.nextLine();
		if (Utility.isNumberOrNot(input) && (input != "")) {
			try {
			int num = Integer.parseInt(input);
			System.out.println("Sum of N numbers is: " + sum(num));
			}catch(RuntimeException ex) {
				System.out.println("Invalid Number!, Please enter valid number.");
			}
		} else {
			System.out.println("Please Enter Valid Number!");
		}
		sc.close();
	}

}
