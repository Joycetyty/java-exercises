//資三B 郭家柔 06156288
import java.util.Scanner;
public class A2_06156288 {
	 public static void main(String[] args)
	 {
		 Scanner input = new Scanner(System.in);
		 int NumOfBooks;
		 int Points;
		 
		 System.out.println("Please enter the number of books purchased for the month:");
		 NumOfBooks = input.nextInt();
		 
		 if(NumOfBooks < 0) { 
			 System.out.println("Please enter a valid value:");
		 }
			 else {
			 switch(NumOfBooks) {
			 case 0:
				 Points = 0;
				 break;
			 case 1:
				 Points = 5;
				 break;
			 case 2:
				 Points = 15;
				 break;
			 case 3:
				 Points = 30;
				 break;
			 default:
				 Points = 60;
				 break;			
			    }
		System.out.println("You were awarded "+Points+" points.");
			}
	 }
	 
}
	 
