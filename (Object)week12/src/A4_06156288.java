import java.util.Scanner;
import java.util.ArrayList;

public class A4_06156288 {
	/** Main method */
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 5 numbers for list1: ");
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}	

		System.out.print("Enter 5 numbers for list1: ");
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}
		
		ArrayList <Integer> list3 = union(list1, list2);
		System.out.print(list3);

	}

			
	
	public static ArrayList <Integer> union (ArrayList <Integer> list1, ArrayList <Integer> list2) {
		ArrayList<Integer> list3=list1;
		for(int i =0; i< list2.size();i++) {
			list3.add(list2.get(i));
		}

		return list3;
	}
}