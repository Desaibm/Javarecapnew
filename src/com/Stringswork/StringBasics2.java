package com.Stringswork;

public class StringBasics2 {
	
	public static void main(String[] args) {
		
		String s= "Love my Family";
		
		System.out.println(" Character (unicode point) at index 1:" +s.codePointAt(1));
		System.out.println(s.codePointAt(8));
		System.out.println(" Character (unicode point) at before index 1:" +s.codePointBefore(1));
		System.out.println(s.codePointBefore(9));
		s="World is not Enough";
		System.out.println("Character Code Point Count: " +s.codePointCount(0,9));
		
		String s1="MyFamilyisImportanttome";
		String s2="MyFamilyisimportanttomee";
		CharSequence cs=s1.subSequence(5, 9);
		CharSequence cs1=s1.subSequence(0, 5);
		System.out.println("\"Reult of contains on s_1 with charSequence cs " +s1.contains(cs));
		System.out.println("\"Reult of contains on s_1 with charSequence cs1 " +s1.contains(cs1));
		System.out.print("Result of contentEqual "); 
        System.out.println("Family".contentEquals(cs1)); 
  
        System.out.print("Result of contentEqual "); 
        System.out.println("MyFamily".contentEquals(cs1)); 
        
        String st1 = "geeksforgeeks"; 
        
        // endsWith 
        String ends_1 = "geeks"; 
        String ends_2 = "eks"; 
        String ends_3 = "for"; 
  
        System.out.println(st1 + "end with " + ends_1 + " " + s.endsWith(ends_1)); 
        System.out.println(st1 + "end with " + ends_2 + " " + s.endsWith(ends_2)); 
        System.out.println(st1 + "end with " + ends_3 + " " + s.endsWith(ends_3)); 
  
        // startWith 
        String start_1 = "geeks"; 
        String start_2 = "for"; 
  
        System.out.println(st1 + " starts with " + start_1 
                           + "  " + st1.startsWith(start_1)); 
        System.out.println(st1 + " starts with " + start_2 
                           + "  " + st1.startsWith(start_2));
	}

}
