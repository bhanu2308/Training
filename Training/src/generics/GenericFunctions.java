package generics;

public class GenericFunctions {
	static <T> void display(T e)
	{
		System.out.println(e);
	}
	static <A> void print(A[] a)
	{
		for(A e1 : a)
		System.out.println(e1);
	}
	public static void main(String args[])
	{
		display(23);
		display("VSM College");
		Integer iarray[]= {10,20,30,40};
		String sarray[]= {"Apple","Bannana","Orange","Mango"};
		print(iarray);
		print(sarray);
		
		
	}

}



