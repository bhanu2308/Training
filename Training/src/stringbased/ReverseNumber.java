package stringbased;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[])
	{
		int num,rev;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		rev=reverse(num);
		System.out.println("Reverse of a number:"+rev);
	}

	private static int reverse(int n) {
		int a,res=0;
		while(n!=0)
		{
			
			a=n%10;
			res=(res*10)+a;
			n=n/10;
		}
		return res;
	}

}
