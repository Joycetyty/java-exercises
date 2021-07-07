// 資三B 郭家柔 06156288
public class A4_06156288 {

	    static final int SIZE = 100;
	    public static void main(String[] args) {
	    	
	        int[] randomnumbers = new int[SIZE];
	        int[] counts = new int[10];
	        // generate random numbers 0-9
	        for (int i = 0; i < randomnumbers.length; i++) {
	            int num = (int)(Math.random() * 10);
	            randomnumbers[i] = num;
	            counts[num]++;
	        }

	        for (int i = 0; i < randomnumbers.length; i++) {

	            System.out.print(randomnumbers[i] + " ");
	            if ((i + 1) % 10 == 0) System.out.println("");
	        }
	        for (int i = 0; i < counts.length; i++) {
	            System.out.println("Count for "+ i + " is " + counts[i]);
	        }
	    }

	    public static void printArray(int[] array, int numberPerLine) {	    		  

	        for (int i = 0; i < array.length; i++) {

	            System.out.printf("%4d", array[i]);
	            if ((i + 1) % numberPerLine == 0) System.out.println("");
	        }
	    }
}
	