package formulas;

import java.util.Scanner;

public class prismvolume {
	public static void main(String args[])
	{
		double base,height,prismheight;
		double area,volume;
		System.out.println("Enter the base:");
		Scanner sc=new Scanner(System.in);
		base=sc.nextDouble();
		System.out.println("Enter the height:");
		height=sc.nextDouble();
		System.out.println("Enter the height of the prism:");
		prismheight=sc.nextDouble();
		area=(base*height)/2;
		System.out.println("areaof the base :"+area);
		volume=area*prismheight;
		System.out.println("The volume of the prism is" + volume);
	}

}
