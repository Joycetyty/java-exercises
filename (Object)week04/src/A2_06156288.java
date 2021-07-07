//資三B 郭家柔 06156288
import java.util.Scanner;
public class A2_06156288 {

    static final int SIZE = 10;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] numbers = new double[SIZE];
        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = in.nextDouble();

        System.out.println("The mean is: " + mean(numbers));
        System.out.printf("The standard deviation is: " + deviation(numbers));

    }

    public static double deviation(double[] x) {

        double mean = mean(x);
        double deviation = 0;
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
    
    
    public static double mean(double[] x) {

        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total / x.length;
    }

}