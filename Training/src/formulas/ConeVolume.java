package formulas;

import java.util.Scanner;

public class ConeVolume {
	public static void main(String args[])
	{
		double radius,height;
		double volume;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
		System.out.println("Enter the height:");
		height=sc.nextDouble();
		volume=(Math.PI*radius*radius*height)/3;
		System.out.println("The volume of the cone is" + volume);
	}

}
