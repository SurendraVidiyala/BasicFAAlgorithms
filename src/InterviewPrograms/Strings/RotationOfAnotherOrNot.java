package InterviewPrograms.Strings;

public class RotationOfAnotherOrNot {

	/**
	 * @author surendra_vidiyala 03/31/2018
	 *
	 */

	public static void isRotation(String input1, String input2) {

		String rot = "";
		for (int i = input1.length() - 1; i >= 0; i--) {
			rot = rot + input1.charAt(i);
		}
		if (rot.equals(input2)) {
			System.out.println(input1 + " is rotation of " + input2);
		} else
			System.out.println("Both are not same");

	}

	public static void main(String[] args) {

		isRotation("java", "avaj");
	}

}