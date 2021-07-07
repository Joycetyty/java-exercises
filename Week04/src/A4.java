//資三B 郭家柔 06156288
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
         
         System.out.print("Enter string s1: ");
         String s1 = input.nextLine();
         
         System.out.print("Enter string s2: ");
         String s2 = input.nextLine();
         
         if (s1.indexOf(s2) != -1) {
             System.out.printf("%s is a substring of %s%n", s2, s1);
         }else{
             System.out.printf("%s is not a substring of %s%n", s2, s1);
         }
    }
}
 
