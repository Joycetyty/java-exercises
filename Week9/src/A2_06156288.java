//資三B 郭家柔 06156288
import java.io.*;
import java.util.Scanner;
public class A2_06156288 {
	/** Main Method */
	public static void main(String[] args) throws Exception {
		 java.io.File file = new java.io.File("D:\\3in.TXT");
	    Scanner input = new Scanner(file);
		System.out.print("Enter scores: (negative number signifies end): ");
		
		int[] scores = new int[100];  
		int num;
		int numberOfScores=0, average=0;
		 while (input.hasNext() && numberOfScores<100){
			for (int i = 0; i < 100; i++) {
				num = input.nextInt();			
				if (num < 0)						// A negative number signifies end
					break;
				
				scores[i] = num;					// fill scores array
				average += num;					// Add scores to average
				numberOfScores++;					// Increment number of scores
			}
		    }
		 
		average /= numberOfScores;	

		int aboveOrEqual;						// Scores above or equal to average
		int below;								// Scores below average
		aboveOrEqual = below = 0;
		for (int i = 0; i < numberOfScores; i++) {
			if (scores[i] >= average)
				aboveOrEqual++;				// Increment aboveOrEqual
			else
				below++;							// Increment below
		}

		// Display results
		System.out.println("\nAverage of scores: " + average);
		System.out.println(
			"Number of scores above or equal to average: " + aboveOrEqual);
		System.out.println(
			"Number of scores below average: " + below);
	}
}