package MapsandSets;

import java.util.HashMap;
import java.util.Map;

public class AddElementsusingMaps {
	
	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println("Initial list of elements: "+hm);
		hm.put(501, "Padmaja");
		hm.put(502, "Madhuri");
		hm.put(503, "Chandrika");
		hm.put(504, "Sarika");
		hm.put(505, "Sanjana");
		hm.put(506, "Harini");
		System.out.println("After invoking put() method ");  
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " : " +m.getValue());
			}
		hm.putIfAbsent(507, "Bobby");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  	
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(508,"Mukesh Siddhartha");  
	      map.putAll(hm);  
	      System.out.println("After invoking putAll() method ");  
	      for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  

				
	}

}
