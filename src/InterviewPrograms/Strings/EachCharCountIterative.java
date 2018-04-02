package InterviewPrograms.Strings;

public class EachCharCountIterative {

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

	public static void main(String[] args) {

		int flag = 0;
		String str = "This is Surendra Vidiyala";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			flag = 0;
			int f = 0;
			for (int j = i; j < str.length(); j++) {
				for (int k = 0; k < i; k++) {
					if (str.charAt(i) == str.charAt(k)) {
						f = 1;
					}
				}
				if (f == 1)
					break;
				if (str.charAt(i) != ' ')
					flag = 1;

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (flag == 1)
				System.out.println("count of " + str.charAt(i) + " = " + count);
		}

	}
}
