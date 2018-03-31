package InterviewPrograms.Arrays;

import java.util.Arrays;

public class EqualityTwoArraysEquals {

	/**
	 * @author surendra_vidiyala 03/31/2018
	 *
	 */
	/*
	 * we use in-built equals() method of Arrays class to check the equality of two
	 * arrays. This method takes two arrays as parameters and returns true if both
	 * the arrays have same number of elements and corresponding pairs of elements
	 * of both arrays are equal.
	 */

	public static void main(String[] args) {

		String[] s1 = { "java", "j2ee", "struts", "hibernate" };

		String[] s2 = { "jsp", "spring", "jdbc", "hibernate" };

		String[] s3 = { "java", "j2ee", "struts", "hibernate" };

		System.out.println(Arrays.equals(s1, s2)); // Output : false

		System.out.println(Arrays.equals(s1, s3)); // Output : true
	}

}
