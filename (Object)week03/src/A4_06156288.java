//資三B 郭家柔 06156288
import java.util.Scanner;
public class A4_06156288 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];

		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		// Display the smallest value
		System.out.println("The index of the smallest element is " + 
			indexOfSmallestElement(numbers));
	}

	public static int indexOfSmallestElement(double[] array) {
		if (array.length <= 1)
			return 0;
		
		
		double min = array[0];
		int minimumIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minimumIndex = i;
			}
		}
		return minimumIndex;
	}

}
