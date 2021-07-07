//資三B 06156288 郭家柔
public class A1_06156288 {
    public static void main (String [] args){
         
        Rectangle Rectangle1 = new Rectangle (4,40);
        Rectangle Rectangle2 = new Rectangle (3.5 , 35.9);
         
        System.out.println( " The width of Rectangle1 is : 4");
        System.out.println( " The height of Rectangle1 is : 40");
        System.out.println( " The area of Rectangle 1 is : " + Rectangle1.getArea());
        System.out.println( " The perimeter of Rectangle1 is : " + Rectangle1.getPerimeter());
        System.out.println( " The width of Rectangle2 is : 3.5");
        System.out.println( " The height of Rectangle2 is : 35.9");
        System.out.println( " THe area of Rectangle2 is : " + Rectangle2.getArea());
        System.out.println( " The perimeter of Rectangle2 is : " + Rectangle2.getPerimeter());
    }
}
