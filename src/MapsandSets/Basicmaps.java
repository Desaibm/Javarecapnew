package MapsandSets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basicmaps {
	
	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(new Integer(1), "Mahesh Babu");
		hm.put(new Integer(2), "Sushma");
		hm.put(new Integer(3), "Aadhya");
		hm.put(new Integer(4), "Amogh");
		
		
		Set< Map.Entry<Integer,String> >st=hm.entrySet();
		for(Map.Entry<Integer, String> me:st)
		{
			System.out.println(me.getKey()+ ":" +me.getValue());
			
		}
	}

}
