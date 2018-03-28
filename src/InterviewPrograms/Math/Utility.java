package InterviewPrograms.Math;

public class Utility {
	
	/**
	 * @author surendra_vidiyala 03/26/2018
	 *
	 */
	public static boolean isNumberOrNot(String input) {
		try {
			//Integer.parseInt(input);
			Long.parseLong(input);
		}
		catch(RuntimeException ex) {
			return false;
		}
		return true;
	}

}
