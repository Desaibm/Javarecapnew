package com.Stringswork;

import java.util.LinkedList;

public class SplitStrings {
	
	public static void main(String[] args) {
		
		String s = "My Family is Important to me";
		System.out.println("Splitting the sting into a Round Spaces");
		String arr1[] = s.split("\\s+", 2);
		for(String i:arr1)
			System.out.println(i);
		
		
		//String Join
		
		System.out.println("The Join String is");
		System.out.println(String.join(", ",  "My" , "Famliy", "Loves" , "me"));
		
		System.out.println("Examples of String Join:");
		LinkedList<String> l1=new LinkedList();
		l1.add("i");
		l1.add("Love");
		l1.add("Sushma");
		l1.add("Aadhya");
		l1.add("Amogh");
		l1.add("& Parents");
		System.out.println((String.join(" ",  l1)));
		
		//Replaceand Replace All
		
		String sz3="Family that stays Together and Eats Together";
		String sz4=sz3.replaceAll("Family", "Together");
		System.out.println("Replace All Family with Together:"+sz4 );
		System.out.println("Replace with Alphabetic Upper Case With Z");
		System.out.println(sz3.replaceAll("[A-Z]+", "Z"));
		System.out.println(sz3.replaceFirst("Together","Rowdies"));
		
		
	}

}
