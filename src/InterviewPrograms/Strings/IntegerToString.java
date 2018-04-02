package InterviewPrograms.Strings;

public class IntegerToString {

	/**
	 * 
	 * @author surendra_vidiyala 04/02/2018
	 */
	/*
	 * You are also often need to do the reverse conversion i.e converting from
	 * integer to string. Java provides couple of methods to do that also. one is
	 * Integer.toString() method and another one is String.valueOf() method. Both
	 * these methods return string representation of the given integer.
	 */
	public static void main(String[] args) {

		int i = 2015;
		
        //Method: 1 Using toString() method.
		String str = Integer.toString(i);
		
		//Method: 2 Using valueOf() static methods.
		String value = String.valueOf(i);
		
		System.out.println("String value using static methods: "+value);
		System.out.println("String value using toString() methood: "+str);
	}

}
