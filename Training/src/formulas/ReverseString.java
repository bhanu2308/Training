package formulas;

import java.util.Scanner;

public class ReverseString 
{
		public static void main(String args[])
		{
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str=scan.nextLine();	
		System.out.println("Reverse of a String '"+str+"' is  :"); 
		int i=str.length();
		while(i>0)
		{
		System.out.print(str.charAt(i-1)); 
		i--;
		}
	        }
	
}


