//資三B 郭家柔 06156288
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) {
		String bin;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary value(0000 to 1111): ");
		bin = input.nextLine();
		
		int dec = Integer.parseInt(bin,2);//將二進位數字轉成十進位
		
		if(dec>0 && dec<=15){

			 System.out.println("The decimal value is:"+dec);
		}
	}
}
