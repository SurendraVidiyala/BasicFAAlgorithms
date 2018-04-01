package InterviewPrograms.Math;

public class ArmstrongNumberOrNot {

	/**
	 * @author surendra_vidiyala 04/01/2018
	 *
	 */
	/*
	 * A number is called an Armstrong number if it is equal to sum of its digits
	 * each raised to the power of number of digits in it. For example: 153, 371,
	 * 407, 9474, 54748 are some Armstrong numbers.
	 */

	public static void checkArmstrongOrNot(int num) {

		int copyOfNumber = num;
		int noOfDigits = String.valueOf(num).length();
		int sum = 0;

		while (copyOfNumber != 0) {
			int lastDigit = copyOfNumber % 10;

			int lastDigitToThePowerOfNoOfDigits = 1;

			for (int i = 0; i < noOfDigits; i++) {
				lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
			}
			sum = sum + lastDigitToThePowerOfNoOfDigits;
			copyOfNumber = copyOfNumber / 10;
		}

		if (sum == num) {
			System.out.println(num + " is an armstrong number");
		} else {
			System.out.println(num + " is not an armstrong number");
		}
	}

	public static void main(String[] args) {

		checkArmstrongOrNot(153);

		checkArmstrongOrNot(371);

		checkArmstrongOrNot(9474);

		checkArmstrongOrNot(54748);

		checkArmstrongOrNot(407);

		checkArmstrongOrNot(1674);

	}

}
