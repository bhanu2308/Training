package exceptions;

import java.util.Scanner;


public class Name {
	public static void main(String args[])
	{
		String arr[]=new String[20];
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter no of strings");
	  int n=sc.nextInt();
	  System.out.println("The Strings are:");
	  for(int i=0;i<=n;i++)
	  {
		arr[i]=sc.nextLine(); 
	  }
	  System.out.println("Enter the string you want to check:");
	  String name=sc.nextLine();
	  boolean contains = false;
	  for(int j=1;j<=n;j++)
	  {
		
		  if(arr[j].equals(name))
		  {
			   contains = true;
			   break;
		  }
	  }
	  try
	 {
		  if(contains)
		  {
	 
			  System.out.println("the name is present in the array of strings");
		  }
		  else
		  {
			  throw new Exception(" 'You are not Enrolled for the\r\n" + 
			  		"class'.");
		  }
		 }
	 
	    catch(Exception e)
	  {
		  System.out.println(e);
	  }
	 }
	}


