package exceptions;

import java.util.Scanner;

public class Age {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		try
		{
			if(age>=18)
			{
				System.out.println("age is  greater than 18");
			}
			else
			{
				throw new Exception(" 'Access denied - You must be at\r\n" + 
						"least 18 years old.' ");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
