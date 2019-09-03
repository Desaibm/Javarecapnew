package com.Javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringReverse {

	public static void main(String[] args) {

		// Map to store the elements
		Map<String, String> treemap = new TreeMap<String, String>(Collections.reverseOrder());

		// Put elements to the map
		treemap.put("1", "Welcome");
		treemap.put("2", "to");
		treemap.put("3", "the");
		treemap.put("4", "Geeks");
		treemap.put("5", "Community");

		Set set = treemap.entrySet();
		Iterator i = set.iterator();

		// Traverse map and print elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			
		}

		StringBuffer sbf = new StringBuffer("Geeksforgeeks!");
		System.out.println("String buffer = " + sbf);

		// Here it reverses the string buffer
		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);

		String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday" };

		/*
		 * There are basically two methods, one is to use temporary array and manually
		 * loop through the elements of an Array and swap them or to use Arrays and
		 * Collections classes.
		 * 
		 * This example uses the second approach i.e. without temp variable.
		 * 
		 */

		// first create a list from String array
		List<String> list = Arrays.asList(strDays);

		// next, reverse the list using Collections.reverse method
		Collections.reverse(list);

		// next, convert the list back to String array
		strDays = (String[]) list.toArray();

		System.out.println("String array reversed");

		// print the reversed String array
		for (int k = 0; k < strDays.length; k++) {
			System.out.println(strDays[k]);
		}
		String array[] = { "test1", "test2", "test3" };
		String arrayTemp[]=new String[array.length];
		for (int u = arrayTemp.length-1; u >= 0; u--) {
		for (int r = u; r <=u; r++) {
		arrayTemp[r]=array[u];
		System.out.println(arrayTemp[r]);
		}
		}
		
		String input = "selenium";
		  char[] try1 = input.toCharArray();
		  for (int o = try1.length-1;o>=0;o--) { System.out.print(try1[o]);
	   }
		  
		  
		  
		  
		  
		  String str = "jan-feb-march";
		  System.out.println(str.toUpperCase());
		  String[] temp;
		  String delimeter = "-";
		  temp = str.split(delimeter);
		  
		  for(int k = 0; k < temp.length; k++) {
			 System.out.println(temp[k]);
			 System.out.println("");
			 str = "jan.feb.march";
			 delimeter = "\\.";
			 temp = str.split(delimeter);
		  }
		  for(int l =0; l < temp.length; l++) {
			 System.out.println(temp[l]);
			 System.out.println("");
			 temp = str.split(delimeter,2);
			 
			 for(int j = 0; j < temp.length; j++){
				System.out.println(temp[j]);
			 }
		  }
		  
		  countTo_N_Improved();
	   }
	   private final static int MAX_LENGTH = 30;
	   private static String buffer = "";
	   
	   private static void emit(String nextChunk) {
		  if(buffer.length() + nextChunk.length() > MAX_LENGTH) {
			 System.out.println(buffer);
			 buffer = "";  
		  }
		  buffer += nextChunk;
	   }
	   private static final int N = 1000;
	   private static void countTo_N_Improved() {
		  for (int count = 2; count<= N; count = count+50) {
			 emit(" " + count);
		  }
		  
		  char [] abc = {'A', 'B', 'C','D'}; //Array of characters
			int [] xyz = {10, 20, 30, 40}; //Array of integers
			String [] a = {"Selenium", "UFT", "LoadRunner"}; //Array of strings
			boolean [] b = {true, false, false, true}; //Array of boolean 
		
			System.out.println(abc[1]);
			System.out.println(xyz[2]);
			System.out.println(a[1]);
			System.out.println(b[1]);
			int [] array1 = {1, 2, 3, 4, 5}; //Array of integers
			int []array2 = array1;
			for (int print : array2) {
			System.out.println(print);
			}
			
			//create an array of type Object, in this case we will create String array
			String[] strArray = new String[]{"Object","Array","Converted","To","List"};
		   
			/*
			  To create List from an array of type Object use,
			  static List asList(Object[] objArray) method of Arrays class.
			 
			  This method returns a fixed sized list backed by original array.
			*/
		   
			List list = Arrays.asList(strArray);
		   
			//get an iterator
			Iterator itr = list.iterator();
		   
			//iterate through list created from Array
			System.out.println("List created from an Array of type Object contains,");
			while(itr.hasNext())
			  System.out.println(itr.next());
			
			 ArrayList<String> al=new ArrayList<String>();  
			  al.add("Ravi");  
			  al.add("Vijay");  
			  al.add("Ravi");  
			  al.add("Ajay");  
			  for(String obj:al)  
				System.out.println(obj);  
			
	}
}
