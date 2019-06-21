package exceptions;

import java.util.Scanner;

public class NameLength {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		try
		{
			if(name.length()>15)
			{
				throw new Exception(" 'Please enter shorter name'.");
			}
			else
			{
				System.out.println("You entered name is" + name);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
