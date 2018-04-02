package InterviewPrograms.Strings;

public class ReverseEachWord {

	/**
	 * 
	 * @author surendra_vidiyala 04/02/2018
	 */
	/*
	 * Write a java program to reverse each word of a given string? For example, If
	 * “Hello Java World” is input string then output should be “olleH avaJ dlroW”.
	 */
	public static void reverseEachWordOfString(String inputStr) {
		
		String[] words = inputStr.split(" ");
		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(inputStr);
		System.out.println(reverseString);

		System.out.println("-------------------------");
	}

	public static void main(String[] args) {

		reverseEachWordOfString("Hello Java World");

		reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");

		reverseEachWordOfString("I am string not reversed");

		reverseEachWordOfString("Reverse Me");
		
		reverseEachWordOfString("Full Stack Java Developer");
	}
}