package InterviewPrograms.Strings;

public class ReverseTheString {

	/**
	 * @author surendra_vidiyala 03/28/2018
	 *
	 */
	/**
	 * write different ways to reverse a string or he may ask you to reverse a
	 * string without using in-built methods or he may ask you to reverse a string
	 * using recursion.
	 */
	public static void main(String[] args) {

		// 1. Using StringBuffer Class

		String str = "JavaPractice";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);    //Output: ecitcarPavaJ
		
		//2. Using iterative method
		
		char [] strArray = str.toCharArray();
		
		for(int i = strArray.length-1; i>=0; i--) {
			System.out.print(strArray[i]);    //Output: ecitcarPavaJ
		}
		
		System.out.println();
		//3. Using Recursive Method
		
		System.out.println(recursiveMethod(str));    //Output: ecitcarPavaJ
	}
		
		public static String recursiveMethod(String str) {
			if((null == str) || (str.length()<=1)){
				return str;
			}
			return recursiveMethod(str.substring(1)) + str.charAt(0);
		}

	}


