package InterviewPrograms.Math;

public class NumberPalindromeOrNot {

	/**
	 * @author surendra_vidiyala 03/31/2018
	 *
	 */
	// Find whether the given number is palindrome or not.

	public static void main(String[] args) {
		isPalindromeOrNot(454);
		isPalindromeOrNot(676);
		isPalindromeOrNot(543);
		isPalindromeOrNot(777);
		isPalindromeOrNot(8989);
	}

	public static void isPalindromeOrNot(int num) {
		int r, sum = 0, temp;
		int n = num; // It is the number variable to be checked for palindrome.
		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder.
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(num+" is a Palindrome Number");
		} else {
			System.out.println(num+" is Not a Palindrome");
		}
	}

}
