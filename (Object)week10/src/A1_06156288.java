//資三B 06156288 郭家柔
import java.io.*;
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\4IN.txt");
		Scanner filein = new Scanner(file);		
		 int sum=0;
	
	    while (filein.hasNext()){
	    	String s=filein.nextLine(); 
			String line[]=s.split("\\s+"); 
			
			String  name= line[0];
			String  s1= line[1];
			String  s2= line[2];
			
		    sum = Integer.parseInt(s1)+Integer.parseInt(s2);
			System.out.println(name+" "+s1+" "+s2+" "+sum);
			    	    
	    }
	    filein.close();
	}
}
