package MapsandSets;

import java.util.HashMap;
import java.util.Map;

public class RemoveMap {
	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Initial list of elements: " + hm);
		hm.put(501, "Padmaja");
		hm.put(502, "Madhuri");
		hm.put(503, "Chandrika");
		hm.put(504, "Sarika");
		hm.put(505, "Sanjana");
		hm.put(506, "Harini");
		System.out.println("Initial list of elements: " + hm);
		// key-based removal
		hm.remove(501);
		System.out.println("Updated list of elements: " + hm);
		// value-based removal
		hm.remove(505);
		System.out.println("Updated list of elements: " + hm);
		// key-value pair based removal
		hm.remove(502, "Madhuri");
		System.out.println("Updated list of elements: " + hm);
	}

}
