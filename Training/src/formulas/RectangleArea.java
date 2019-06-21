package formulas;

import java.io.IOException;
import java.util.Scanner;

public class RectangleArea {
	int breadth;
	int length;
	public void area() throws IOException
	{
		System.out.println("enter the breadth");
		Scanner aa=new Scanner(System.in);
		breadth =aa.nextInt();
		System.out.println("enter the length");
		length =aa.nextInt();
	}
	public void calc()
	{
		int area=(breadth*length);
		System.out.println("The area of the rectangle is"+area);
		
	}
	public static void main(String args[]) throws IOException
	{
		RectangleArea tri=new RectangleArea();
		tri.area();
		tri.calc();
	}

}
