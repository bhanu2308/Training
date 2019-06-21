package formulas;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String args[])
	{
		double radius;
		double area;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
		area=(Math.PI*radius*radius);
		System.out.println("The area of the circle is" + area);
	}

}
