package formulas;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class RectanglePerimeter {
	int breadth;
	int length;
	public void Perimeter() throws IOException
	{
		System.out.println("enter the breadth");
		Scanner aa=new Scanner(System.in);
		breadth =aa.nextInt();
		System.out.println("enter the length");
		length =aa.nextInt();
	}
	public void calc()
	{
		int perimeter=2*(breadth+length);
		System.out.println("The Perimeter   of the rectangle is"+ perimeter);
		
	}
	public static void main(String args[]) throws IOException
	{
		RectanglePerimeter tri=new RectanglePerimeter();
		tri.Perimeter ();
		tri.calc();
	}



}
