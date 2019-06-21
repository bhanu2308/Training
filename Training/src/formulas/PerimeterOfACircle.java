package formulas;

import java.util.Scanner;

public class PerimeterOfACircle {
	public static void main(String args[])
	{
		double radius;
		double perimeter;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
		perimeter=2*(Math.PI*radius);
		System.out.println("The perimeter of the circle is" + perimeter);
	}


}
