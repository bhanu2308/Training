package interfacesAbstracts;

interface  AdvancedArithmetic{
	int divisor_sum(int n);
	
}
 class MyCaluclator implements AdvancedArithmetic
{
	public int divisor_sum(int n)
	{
		 int sum = 0; 
	 
	        for (int i = 1; i <= n; i++) 
	        { 
	            if (n% i == 0) 
	            { 
	               sum+=i;
	               System.out.print(i+",");
	            } 
	        } 
	       
	        return  sum;
	}
}
class InterfaceClass
{
   public static void main(String args[])
   {
	   MyCaluclator calc=new MyCaluclator();
	   int temp=calc.divisor_sum(16);
	   System.out.println("The sum of divisors is" +temp);
	   
   }
}