package inheritance;

import java.util.Scanner;

class DecimalToBinary
{
   public static void main(String args[])  
  {
     int i=0,num;
     Scanner sc=new Scanner(System.in);
     int binary[]=new int[20];
     System.out.println("enter a binary number:");
      num=sc.nextInt();
     while(num!=0)
     {
       binary[i++]=num%2;
       num=num/2;
     }
     for(int j=i-1;j>=0;j--)
     {
         System.out.println(binary[j]);
     }
  }
}