package InterviewPrograms.Math;

public class PrimeNumberOrNot {

	/**
	 * @author surendra_vidiyala 03/31/2018
	 *
	 */
	// Find whether the given number is prime or not.

	public static void isPrimeOrNot(int num) {
		int i, m = 0, flag = 0;
		int n = num;// it is the number to be checked
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println(" Number " + n + " is not Prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Number " + n + " is prime");
		}
	}

	public static void main(String[] args) {
		isPrimeOrNot(19);
		isPrimeOrNot(8);
		isPrimeOrNot(11);
		isPrimeOrNot(9);
	}

}
