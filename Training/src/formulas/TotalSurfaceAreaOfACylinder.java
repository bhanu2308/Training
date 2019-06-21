package formulas;

import java.io.DataInputStream;
import java.io.IOException;

public class TotalSurfaceAreaOfACylinder {
	public static void main(String args[]) throws IOException
	{
		float radius,height,area;
		DataInputStream aa=new DataInputStream(System.in);
		System.out.println("enter the radius of a cylinder");
		radius=Integer.parseInt(aa.readLine());
		System.out.println("enter the height of a cylinder");
		height=Integer.parseInt(aa.readLine());
		area=(float) ((2*(Math.PI*radius))*(radius+height));
		System.out.println("Total surface area of a cylinder:"+area);
	}

}
