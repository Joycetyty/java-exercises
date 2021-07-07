import java.util.ArrayList;
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Enter 5 numbers:");
		
		
		for(int i =0; i<5; i++) {
			list.add(input.nextInt());
		}		
		sort(list);
		System.out.println(list);
	}
	
	
	
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);
	}

}
