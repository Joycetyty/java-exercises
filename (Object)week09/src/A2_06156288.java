//��TB 06156288 ���a�X
import java.io.*;
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) throws Exception {
		File file = new File("D://TestScores.csv");
		Scanner filein = new Scanner(file);
		

		 filein.nextLine();
		 double sum=0;
		 int count=0;
	
	    while (filein.hasNext()){
	    	String s=filein.nextLine(); //Ū�����r�ꤺ�e
			String line[]=s.split(","); //�H,���Φr��
			
			String  number= line[0].trim();
			String  name= line[1].trim();
			String  s1= line[2].trim();
			String  s2= line[3].trim();
			String  s3= line[4].trim();
			String  s4= line[5].trim();
			String  s5= line[6].trim();
			String  mid= line[7].trim();
			String  fin= line[8].trim().replace("�ʦ�", "0");		
			count++;
			
			System.out.print(number+" "+name+" "+fin+"\n");
		     sum += Integer.parseInt(fin);		     		     
	    }
	    System.out.printf("%.2f",sum/count);    
	}
}