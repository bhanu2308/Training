package examples;




import java.io.*;
import java.util.*;
public class StrongNumber
{
   public static void main(String args[])
   {
       int num,t,rem,fact,sum=0,i;
       System.out.println("enter a number:");
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       t=num;
       while(num>0)
       {
          rem=num%10;
	  fact=1;
          for(i=1;i<=rem;i++)
          {
		fact=fact*i;
          }
	  sum+=fact;
	  num=num/10;
          
       }

       if(sum==t)
       {
          System.out.println(t + "is a strong number");
       }
       else
       {
	   System.out.println(t + "is not a strong number");
       
       }
   }
}


