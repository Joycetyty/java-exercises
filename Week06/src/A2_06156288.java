//資三B 郭家柔 06156288
import java.io.*;
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("D://2IN.txt");
		Scanner input = new Scanner(file);		
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入單字長度:");
		int n = keyin.nextInt();
		int count=0;

		while(input.hasNext()) {
			String s = input.next();
			String s2=s.replaceAll("\\pP","");

			if(s2.length()==n) {
			count++;
			}
	}
		System.out.println(count);
 }
}