package formulas;

import java.util.Scanner;

public class Fibonocci {
	public static void main(String args[])
	{
		int i=0,j=1,nextTerm,n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms:");
		n=sc.nextInt();
		System.out.println("Fibonacci series is ");
		for(c=0;c<n;c++)
		{
		if(c<=1)
		nextTerm=c;
		else
		{
		nextTerm=i+j;
		i=j;
		j=nextTerm;
		}
		System.out.println(nextTerm+" ");
		}
		
	}

}
