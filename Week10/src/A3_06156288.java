//��TB 06156288 ���a�X
import java.util.Scanner;
public class A3_06156288 {
	public static void main(String[] args) {
		System.out.print("�п�J���n:");
		Scanner keyin = new Scanner(System.in);
		int a = keyin.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=(a+1)-i; j++)
				System.out.print("* ");
			System.out.println();
		}
			
	}
}
