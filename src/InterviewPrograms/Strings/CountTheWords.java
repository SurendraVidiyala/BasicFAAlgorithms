package InterviewPrograms.Strings;

import java.util.Scanner;

public class CountTheWords {

	/**
	 * @author surendra_vidiyala 04/02/2018
	 *
	 */
	/*
	 * Java Program to count the number of words in a string.
	 */

	public static boolean stringCheck(String str) {
		boolean status = true;
		try {
			if ((str == null) || (str == " ") || str.isEmpty()) {
				// throw new RuntimeException();
				status = false;
			}
		} catch (RuntimeException e) {
			return !status;
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// Method: 1
		if (stringCheck(str)) {
			String[] words = str.trim().split(" ");
			System.out.println("Number of words in the string is: = " + words.length);
		} else {
			System.out.println("Invalid String!, Please enter the valid String.");
		}

		// Method: 2
		int count = 1;
        if(stringCheck(str))
		for (int i = 0; i < str.length() - 1; i++) {
				if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
					count++;
				}
			}
		System.out.println("Number of words in a string = " + count);
		sc.close();
	}

}
