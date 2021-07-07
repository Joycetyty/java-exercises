//資三B 郭家柔 06156288
import java.util.Scanner;
public class A5_06156288 {
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("輸入第一個陣列的總數&內容: ");
        int size = input.nextInt();

        int[] list1 = new int[size];
        for (int i = 0; i < size; i++) list1[i] = input.nextInt(); 

        System.out.print("輸入第二個陣列的總數&內容: ");
        size = input.nextInt();

        int[] list2 = new int[size];
        for (int i = 0; i < size; i++) list2[i] = input.nextInt(); 

        
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }

    
    
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) return false;

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) return false;
        }
        return true;
    }
    
    
}
