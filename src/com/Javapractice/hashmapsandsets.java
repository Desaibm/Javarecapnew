package com.Javapractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class hashmapsandsets {
	
	
	
	
	  public static void main(String[] args){
		 Map<Integer, String> map = new HashMap<Integer, String>();           
		   map.put(1,"Java");  
		   map.put(2, "Python");  
		   map.put(3, "PHP");  
		   map.put(4, "SQL");
		   map.put(5, "C++");
		   System.out.println("Tutorial in Guru99: "+ map);    
		   // Remove value of key 5  
		 
		   Set<Entry<Integer, String>> st= map.entrySet();
		   
		   for(Entry<Integer, String> me:st)
		   { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       } 

		   
		   
		   
		   System.out.println("Tutorial in Guru99 After Remove: "+ map);
	  }
	}


