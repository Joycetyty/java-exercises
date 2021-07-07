//資三B 郭家柔 06156288
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
public class A1_06156288 {
	 public static void main(String[] args) throws FileNotFoundException {
		 FileReader file = new FileReader("D:\\1IN.txt");
		  Scanner filein = new Scanner(file);
		  File fileOut = new File("D:\\1OUT.txt");
		  PrintWriter ps = new PrintWriter(fileOut);

		      while (filein.hasNext()) {
		          String name = filein.next();
				  int s = filein.nextInt();
				  
				  Stu a = new Stu(name, s);
				  if(s<60) {
					  ps.println(a.getname()+" "+a.fail());
				  }		         		         
		        }
		  filein.close();
		  ps.close();
		}
	 }


class Stu{
	private String name;
	private int score;
	
	Stu(String name, int score){
		this.name=name;
		this.score=score;
	}
	
	public String getname() {
		return name;
	}
	
	public int fail(){
		int nopass=0;
		if (score<60)
			nopass=score;
		return nopass;
	}
}
