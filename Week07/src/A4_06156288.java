//資三B 郭家柔 06156288
import java.io.*;
import java.util.Scanner;
public class A4_06156288 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("D://1IN.txt");
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			float side1 = input.nextFloat();
			float side2 = input.nextFloat();
			float side3 = input.nextFloat();
			
			boolean result=isValid(side1, side2, side3);
			
			if(result) {
				System.out.printf("%.1f %.1f %.1f\n",side1 ,side2 ,side3);
				System.out.printf("The area of the triangle is %.4f \n", area(side1, side2, side3));
			}else {
				System.out.printf("%.1f %.1f %.1f\n",side1 ,side2 ,side3);
				System.out.println("Input is invalid");

			}


	}
 }
	public static boolean isValid(
			double side1, double side2, double side3) {
			boolean valid =
				side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
				
			return valid;
		}

		public static double area(
			double side1, double side2, double side3) {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}
	}