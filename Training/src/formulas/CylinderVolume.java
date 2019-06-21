package formulas;

import java.util.Scanner;

public class CylinderVolume {
	public static void main(String args[])
	{
		double radius,height;
		double volume;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
		System.out.println("Enter the height:");
		height=sc.nextDouble();
		volume=Math.PI*radius*radius*height;
		System.out.println("The volume of the cylinder is" + volume);
	}

}
