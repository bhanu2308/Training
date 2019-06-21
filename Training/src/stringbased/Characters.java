package stringbased;

import java.util.Scanner;

public class Characters {
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		str=sc.nextLine();
		System.out.println("Consonants in a string'" + str +"' are:");
		consonants(str);
	}

	private static void consonants(String s) {
		int flag=0;
		for(int j=0;j<s.length();j++)
		{
			char ch=s.charAt(j);
			
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
			{
				flag=1;
				System.out.println(ch);
		
			}
		}
		if(flag==0)
		{
			System.out.println("No consonants  present in a string");
		}
		
	}

}
