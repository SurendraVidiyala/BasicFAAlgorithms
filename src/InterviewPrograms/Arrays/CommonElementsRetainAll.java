package InterviewPrograms.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsRetainAll {

	/**
	 * @author surendra_vidiyala 03/29/2018
	 *
	 */
	/*
	 * Write a java program to find common elements between two arrays? OR Write a
	 * java program to find intersection of two arrays?
	 */

	public static void main(String[] args) {

		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };

		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };

		List<String> list1 = Arrays.asList(s1);
		List<String> list2 = Arrays.asList(s2);

		Set<String> set1 = new HashSet<>(list1);
		Set<String> set2 = new HashSet<>(list2);
		
		//set1.removeAll(set2);

		set1.retainAll(set2);
		System.out.println("Intersection of two Arrays s1 and s2 are: "+set1);

	}

}
