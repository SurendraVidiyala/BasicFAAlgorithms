package InterviewPrograms.Arrays;

public class EqualityTwoArraysIterative {

	/**
	 * @author surendra_vidiyala 03/31/2018
	 *
	 */
	/*
	 * This method will be time consuming if the arrays have lots of elements. This
	 * method is not recommended to check the equality of two arrays if the arrays
	 * are big in size.
	 */

	public static void main(String[] args) {

		int[] arrayOne = { 2, 5, 1, 7, 4 };

		int[] arrayTwo = { 2, 5, 1, 8, 4 };

		boolean equalOrNot = true;

		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}
		if (equalOrNot) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}

	}

}
