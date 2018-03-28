package InterviewPrograms.Math;

import java.util.Scanner;

public class CheckMobileNumber {
	/**
	 * @author surendra_vidiyala 03/26/2018
	 *
	 */
	// write a java program which checks whether user input is number or not.

	public static void main(String[] args) {

		System.out.println("Enter your Mobile Number:");

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		//program which checks whether mobile number entered by user has 10 digits only.
		if (Utility.isNumberOrNot(input) && (input.length() == 10)) {
			System.out.println("Good!!! You have entered valid mobile number");
		} else {
			System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
		}

		sc.close();

	}

}
