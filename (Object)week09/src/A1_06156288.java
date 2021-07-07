//資三B 06156288 郭家柔
import java.util.Scanner;
public class A1_06156288 {
	public static void main(String[] args) throws Exception {
		Scanner keyin = new Scanner(System.in);
		System.out.println("輸入:");
		String s=keyin.nextLine(); 
		String line[]=s.split(","); 
		
		double sum=0;
		int [] score = new int[10];
		for(int i=0; i<line.length; i++) {
			if(line[i].equals("A")) {
				System.out.print("90 ");
				score[i]=90;
				}else if(line[i].equals("B")) {
					System.out.print("85 ");
					score[i]=85;
				}else if(line[i].equals("C")) {
					System.out.print("80 ");
					score[i]=80;
				}else if(line[i].equals("D")) {
					System.out.print("70 ");
					score[i]=70;
				}else if(line[i].equals("E")) {
					System.out.print("60 ");
					score[i]=60;
				}else if(line[i].equals(" ")) {
					System.out.print("0 ");
					score[i]=0;
				}else if(line[i].equals("病假")) {
					System.out.print("60 ");
					score[i]=60;
				}else if(line[i].equals("事假")) {
					System.out.print("60 ");
					score[i]=60;
		}
				sum += score[i];
		}
		System.out.println();
		System.out.println("平均分數"+sum/line.length);
	}
		
	
}
