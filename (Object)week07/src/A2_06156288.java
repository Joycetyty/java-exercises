//資三B 郭家柔 06156288
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) throws FileNotFoundException{
		FileReader file = new FileReader("C://2IN.txt");
		Scanner input = new Scanner(file);
		int count=0;
		while(input.hasNext()) {
			String name = input.next();
			int i = input.nextInt();
			int t = input.nextInt();
			int f = input.nextInt();
			
			Scores x = new Scores(name, i, t, f);
			System.out.println(x.getname()+" "+x.comput_score());
		}
	}
}

class Scores{
	private String name;
	private int teamwork;
	private int intelligent;
	private int fight;


Scores (String name, int intelligent, int teamwork, int fight){
	this.name = name;
	this.teamwork = teamwork;
	this.intelligent = intelligent;
	this.fight = fight;
}

public String getname() {
	return name;
}

public double comput_score() {
	return (teamwork*.4+intelligent*.4+fight*.2);
}
}