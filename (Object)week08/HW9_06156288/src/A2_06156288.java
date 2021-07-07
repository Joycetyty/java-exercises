//資三B 郭家柔 06156288
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) throws FileNotFoundException  {
		FileReader file = new FileReader("D://2IN.txt");
		Scanner input = new Scanner(file);
		int count=0, pass=0, nopass=0;
		while(input.hasNext()) {
			String name = input.next();
			int a = input.nextInt();
			String d = input.next();
			String m = input.next();
			count++;
			
			Employee np = new Employee(name, a, d, m);
			
			if(np.getage()>=20 && np.getage()<=30) {
				if(np.getresult().equals("合格")){
					
						pass++;
						System.out.println(np.getname()+"  "+np.getresult());
						
					}else{
						nopass=count-pass;
			}
		}
	}
		System.out.printf("符合條件人數:%d\n", pass);
		System.out.printf("不符合條件人數:%d\n", nopass);
}
}

		
class Employee{
	private String name;
	private int age;
	private String degree;
	private String major;


Employee (String name, int age, String degree, String major){
	this.name = name;
	this.age = age;
	this.degree = degree;
	this.major = major;
}

public String getname() {
	return name;
}

public int getage() {
	return age;
}
public String getdegree() {
	return degree;
}

public String getmajor() {
	return major;
}
public String getresult() {
	int a=getage();
	String d=getdegree();
	String m=getmajor();
	
	if(a<=30 && a>=20) {
		if(d.equals("B") || d.equals("M")) {
			if(m.equals("CSIM")||m.equals("BA")) {
				return "合格";
			}
		}
	}
	return "不合格";
	
}
}