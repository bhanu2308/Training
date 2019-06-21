package formulas;

import java.util.Scanner;

public class SphereVolume {
	public static void main(String args[])
	{
		double radius;
		double volume;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
		
		volume=4*(Math.PI*radius*radius*radius)/3;
		System.out.println("The volume of the cone is" + volume);
	}

}
