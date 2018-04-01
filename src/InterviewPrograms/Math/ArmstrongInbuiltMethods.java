package InterviewPrograms.Math;

public class ArmstrongInbuiltMethods {

	/**
	 * @author surendra_vidiyala 04/01/2018
	 *
	 */
	/*
	 * A number is called an Armstrong number if it is equal to sum of its digits
	 * each raised to the power of number of digits in it. For example: 153, 371,
	 * 407, 9474, 54748 are some Armstrong numbers.
	 */

	public static void main(String[] args) {
		isArmstrong(153);
		isArmstrong(371);
		isArmstrong(9474);
		isArmstrong(54748);
		isArmstrong(407);
		isArmstrong(1674);
	}

	public static void isArmstrong(int num) {

		int numOfDigits = String.valueOf(num).length();
		int copyOfNum = num;
		int sum = 0;

		while (copyOfNum > 0) {
			sum += Math.pow(copyOfNum % 10, numOfDigits);
			copyOfNum /= 10;
		}
		if (num == sum) {
			System.out.println(num + " is an ArmStrong number");
		} else {
			System.out.println(num + " is not an ArmStrong number");
		}
	}
}
