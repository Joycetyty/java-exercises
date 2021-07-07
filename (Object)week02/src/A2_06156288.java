//資三B 郭家柔 06156288

import java.util.Scanner;
public class A2_06156288 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = in.nextInt();
        int[] scores = new int[4];

        System.out.print("Enter " + numOfStudents + " scores: ");
        scores[0] = in.nextInt();
        scores[1] = in.nextInt();
        scores[2] = in.nextInt();
        scores[3] = in.nextInt();

        displaygrades(scores);
    }

    public static void displaygrades(int[] grades) {
        int highscore = bestgrade(grades);
        
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n",
                i, grades[i], assignLetterGrade(grades[i], highscore));
        }
    }

    public static char assignLetterGrade(int grade, int highscore) {

        if (highscore - grade <= 10)
            return 'A';
        else if (highscore - grade > 10 && highscore - grade <= 20)
            return 'B';
        else if (highscore - grade > 20 && highscore - grade <= 30)
            return 'C';
        else if (highscore - grade > 30 && highscore - grade <= 20)
            return 'D';
        else 
            return 'F';
    }

    public static int bestgrade(int[] grades) {
        int highscore = grades[0];
        for (int grade : grades) {
            if (grade > highscore)
                highscore = grade;
        }
        return highscore;
    }
}