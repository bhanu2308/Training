package formulas;

import java.io.DataInputStream;
import java.io.IOException;

public class EquilateralArea {
	public static void main(String args[]) throws IOException
	{
		int side;
		float area;
		System.out.println("Enter the side of the triangle");
		DataInputStream a=new DataInputStream(System.in);
		side=a.readInt();
		area=(3*side*side)/4;
		System.out.println("The area of the equilateral triangle is"+area);
		
	}

}
