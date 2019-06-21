package formulas;

import java.util.Scanner;

public class DistanceBwTwoPoints {
	 public static void main(String args[])
	   {
	     double dist;
	     int x1,x2,y1,y2;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter x1 point");
	     x1=sc.nextInt();
	     System.out.println("enter y1 point");
	     y1=sc.nextInt();
	     System.out.println("enter x2 point");
	     x2=sc.nextInt();
	     System.out.println("enter y2 point");
	     y2=sc.nextInt();
	     dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));     
	     System.out.println("The distance between two pointsis"+dist);
	     
	   }
}
