package generics;

import java.util.ArrayList;

public class Generics {
	
	public static void main(String args[])
	{
	       ArrayList a1=new ArrayList();
	       a1.add(10);
	       a1.add(13.5);
	       a1.add('p');
	       a1.add("Bhanu");
	       System.out.println(a1);
	     /*  for(Object obj : a1)
	       {
	    	   String s=(String) obj;
	       
	       } */
	    ArrayList<String> a2=new ArrayList();
	    a2.add("bhanu");
	    a2.add("bharathi");
	    a2.add("kavya");
	    a2.add("tulasi");
	    System.out.println(a2);
	}

}
