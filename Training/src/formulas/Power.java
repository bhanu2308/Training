package formulas;

import java.util.Scanner;

public class Power {
	 static long calpower(long n1,long p1)
     { 
         long r1=1; 
	 if(n1>=0&&p1==0)
	     r1=1;
	 else if(n1==0&&p1>=0)
	   r1=0;
	 else
	   for(int i=0;i<=p1;p1++)
		r1=r1*n1;
	return r1; 
     }

   public static void main(String args[])
   {
     long n,p,r=1;
   Scanner sc=new Scanner(System.in);
     System.out.println("enter number:");
     n=sc.nextLong();
     System.out.println("enter power:");
     p=sc.nextLong();
     Power pow=new Power();
     r= pow.calpower(n,p);
	System.out.println("thw power of a given number is"+r);
     
   }
}
