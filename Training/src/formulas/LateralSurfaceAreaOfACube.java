package formulas;

import java.io.DataInputStream;
import java.io.IOException;

public class LateralSurfaceAreaOfACube {
	public static void main(String args[]) throws IOException
	{
		int side;
		DataInputStream aa=new DataInputStream(System.in);
		System.out.println("enter the side of a cube");
		side=Integer.parseInt(aa.readLine());
		int area=4*side*side;
		System.out.println("lateral surface area of a cube  :" + area);
	}

}
