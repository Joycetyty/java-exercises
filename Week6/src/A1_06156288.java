//資三B 郭家柔 06156288
import java.io.*;
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("D://1IN.txt");
		Scanner input = new Scanner(file);
		int sum=0, temp=0;
		while(input.hasNext()) {
			int a = input.nextInt();

			if( a <100 && a%2==0) {
				temp=a;
				sum+=temp;
				System.out.print(temp);
				System.out.print("+");
			}		
	}
		System.out.println("="+sum);
 }
}
