package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String text = "Vinicius, Course Java, 8,7,9,8";
		String[] array = text.split(",");
		System.out.println("Name:" + array[0]);
		System.out.println("Course:" + array[1]);
		System.out.println("Grade:" + array[2]);
		System.out.println("Grade:" + array[3]);
		System.out.println("Grade:" + array[4]);
		System.out.println("Grade: " + array[5]);

		System.out.println("------------------------------------------------------------------");
		// Converting an array to a list
		List<String> list = Arrays.asList(array);

		for (String valueString : list) {
			System.out.println(valueString);

		}
		System.out.println("------------------------------------------------------------------");
		// Converting a list to an array//
		String[] ConvertArray = list.toArray(new String[6]);
		for (int i = 0; i < ConvertArray.length; i++) {
			System.out.println(ConvertArray[i]);
		
		}
	}

}
