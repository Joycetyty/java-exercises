//資三B 郭家柔 06156288
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class A3_06156288 {
	public static void main(String[] args) throws FileNotFoundException  {
		FileReader file = new FileReader("D://3IN.txt");
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			String name = input.next();
			int a = input.nextInt();
			double w = input.nextDouble();
			double h = input.nextDouble();
						
			BMI bmin = new BMI(name, a, w, h);
			
			if(bmin.getStatus().equals("Obese")) {
				System.out.println(name+" 過重");
			}
			else if(bmin.getStatus().equals("Underweight")) {
				System.out.println(name+" 過輕");
			}
		}
	}
}

