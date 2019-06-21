package exceptions;

import java.util.Scanner;

public class ArthArrayException {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the two numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<=2;i++)
		{
			arr[i]=sc.nextInt();
		}
		try
		{
			
			int t=n1/n2;
			}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try
		{
			arr[7]=23;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}
}
