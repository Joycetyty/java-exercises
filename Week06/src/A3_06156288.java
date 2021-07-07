//資三B 郭家柔 06156288
import java.io.*;
import java.util.Scanner;
public class A3_06156288 {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("D://3IN.txt");
		Scanner input = new Scanner(file);
		
		File fileOut = new File("D:\\3OUT.txt");
		PrintWriter ps = new PrintWriter(fileOut);
		  
		int count=0;
		while(input.hasNext()) {
			String s = input.nextLine();
			
			if(s.matches("\\d{3}-\\d{2}-\\d{4}")) {
				ps.println(s);
			}else{
				System.out.println(s);				
			}		
	}
		ps.close();
  }
}
