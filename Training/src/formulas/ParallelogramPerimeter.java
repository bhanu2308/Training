package formulas;
import java.lang.*;
public class ParallelogramPerimeter {
	 public static void main(String args[]) throws ArrayIndexOutOfBoundsException
	    {   
	       
	          double h= Double.parseDouble(args[0]);
	 
	          double b= Double.parseDouble(args[1]);
	               
		  double  perimeter=2*(h+b);
	     
		  System.out.println("perimeter of Parallelogram is: " + perimeter);      
	   }

}
