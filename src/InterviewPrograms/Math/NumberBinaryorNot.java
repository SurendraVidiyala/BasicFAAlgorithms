package InterviewPrograms.Math;

public class NumberBinaryorNot {

	/**
	 * @author surendra_vidiyala 03/31/2018
	 *
	 */

	/*
	 * Java Program To Check Whether The Given Number Is Binary Or Not. we use two
	 * simple operators – % and /, to extract the digits from the given number. You
	 * may know that, if we divide any number by 10 i.e number/10, it will remove
	 * last digit from the given number and if you use remainder operator like
	 * number%10, it will give last digit of the given number.
	 */
	public static void main(String[] args) {

		isBinaryOrNot(128956);
		isBinaryOrNot((101110));
		isBinaryOrNot((42578));
		isBinaryOrNot((10110101));
	}

	public static void isBinaryOrNot(int num) {
		boolean isBinary = true;
		int copyOfNumber = num;
		while (copyOfNumber != 0) {
			int temp = copyOfNumber % 10; // Gives last digit of the number
			if (temp > 1) {
				isBinary = false;
				break;
			} else {
				copyOfNumber = copyOfNumber / 10; // Removes last digit from the number
			}
		}
		if (isBinary) {
			System.out.println(num + " is a binary number");
		} else {
			System.out.println(num + " is not a binary number");
		}
	}

}
