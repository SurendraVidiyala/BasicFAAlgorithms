package InterviewPrograms.Strings;

import java.util.Scanner;

public class ReverseWords {
	
	/**
	 * @author surendra_vidiyala 03/28/2018
	 *
	 */

	private void reverseWords(String line) {
		String res = "";
		String[] tokens = line.split(" ");
		for (int i = tokens.length - 1; i >= 0; i--)
			res += " " + reverse(tokens[i]);
		System.out.println("reverse words:" + res);
	}

	private String reverse(String s) {
		if (s != null && s.length() >= 1)
			return reverse(s.substring(1)) + s.charAt(0);
		return " ";
	}

	public static void main(String[] args) {
		System.out.println("Write a Sentence:");
       Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        ReverseWords rw = new ReverseWords();
        rw.reverseWords(line);
       // rw.reverse(line);
        sc.close();
	}
 
}
