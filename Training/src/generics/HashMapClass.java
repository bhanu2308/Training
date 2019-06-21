package generics;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Bhanu");
		hm.put(3,"Bharathi");
		hm.put(2,"kavya");
		hm.put(1,"Tulasi");
		hm.put(4,"Rupika");
		hm.put(null,"Bhanu");
		Set<Integer> keys=hm.keySet();
				for(Integer key : keys)
				{
					
				     System.out.println("The keys are:"+key);
				}
	
		Set<Entry<Integer,String>> value=hm.entrySet();
		for(Entry<Integer,String> entry:value)
		{
			Integer key=entry.getKey();
			String val=entry.getValue();
			System.out.println("|The Entry of " + key + "--" + val);
		}
		
	}

}
