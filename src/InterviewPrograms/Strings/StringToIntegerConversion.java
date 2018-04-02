package InterviewPrograms.Strings;

public class StringToIntegerConversion {

	/**
	 * 
	 * @author surendra_vidiyala 04/02/2018
	 */

	/*
	 * Program to Convert String to Integer.
	 * 
	 * There are two methods available in java to convert string to integer. One is
	 * Integer.parseInt() method and another one is Integer.valueOf() method. Both
	 * these methods are static methods of java.lang.Integer class. Both these
	 * methods throw NumberFormatException if input string is not a valid integer.
	 * The main difference between Integer.parseInt() and Integer.valueOf() method
	 * is that parseInt() method returns primitive int where as valueOf() method
	 * returns java.lang.Integer object.
	 */
	public static void main(String[] args) {

		String str = "2018";

		// Using parseInt() method.
		int num = Integer.parseInt(str);
		System.out.println("String to Integer using parseInt() method: " + num);

		// Using valueOf() static method.
		int value = Integer.valueOf(str);
		System.out.println("String to Integer using valueOf() static method: " + value);
	}

}
