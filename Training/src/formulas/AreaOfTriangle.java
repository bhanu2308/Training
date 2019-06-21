package formulas;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class AreaOfTriangle {
	int breadth;
	int height;
	public void area() throws IOException
	{
		System.out.println("enter the breadth");
		Scanner aa=new Scanner(System.in);
		breadth =aa.nextInt();
		System.out.println("enter the height");
		height =aa.nextInt();
	}
	public void calc()
	{
		int area=(breadth*height)/2;
		System.out.println("The area of the triangle is"+area);
		
	}
	public static void main(String args[]) throws IOException
	{
		AreaOfTriangle tri=new AreaOfTriangle();
		tri.area();
		tri.calc();
	}

}
