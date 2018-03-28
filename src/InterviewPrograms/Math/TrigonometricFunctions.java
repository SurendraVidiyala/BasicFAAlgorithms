package InterviewPrograms.Math;

public class TrigonometricFunctions {

	/**
	 * @author surendra_vidiyala 03/28/2018. 
	 * how to find trigonometric values of an
	 * angle of 90 degrees.
	 */

	/*
	 * java.lang.Math class has many useful methods to perform mathematical
	 * operations like exponential, logarithms, square roots, cube roots and
	 * trigonometric functions. Math class is a final class in and all it;s methods
	 * are static. In this post, we will see how to find trigonometric values like
	 * sin, cos, tan, sec, cosec and cot of an angle using sin(), cos() and tan()
	 * methods of Math class.
	 * 
	 * Here is how we find out trigonometric values of an angle using methods of
	 * Math class.
	 * 
	 * 1) sine of an angle —> Math.sin();
	 * 
	 * 2) cosine of an angle —> Math.cos();
	 * 
	 * 3) tangent of an angle —> Math.tan();
	 * 
	 * 4) sec of an angle —> 1/Math.sin();
	 * 
	 * 5) cosec of an agnle —> 1/Math.cos();
	 * 
	 * 6) cot of an angle —> 1/Math.tan();
	 */
	
	public static void main(String[] args) {

		double angle = 90;

		// converting angle to radians.
		double angleInRadians = Math.toRadians(angle);
		//System.out.println(Math.sin(20));

		double sineOfNum = Math.sin(angleInRadians);
		double cosineOfNum = Math.cos(angleInRadians);
		double tangentOfNum = Math.tan(angleInRadians);

		double secOfNum = (1 / sineOfNum);
		double cosecOfNum = (1 / cosineOfNum);
		double cotOfNum = (1 / tangentOfNum);

		System.out.println("sin(" + angle + ") = " + sineOfNum);
		System.out.println("cos(" + angle + ") = " + cosineOfNum);
		System.out.println("tan(" + angle + ") = " + tangentOfNum);

		System.out.println("--------------------------------");

		System.out.println("sec(" + angle + ") = " + secOfNum);
		System.out.println("cosec(" + angle + ") = " + cosecOfNum);
		System.out.println("cot(" + angle + ") = " + cotOfNum);
	}

}
