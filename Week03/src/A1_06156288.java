//資三B 郭家柔 06156288
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) {
		char i;
		int ascii;

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter an character: ");
	    i=input.next().charAt(0);
	    
	    System.out.println("The ASCII code for  character" + i + " is "
	            + (int) i);
	}
}
