package examples;


public class EvenOddPrime {
	
	public static void main(String[]args)
	{
	 int n=10,even=0,odd=0,flag=0;
	for(int i=1;i<=n;i++)
	{
	if(i%2==0)
	{
	System.out.println(i+"is even");
	even=i;
	}
	else
	{
	System.out.println(i+"is odd");
	odd=i;
	}
	System.out.println("The sum of even and odd is:"+(even+odd));
	int sum=even+odd;
	for(int j=2;j<=sum-1;j++)
	{
	if(sum%j==0)
	{
	flag++;
	}
	}
	if(flag==0)
	{
	System.out.println(sum+"is prime");
	}
	}
	}
	}


