package formulas;

import java.util.Scanner;

public class RhombusArea {
	public static void main(String args[]) 
    {   
       double diagonal1,diagonal2,area;
         Scanner s= new Scanner(System.in);
         System.out.println("Enter the length of the diagonal1:");
          diagonal1= s.nextDouble();
        System.out.println("Enter the length of the diagonal2:");
         diagonal2= s.nextDouble();
         area=(diagonal1*diagonal2)/2 ;
      System.out.println("Area of Rhombus is: " + area);      
   }

}
