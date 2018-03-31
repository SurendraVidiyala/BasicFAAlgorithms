package InterviewPrograms.Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class EqualityTwoArraysJava8 {

	/**
	 * @author surendra_vidiyala 03/31/2018
	 *
	 */

	@SuppressWarnings({  "rawtypes", "unused" })
	public static void main(String[] args) {

		int[] arrayOne = { 21, 56, 11, 37, 24 };
		int[] arrayTwo = { 24, 11, 21, 56, 37 };

		if (arrayOne.length != arrayTwo.length) {
		System.out.println("Arrays are not Equal");
		return;
		}
		Stream stream1 = Arrays.stream(arrayOne).boxed();
		Stream stream2 = Arrays.stream(arrayTwo).boxed();

		//Optional optionalArray1 = stream1.filter(i -> !stream2.collect(Collectors.toList()).contains(i)).findAny();

	//	if (optionalArray1.isPresent()) {
		System.out.println("Arrays are not Equal");
	//	return;
	//	}else {
	//	System.out.println("Arrays are Equal");
		//}
	}
}
