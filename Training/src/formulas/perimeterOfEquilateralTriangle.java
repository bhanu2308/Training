package formulas;

import java.io.DataInputStream;
import java.io.IOException;

public class perimeterOfEquilateralTriangle {
	public static void main(String args[]) throws IOException
	{
	int side;
	float perimeter;
	System.out.println("Enter the side of the triangle");
	DataInputStream a=new DataInputStream(System.in);
	side=Integer.parseInt(a.readLine());
	perimeter=3*side;
	System.out.println("The perimeter of the equilateral triangle is"+perimeter);
	}
}



