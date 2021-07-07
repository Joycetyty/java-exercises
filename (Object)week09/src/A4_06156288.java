//資三B 06156288 郭家柔
import java.io.*;
import java.util.Scanner;
public class A4_06156288 {

	public static void main(String[] args) throws Exception{
		 java.io.File file = new java.io.File("D:\\3in.TXT");
		 
		Scanner keyin = new Scanner(System.in);		 
	    Scanner input = new Scanner(file);
	    BMI bmiArray[]= new BMI[20];
	    int count=0;
	
	    while (input.hasNext() && count<20){
	    	String name = input.next();
	    	int age = input.nextInt();
	    	double weight = input.nextDouble();
	    	double height = input.nextDouble();
	    	bmiArray[count++] = new BMI(name, age, weight, height);
	    }
	    
	    double sum=0, avg=0;
	    for(int i=0; i< count;i++) {
	    	sum += bmiArray[i].getBMI();
	    	avg=sum/count;
	    }
	    System.out.printf("平均BMI:%.2f\n",avg);
	    
	    double sumage=0, avgage=0;
	    for(int i=0; i< count;i++) {
	    	sumage += bmiArray[i].getAge();
	    	avgage=sumage/count;
	    }
	    System.out.printf("平均年齡:%.2f\n",avgage);
	    
	    double osum=0, ocount=0;
	    for(int i=0; i<count;i++) {
	    	if(bmiArray[i].getStatus().equals("Obese")){
		    	osum += bmiArray[i].getAge();
		    	ocount++;
	    	}	    	
	    }
	    System.out.printf("過重者平均年齡:%.2f\n",osum/ocount);
	    
	    
	   System.out.println("請輸入一年齡:");
	    int a = keyin.nextInt();
	    double nsum=0, ncount=0;
	    for(int i=0; i<count;i++) {
	    	if(bmiArray[i].getAge() == a) {
		    	nsum += bmiArray[i].getBMI();
		    	ncount++;
	    	}	    	
	    }	    
	    System.out.println(a+"歲的平均BMI為:"+nsum/ncount);
	    input.close();
	  }
	}