//資三B 06156288 郭家柔
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) {			
	System.out.print("請輸入1-99正整數(-1結束)");
	Scanner keyin = new Scanner(System.in);
	int n = keyin.nextInt();
    int a=0, count=0, max=0, min=0;
	
    while(n<0){
    	n = keyin.nextInt();
		count++;
	}

	System.out.print(count);

	}
}
