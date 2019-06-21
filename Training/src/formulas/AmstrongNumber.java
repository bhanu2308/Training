package formulas;

import java.io.DataInputStream;
import java.io.IOException;

public class AmstrongNumber {
	public static void main(String args[]) throws IOException
	{
		int num,number,rem,res=0;
		DataInputStream aa=new DataInputStream(System.in);
		System.out.println("enter a number:");
		num=Integer.parseInt(aa.readLine());
		number=num;
		while(number!=0)
		{
			rem=number%10;
			res+=rem*rem*rem;
			number/=10;
		}
		if(res==num)
			System.out.println(num + "is an amstrong number");
		else
			System.out.println(num + "is not an amstrong number");
	}

}
