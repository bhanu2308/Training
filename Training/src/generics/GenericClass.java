package generics;


public class GenericClass<T> {
	T obj;
	GenericClass(T obj1) 
	{
		 obj=obj1;
	}
	public T print()
	{
		return obj;
		
	}
	public static void main(String args[])
	{
		GenericClass<Integer> obji=new GenericClass(10); 
		int t1=obji.print();
		System.out.println("The integer value is" + t1);
		GenericClass<String> objs=new GenericClass("I'm a CSE Student"); 
	     String t2=objs.print();
		System.out.println("The string is" + t2);
	}

}
