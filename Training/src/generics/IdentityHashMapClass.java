package generics;

import java.util.*;
public class IdentityHashMapClass {
	public static void main(String args[])
	{
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Integer i3=new Integer(20);
		IdentityHashMap<Integer,String> ihm=new IdentityHashMap<>();
		ihm.put(i1,"Bhanu");
		ihm.put(i2,"padma");
		ihm.put(i3,"priya");
		System.out.println(ihm);
	}

}
