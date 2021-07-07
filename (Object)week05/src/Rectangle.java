//資三B 06156288 郭家柔
public class Rectangle {
	 double  width ;
	 double height ;
	   
	  public Rectangle(){
	      width = 1;
	      height = 1;
	  }
	
	  public Rectangle(double newWidth, double newHeight){
	      width = newWidth;
	      height = newHeight;
	  }

	  
	 public double getArea(){
	     return width * height;
	 }

	 
	public double getPerimeter(){
	     return 2 *(width + height);
	 }


	 public void setNew(double newWidth, double newHeight){
	      width = newWidth;
	      height = newHeight;
	 }	  	
}
