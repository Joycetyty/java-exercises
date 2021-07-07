//資三B 郭家柔 06156288
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) {
		int[] array = new int[10];

		System.out.print("Enter 10 integers numbers: ");
		
		reverse(array);
		System.out.print("The numbers after the reverse is: ");

		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
		System.out.println();
	}


	public static void reverse(int[] array) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) 
			array[i] = input.nextInt();
    }
}
