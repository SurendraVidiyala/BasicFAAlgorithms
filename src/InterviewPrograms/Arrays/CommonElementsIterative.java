package InterviewPrograms.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsIterative {

	/**
	 * @author surendra_vidiyala 03/29/2018
	 *
	 */
	/*
	 * Write a java program to find common elements between two arrays? 
	 * OR Write a java program to find intersection of two arrays?
	 */
	public static void main(String[] args) {

		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };

		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };

		Set<String> set = new HashSet<>();

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}

		System.out.println("Common Elements in arrays s1 and s2 are: " + set);
	}

}
