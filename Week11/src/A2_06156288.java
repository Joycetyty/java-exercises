//資三B 06156288 郭家柔
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) {
		String s;
		String reverse=" ";
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string:");
		s = keyboard.nextLine();
		
		for(int i=s.length()-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.print(reverse.toUpperCase());
	}

}
