//資三B 郭家柔 06156288
import java.util.Scanner;
public class A1_06156288{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int[] n = new int[10];

        for (int i = 0; i < 10; i++) n[i] = input.nextInt();
   
        for (int i = n.length - 1; i >= 0; i--) System.out.print(n[i] + " ");
    }
}