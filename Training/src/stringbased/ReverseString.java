package stringbased;

import java.util.Scanner;

public class ReverseString {
	private static Scanner sc;

	public static void main(String args[])
	{
		String str,rev;
		sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.nextLine();
		rev=reverse(str);
		System.out.println("Reverse of a string:"+rev);
	}

	private static String reverse(String s) {
		String rev="";
		for(int j=s.length();j>0;j--)
		{
			rev=rev+(s.charAt(j-1));
		}
		return rev;
	}

}
