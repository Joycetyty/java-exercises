//資三B 郭家柔 06156288
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class A1_06156288 {
 public static void main(String[] args) throws FileNotFoundException {
  
  double[] num = new double[100];
  FileReader file = new FileReader("C://3IN.txt");
  Scanner input = new Scanner(file);
  
  int count=0;
  while(input.hasNext()) {
   num[count] = input.nextDouble();
   count++;
  } //把count的數放到num
  
  double[] a = new double[count];
  for(int i=0; i<count; i++)
   a[i]=num[i]; //把num的數放到新陣列a    
  
  System.out.printf("The standard deviation is:%5.2f\n", deviation(a)); //用新陣列a代入變數 平均個數才不會錯
  System.out.printf("The mean is:%5.2f\n",mean(a));
 }



public static double deviation(double[] x) {
 double mean = mean(x);
 double deviation=0;
 
 for(int i=0; i<x.length; i++) {
  deviation += Math.pow(x[i]-mean,2);
 }
 return Math.sqrt(deviation/(x.length-1));
}



public static double mean(double[] x) {
 double total=0;
 
 for(int i =0; i<x.length; i++) {
  total= total + x[i];
 }
 return total/x.length;
 }
}