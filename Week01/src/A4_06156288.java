//¸ê¤TB ³¢®a¬X 06156288
import java.util.Scanner;
import java.util.Random;
public class A4_06156288 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

        Random random = new Random();
        int coin_flip = random.nextInt(2);

        System.out.print("Guess head or tail? Enter 0 for head and 1 for tail:");
        int guess = in.nextInt();

        if(guess == coin_flip){
            System.out.println("Correct guess");
        }else{
            System.out.println("Sorry, incorrect.");
        }
    }
}

