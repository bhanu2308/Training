package formulas;

import java.io.DataInputStream;
import java.io.IOException;

public class SquarePerimeter {
	public static void main(String args[]) throws IOException
	{
	int side;
	float perimeter;
	System.out.println("Enter the side of the triangle");
	DataInputStream a=new DataInputStream(System.in);
	side=Integer.parseInt(a.readLine());
	perimeter=4*side;
	System.out.println("The perimeter of a square"+perimeter);
	
}


}
