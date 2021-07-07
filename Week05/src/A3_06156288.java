//資三B 06156288 郭家柔
import java.util.Scanner;
public class A3_06156288 {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		   System.out.print("Enter the number of students: ");
		   
		   int numOfStudents = input.nextInt();
		   String bestStudentName = "";
		   
		   double bestStudentScore = 0.0;
		   for (int i = 0; i < numOfStudents; i++) {
			   System.out.print("Enter student name: ");
			   String name = input.next();
			   System.out.print("Enter score: ");			   
		       double score = input.nextDouble();
		       
		       if (score > bestStudentScore) {
		        bestStudentName = name;
		        bestStudentScore = score;
		      }	       
		    }		   
		    System.out.println(bestStudentName);
		  }
	}
