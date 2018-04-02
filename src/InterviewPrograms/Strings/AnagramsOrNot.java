package InterviewPrograms.Strings;

import java.util.Arrays;

public class AnagramsOrNot {

	/**
	 * @author surendra_vidiyala 04/01/2018
	 *
	 */
	/*
	 * Two strings are called anagrams if they contain same set of characters but in
	 * different order. For example, “Dormitory – Dirty Room”, “keep – peek”,
	 * “School Master – The Classroom” are some anagrams.
	 */

	public static void isAnagram(String s1, String s2) {
		// Removing all white spaces from s1 and s2

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		// Initially setting status as true
		boolean status = true;

		if (str1.length() != str2.length()) {
			// Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
			status = false;
		} else {
			// Changing the case of characters of both copyOfs1 and copyOfs2 and converting
			// them to char array
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();

			// Sorting both s1Array and s2Array
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// Checking whether s1Array and s2Array are equal
			status = Arrays.equals(arr1, arr2);
		}
		// Output
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {

		isAnagram("Mother In Law", "Hitler Woman");
		isAnagram("keEp", "peeK");
		isAnagram("SiLeNt CAT", "LisTen AcT");
		isAnagram("Debit Card", "Bad Credit");
		isAnagram("School MASTER", "The ClassROOM");
		isAnagram("DORMITORY", "Dirty Room");
		isAnagram("ASTRONOMERS", "NO MORE STARS");
		isAnagram("Toss", "Shot");
		isAnagram("joy", "enjoy");
		isAnagram("LISTEN", "SILENT");
		isAnagram("TRIANGLE", "INTEGRAL");
	}

}
