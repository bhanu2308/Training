package exceptions;

public class ArrayException {
	public static void main(String args[])
	{
		int arr[]= {10,20,30};
		try
		{
			for(int i=0;i<=5;i++)
			{
			System.out.println("the array elements are:"+arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}
