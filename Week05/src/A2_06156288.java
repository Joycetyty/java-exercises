//資三B 06156288 郭家柔
public class A2_06156288 {
	public static void main(String[] args) {

		System.out.println("Celsius   Fahrenheit");

		for (int i = 0; i <= 100; i +=2) {
			System.out.printf(
				"%-15d%3.1f\n", i, (i * 1.8 + 32));  
		}  
	}
}