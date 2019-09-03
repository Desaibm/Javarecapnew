package MapsandSets;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class MapsComparing {

	
	//Verifying the details in Ascending Order
	
	public static void main(String[] args) {
		Map<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(101, "Chandra Sekar Rao");
		hm1.put(102, "Sailaja");
		hm1.put(103, "Subbaraman");
		hm1.put(104, "Lakshmi");
		hm1.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
	//Verifying the order in Descending Order
		Map<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.put(101, "Chandra Sekar Rao");
		hm2.put(102, "Sailaja");
		hm2.put(103, "Subbaraman");
		hm2.put(104, "Lakshmi");
		hm2.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		//Comparing By Value
		
		Map<Integer,String> hm3=new HashMap<Integer,String>();
		hm3.put(101, "Chandra Sekar Rao");
		hm3.put(102, "Sailaja");
		hm3.put(103, "Subbaraman");
		hm3.put(104, "Lakshmi");
		hm3.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
		//Descending order using Comparing By Value
		Map<Integer,String> hm4=new HashMap<Integer,String>();
		hm4.put(101, "Chandra Sekar Rao");
		hm4.put(102, "Sailaja");
		hm4.put(103, "Subbaraman");
		hm4.put(104, "Lakshmi");
		hm4.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
	}

}
