package InterviewPrograms.Strings;

import java.util.Scanner;

public class RemoveVowels {

	/**
	 * @author surendra_vidiyala 04/01/2018
	 *
	 */
	/*
	 * Write a java program to remove all vowels from string. Your program should
	 * take one string from the user as input and remove all vowels from this string
	 * and print it without vowels.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string...");
		String input = sc.nextLine();
		String newInputString = input.replaceAll("[AEIOUaeiou]", "");
		System.out.println("The string without vowels...");
		System.out.println(newInputString);
		sc.close();
	}

}
