import java.util.ArrayList;
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Enter a sequence of numbers ending with 0 ");
		int num = input.nextInt();
		
		while(num!=0) {
			list.add(num);
			num = input.nextInt();
		}
		System.out.print("Max input is:" + max(list));

	}
	
	
	
	public static Integer max(ArrayList<Integer> list) {
		if(list.size()==0) 
			return null;
		
		Integer max = list.get(0);
		for(int i=0; i<list.size();i++) {
			if(list.get(i)>max)
				max=list.get(i);
		}
		
		return max;
	}

}
