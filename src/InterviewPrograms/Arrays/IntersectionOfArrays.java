package InterviewPrograms.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
	
	/**
	 * @author surendra_vidiyala 03/29/2018
	 *
	 */
	/*
	 * Write a java program to find common elements between two arrays? OR Write a
	 * java program to find intersection of two Integer arrays?
	 */

	public static void main(String[] args) {
		
		Integer[] i1 = {1, 2, 3, 4, 5, 4};
		 
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
        
        Set<Integer> set1 = new HashSet<>(Arrays.asList(i1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(i2));
        
        set1.retainAll(set2);
        System.out.println("Duplicate Numbers between i1 ans i2 arrays: "+set1);
        

	}

}
