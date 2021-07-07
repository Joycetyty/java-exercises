//資三B 06156288 郭家柔
import java.io.*;
import java.util.Scanner;
public class A3_06156288 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://TestScores.csv");
		Scanner filein = new Scanner(file);
		
		 File fileOut = new File("D:\\1OUT.txt");
		 PrintWriter ps = new PrintWriter(fileOut);
		 filein.nextLine();
		 double sum=0.0, scoresum=0.0, scoreavg=0.0;
		 int count=0;
	
	    while (filein.hasNext()){
	    	String s=filein.nextLine(); //讀取的字串內容
			String line[]=s.split(","); //以,分割字串
			
			String  number= line[0].trim();
			String  name= line[1].trim();
			String  s1= line[2].trim();
			String  s2= line[3].trim();
			String  s3= line[4].trim();
			String  s4= line[5].trim();
			String  s5= line[6].trim();
			String  mid= line[7].trim();
			String  fin= line[8].trim().replace("缺考", "0");		
			count++;
			scoresum = score(s1)+score(s2)+score(s3)+score(s4)+score(s5);
			scoreavg = scoresum/5;
			
			ps.print(number +" "+ name +" "+ scoreavg+" "+ mid +" "+ fin + "\n" );
		    sum += Integer.parseInt(fin);		     		     
	    }
         ps.close();
	}

public static double score(String n) {
	int score=0;
		if(n.equals("A")) {
			score=90;
			}else if(n.equals("B")) {
				score=85;
			}else if(n.equals("C")) {
				score=80;
			}else if(n.equals("D")) {
				score=70;
			}else if(n.equals("E")) {
				score=60;
			}else if(n.equals("缺考")) {
				score=0;
			}
	return score;
}


}
