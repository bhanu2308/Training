package formulas;

import java.util.Scanner;

public class Average {
	public static void main(String args[])
	{
 
	int n;
	double res=0;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter numbers to calculate average: ");	
               
	n=sc.nextInt();
    int a[]=new int[n];
        System.out.println(" enter "+ n + "numbers");	
        for(int i=0;i<n;i++)
     	   a[i]=sc.nextInt();
      
            for(int i=0;i<n;i++)
     	   res =res+a[i];       
	
	System.out.println("average of"+ n + "numbers"+res);
 
	}
}
