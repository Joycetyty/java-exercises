//¸ê¤TB ³¢®a¬X 06156288
import java.util.Scanner;
public class A2_06156288 {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();


		double discriminant = Math.pow(b, 2) - 4 * a * c;

		System.out.print("The equation has ");
		if (discriminant > 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);


			System.out.print("The roots are");
			System.out.printf("%.6f",root1);
			System.out.print("and");
			System.out.printf("%.6f",root2);
			
		}
		else if (discriminant == 0)
		{
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.print("the one root is");
			System.out.printf("%.6f ",root1);
		}
		else
			System.out.println("The equation has no real roots");
	}
}
