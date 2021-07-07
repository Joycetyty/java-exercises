//資三B 郭家柔 06156288
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int month, day, year;
		 
		 System.out.print("Enter the month in numeric form:");
		 month = input.nextInt();
		 System.out.print("Enter the day of the month:");
		 day = input.nextInt();
		 System.out.print("Enter the year in two digit format: ");
		 year = input.nextInt();
	
		 System.out.println("The date is: "+month+"/"+day+"/"+year);
		 
		 if((month * day) == year)
			 System.out.println("This is a magic date!");
		else
			System.out.println("This is not a magic date.");
    }
}