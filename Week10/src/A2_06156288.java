//��TB 06156288 ���a�X
import java.util.Scanner;
public class A2_06156288 {
	public static void main(String[] args) {			
	System.out.print("�п�J1-99�����(-1����)");
	Scanner keyin = new Scanner(System.in);
	int n = keyin.nextInt();
    int a=0, count=0, max=0, min=0;
	
    while(n<0){
    	n = keyin.nextInt();
		count++;
	}

	System.out.print(count);

	}
}
