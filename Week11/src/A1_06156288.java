//資三B 06156288 郭家柔
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) {
		String s;
		char c;
		int count=0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string:");
		s = keyboard.nextLine();
		
		System.out.println("Enter a character:");
		c = keyboard.nextLine().charAt(0);
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == c )
				count++;
		}
		
		System.out.println(c+"出現"+count+"次");

	}

}
