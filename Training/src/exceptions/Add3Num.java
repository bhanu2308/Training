package exceptions;

import java.util.Scanner;

public class Add3Num {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int total=n1+n2+n3;
		try
		{
			if(total>100)
			{
				System.out.println("the sum of three numbers is"+total);
			}
			else
			{
				throw new Exception(" 'Please enter the numbers, which totla is below 100'.");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
