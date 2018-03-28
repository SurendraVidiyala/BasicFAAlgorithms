package InterviewPrograms.Arrays;

import java.util.HashSet;

public class DuplicatesInArraysHashSet {

	/**
	 * 
	 * @author surendra_vidiyala 03/28/2018
	 */

	/*
	 * Java Program To Find Duplicate Elements In An Array Using HashSet. Using
	 * HashSet performance is better than BruteForce Method, the time complexity is
	 * O(n).
	 * 
	 */
	public static void main(String[] args) {

		String[] strArr = { "Surya", "Arya", "Navin", "Suren", "Surya", "Madhu", "Suren" };

		HashSet<String> set = new HashSet<>();

		for (String arrElement : strArr) {
			if (!set.add(arrElement)) {
				System.out.println("Duplicate Element is : " + arrElement);
			}
		}

	}

}
