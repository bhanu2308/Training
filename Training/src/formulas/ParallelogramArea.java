package formulas;

import java.util.Scanner;

public class ParallelogramArea {
	public static void main(String args[]) 
    {   
       double height,breadth,area;
         Scanner s= new Scanner(System.in);
         System.out.println("Enter the height:");
          height= s.nextDouble();
        System.out.println("Enter the breadth:");
         breadth= s.nextDouble();
         area=height*breadth ;
      System.out.println("Area of Parallelogram is: " + area);      
   }

}
