package cursojava.executavel;

public class SplitArray {

	public static void main(String[] args) {

		String text = "Vinicius, Course Java, 8,7,9,8";
		String[] array = text.split(",");
		System.out.println("Name:" + array[0]);
		System.out.println("Course:" + array[1]);
		System.out.println("Grade:" 	+ array[2]);
		System.out.println("Grade:" + array[3]);
		System.out.println("Grade:" + array[4]);
		System.out.println("Grade: " + array[5]);

	}

}
