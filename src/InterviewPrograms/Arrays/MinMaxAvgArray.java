package InterviewPrograms.Arrays;

public class MinMaxAvgArray {
	
	/**
	 * @author surendra_vidiyala 03/30/2018
	 *
	 */
	// Write 3 functions that return the min,avg and max of an array.

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findAvg(int[] arr) {
		// Take sum, divide by number of elements.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of an Array is: " + sum);
		return sum / arr.length;
	}

	public static void main(String[] args) {

		
		System.out.println("*********************");
		int[] numbers = { 5, -2, 0, 234, -438, 63 };
		
		System.out.println("Minimum of an Array: " + findMin(numbers));
		System.out.println("Maximum of an Array: " + findMax(numbers));
		System.out.println("Average of an Array: " + findAvg(numbers));
}

}
