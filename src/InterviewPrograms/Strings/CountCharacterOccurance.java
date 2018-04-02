package InterviewPrograms.Strings;

public class CountCharacterOccurance {

	/**
	 * @author surendra_vidiyala 04/02/2018
	 *
	 */
	/*
	 * java program to count the total number of occurrences of a given character in
	 * a string without using any loop.
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String str = "Java angular react oracle bootstrap";

		char c = 'a';

		int count = str.length() - str.replace("a", "").length();

		System.out.println("Number of occurances of 'a' in " + str + " = " + count);
	}

}
