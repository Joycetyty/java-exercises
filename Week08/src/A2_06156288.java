//資三B 郭家柔 06156288
public class A2_06156288 {
    public static void main(String[] args){
        System.out.println("First 100 pentagonal numbers:");
        for (int i = 1; i < 101; i++){
            System.out.printf("%5d ", getPentagonalNumber(i));
            if (i % 10 == 0)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int n){
        return (n * (3 * n - 1)) / 2;
    }	
}
