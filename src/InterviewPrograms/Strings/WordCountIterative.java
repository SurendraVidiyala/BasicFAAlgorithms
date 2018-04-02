package InterviewPrograms.Strings;

public class WordCountIterative {

	/**
	 * @author surendra_vidiyala 04/02/2018
	 * 
	 */
	/*
	 * Java Program to count the words within a string.
	 */
	public static void main(String[] args) {
		System.out.println("Simple Java Word Count Program: ");
		String str1 = "Today is Holdiay Day";
		System.out.println("Given String is: "+str1);
		int wordCount = 1;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ' ' && str1.charAt(i + 1) != ' ') {
				wordCount++;
			}
		}
		System.out.println("Word count is = " + wordCount);
	}

}
