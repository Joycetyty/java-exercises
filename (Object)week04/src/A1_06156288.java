//資三B 郭家柔 06156288
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("輸入幾個數：");
		int numOfSort = in.nextInt();
		int[] num = new int[numOfSort];
		
		System.out.print("輸入值：");
		 num[0] = in.nextInt();
		 num[1] = in.nextInt();
		 num[2] = in.nextInt();
		 num[3] = in.nextInt();
		 num[4] = in.nextInt();
		 num[5] = in.nextInt();
		 
	        sort(num); 
	        System.out.println("由小到大排列後："); 
	        printArray(num); 
	}
	
	
    public static void sort(int num[]) 
    { 
        int n = num.length; 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (num[j] < num[min_idx]) 
                    min_idx = j; 
  
            int temp = num[min_idx]; 
            num[min_idx] = num[i]; 
            num[i] = temp; 
        } 
    } 
    
    
    public static void printArray(int num[]) 
    { 
        int n = num.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(num[i]+" "); 
        System.out.println(); 
    } 

}
