//資三B 郭家柔 06156288
import java.util.Scanner;
public class A4_06156288 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	

		System.out.print("Enter an integer: ");
		int number = input.nextInt();


		System.out.println("Is 10 divisible by 5 and 6? " +
			((number % 5 == 0) && (number % 6 == 0)));
		System.out.println("Is 10 divisible by 5 or 6? " +
			((number % 5 == 0) || (number % 6 == 0)));
		System.out.println("Is 10 divisible by 5 of 6, but not both? " +
			((number % 5 == 0) ^ (number % 6 == 0)));
	}
}
