//資三B 郭家柔 06156288
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("輸入:");
		int cash = input.nextInt();
		
		if(cash<10000) {
			int a = cash/100;
			int b = cash%100/50;
			int c = cash%50/10;
			int d = cash%10/5;
			int e = cash%5/1;
			System.out.print(a+" "+b+" "+c+" "+d+" "+e);
		}else {
			System.out.print("數值錯誤");
		}
	}
}