//資三B 郭家柔 06156288
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
public class A2_06156288 {
	 public static void main(String[] args) throws FileNotFoundException {
		 FileReader file = new FileReader("C:\\3IN.txt");
		  Scanner filein = new Scanner(file);
		  File fileOut = new File("C:\\3OUT.txt");
		  PrintWriter ps = new PrintWriter(fileOut);

   		      int count=0, sum=0;
   		      double avg=0.0;
		      while (filein.hasNext()) {
		          String name = filein.next();
				  int s = filein.nextInt();
				  
				  count++;			
				  sum += s;				  
				  avg = sum/count;	
				  ps.println(avg);
				  
				  if(s<avg) {
					  double under= avg - s;
					  ps.println(name+" "+ under);
				  }	
		      }	         		         
		  filein.close();
		  ps.close();
		}
	 }
