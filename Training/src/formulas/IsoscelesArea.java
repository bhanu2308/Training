package formulas;

import java.io.DataInputStream;
import java.io.IOException;

public class IsoscelesArea {
	public static void main(String args[])throws IOException
	{
		double side1,side2,area;
		DataInputStream aa=new DataInputStream(System.in);
		System.out.println("enter the side1 of a triangle");
		side1=Double.parseDouble(aa.readLine());
		System.out.println("enter the side2 of a triangle");
		side2=Double.parseDouble(aa.readLine());
		 area=(side2)* Math.sqrt((4*side1*side1)-(side2*side2))/4;
		 System.out.println("area of the isoscles triangle is:"+area);
	}

}
