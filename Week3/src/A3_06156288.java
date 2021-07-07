//資三B 郭家柔 06156288
import java.util.Scanner;
public class A3_06156288 {
	 public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter a hex digit: ");
		  String hexString = input.nextLine();
		 
		  if (hexString.length() != 1) {
		   System.out.println("Enter a hex character:");
		   System.exit(1);
		  }
		 
		  char ch = Character.toUpperCase(hexString.charAt(0));
		  int value = 0;
		  if (ch <= 'F' && ch >= 'A') {
		   value = ch - 'A' + 10;
		  } else if (Character.isDigit(ch)) {
		   value = ch - '0';
		  } else {
		   System.out.println(ch + " is an invalid input");
		   System.exit(0);
		  }
		 
		  System.out.println("The binary value is "+ Integer.toBinaryString(value));
		
		 }
}
