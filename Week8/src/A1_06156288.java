//資三B 郭家柔 06156288
import java.io.*;
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("D://1IN.txt");
		Scanner input = new Scanner(file);
        int count=0;
		while(input.hasNext()) {
			int a = input.nextInt();

			if(isPrime(a)) {
				System.out.println(a);
				count++;
			}
	}
		if(count==0) 
			System.out.print("沒有質數");
 }
	
	  public static boolean isPrime(int number) {
		    for (int divisor = 2; divisor <= number / 2; divisor++) {
		      if (number % divisor == 0) {
		        return false;
		      }
		    }
		    return true;
		  }
}