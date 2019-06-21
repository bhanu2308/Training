package formulas;

import java.io.DataInputStream;
import java.io.IOException;

public class RhombusPerimeter {
	public static void main(String args[]) throws IOException
	{
		int side;
		DataInputStream aa=new DataInputStream(System.in);
		System.out.println("enter the side of a rhombus");
		side=Integer.parseInt(aa.readLine());
		int area=4*side;
		System.out.println("area of the rhombus :" + area);
	}

}
