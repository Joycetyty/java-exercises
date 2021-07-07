//資三B 郭家柔 06156288
import java.util.Scanner;
public class A3_06156288 {
	
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        double[] vals = new double[10];
        System.out.print("輸入10型態為Double的數字: ");

        for (int i = 0; i < 10; i++) 
            vals[i] = in.nextDouble();
    
        System.out.printf("The average is: %.2f", average(vals));

    }

    public static int average(int[] array) {
        int sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array) 
            sum += val;
        return sum / array.length;
    }
}
