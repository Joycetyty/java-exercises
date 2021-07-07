//資三B 郭家柔 06156288

import java.util.Scanner;
public class A3_06156288 {
	
	static final int MAX = 100;
	public static void main(String[] args) {
		
		int[] scores = new int[MAX];
	    int numofscores = 0;
		Scanner input = new Scanner(System.in);
		
		  System.out.print("Enter an unspecified numbers : ");
		  
	        for (int i = 0; i < MAX; i++) {
	            int num = input.nextInt();
	      
	            if (num < 0)  
	            	break;

	            scores[i] = num;
	            numofscores++;
	        }
	        
	        scores[numofscores] = -1; 
	        int average = getAverage(scores, numofscores);
	        int aboveAE= scoresAboveandEqualtoaverage(scores, average);

	        System.out.println("Average score is: " + average);
	        System.out.println("Above or equal to the average = " + aboveAE);
	        System.out.println("Below to the average = " + (numofscores - aboveAE));

	    }

	    public static int getAverage(int[] scores, int numofscores) {
	        int total = 0;
	        for (int i = 0; scores[i] >= 0; i++) {
	            total += scores[i];
	        }
	        return total / numofscores;
	    }

	    public static int scoresAboveandEqualtoaverage(int[] scores, int average) {
	        int count = 0;
	        for (int i = 0; scores[i] >= 0; i++) {

	            if (scores[i] >= average) count++;
	        }
	        return count;
	}
}
