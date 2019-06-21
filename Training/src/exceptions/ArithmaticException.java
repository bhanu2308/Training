package exceptions;

import java.util.Scanner;

public class ArithmaticException {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try
		{
			
			int t=n1/n2;
			System.out.println("Divison of two numbers is"+t);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
