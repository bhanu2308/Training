package generics;

import java.util.HashMap;

public class HashMapWithoutGenerics {
	public static void main(String args[])
	{
		HashMap<String,String> hm=new HashMap<>();
		hm.put("a","Bhanu");
		hm.put("b","Bharathi");
		hm.put("a","kavya");
		hm.put("c","Tulasi");
		hm.put("d","Rupika");
		hm.put("null","Bhanu");
		System.out.println(hm);
	}
			
	}


