package stringbased;

import java.util.Scanner;

public class StringArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		char chararray[]=str.toCharArray();
		for(int i=0;i<chararray.length;i++)
		{
			for(int j=i+1;j<chararray.length;j++)
			{
				if(chararray[j]<chararray[i])
			
				{
					char temp=chararray[i];
					 chararray[i]=chararray[j];
					 chararray[j]=temp;
					
				}
			}
		}
		
		System.out.println("sorted string:"+String.valueOf(chararray));
	}


}
