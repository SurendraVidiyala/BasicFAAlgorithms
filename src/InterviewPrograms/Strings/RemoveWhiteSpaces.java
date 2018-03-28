package InterviewPrograms.Strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		/**
		 * @author surendra_vidiyala 03/27/2018
		 *
		 */
		
		/**
		* Write a java program to remove all white spaces from a string.
		*/

		String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
		
		System.out.println(str.trim());
		

		// 1. Using replaceAll() Method

		String strWithoutSpace = str.replaceAll("\\s", "");
		
		System.out.println(strWithoutSpace); // Output : CoreJavajspservletsjdbcstrutshibernatespring

		// 2. Without Using replaceAll() Method

		char[] strArray = str.toCharArray();
		
		int length = strArray.length;
		System.out.println(length);

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}

		System.out.println(sb); // Output : CoreJavajspservletsjdbcstrutshibernatespring

	}

}
