package InterviewPrograms.Strings;

import java.util.HashMap;

public class EachCharCountInString {

	/**
	 * @author surendra_vidiyala 04/02/2018
	 * 
	 */
	/*
	 * Given a string , you have to count the number of occurrences of each
	 * character in it. For example, If “Java J2EE Java JSP J2EE” is the given
	 * string then occurrences of each character in this string is E=4, 2=2, v=2,
	 * =4, P=1, S=1, a=4, J=5.
	 */
	public static void characterCount(String inputStr) {

		// Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array
		char[] strArray = inputStr.toCharArray();

		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		// Printing the charCountMap
		System.out.println(charCountMap);
	}

	public static void main(String[] args) {
		characterCount("Java J2EE Java JSP J2EE");

		characterCount("All Is Well");

		characterCount("Done And Gone");
	}
}