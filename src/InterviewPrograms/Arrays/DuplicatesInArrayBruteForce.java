package InterviewPrograms.Arrays;

public class DuplicatesInArrayBruteForce {

	/**
	 * 
	 * @author surendra_vidiyala 03/28/2018
	 */
	
	/*
	 * Java Program To Find Duplicate Elements In An Array Using Brute Force Method.
	 * Using BruteForce Method, the time complexity is O(n^2).
	 * 
	 */
	public static void main(String[] args) {

		String[] arr = {"Surya","Arya","Navin","Suren","Surya","Madhu","Suren"};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if((arr[i].equals(arr[j])) && (i!=j)) {
					System.out.println("Duplicate Element is: "+arr[j]);
				}
			}
		}
	}

}
