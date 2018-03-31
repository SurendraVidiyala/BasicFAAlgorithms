package InterviewPrograms.Arrays;

public class MissingNumberInArray {

	/**
	 * @author surendra_vidiyala 03/30/2018
	 *
	 */
	/*
	 * Puzzle: If ‘n’ is the positive number and ‘a’ is an array of integers of
	 * length n-1 containing elements from 1 to n. Then find the missing number in
	 * ‘a’ in the range from 1 to n. Occurrence of each element is only once. i.e
	 * ‘a’ does not contain duplicates.
	 */

	// Method to calculate sum of 'n' numbers
	public static int sumOfNNumbers(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	public static int sumOfElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int n = 8;
		int[] a = { 1, 4, 5, 3, 7, 8, 6 };

		// Step 1
		int sumOfNnumbers = sumOfNNumbers(n);

		// Step 2
		int sumOfElements = sumOfElements(a);

		// Step 3
		int missingNumber = sumOfNnumbers - sumOfElements;

		System.out.println("Missing Number is = " + missingNumber);
	}
}
