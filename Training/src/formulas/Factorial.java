package formulas;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		int fact=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact *=i;
		}
		System.out.println("factorial of a given number is"+fact);
		
	}

}
