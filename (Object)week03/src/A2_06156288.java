//資三B 郭家柔 06156288
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] numbers = new double[10];

		System.out.print("輸入10個型態為double的數字: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		System.out.println("最小值為: " + min(numbers));
	}

	public static double min(double[] array) {
		double min = array[0];	// The minimum value
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}

}
