package com.Javapractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Stringcheck {
	public static void main(String[] args) {
		
	
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
		
		//Count the words in a string
		 System.out.println("Enter the string");
		 
	        Scanner sc = new Scanner(System.in);
	 
	        String s=sc.nextLine();
	 
	        String[] words = s.trim().split(" ");
	 
	        System.out.println("Number of words in the string = "+words.length);
	        
	       // another way of counting words in a string\
	        
	        System.out.println("Enter the string");
	        
	        Scanner sce = new Scanner(System.in);
	 
	        String se=sce.nextLine();
	 
	        int count = 1;
	 
	        for (int i = 0; i < se.length()-1; i++)
	        {
	            if((se.charAt(i) == ' ') && (se.charAt(i+1) != ' '))
	            {
	                count++;
	            }
	        }
	 
	        System.out.println("Number of words in a string = "+count);
	        
	        //Line count in a string
	        
	        String str = "line1\nline2\nline3\rline4";
	        System.out.println(str);
	        int count1 = getLineCount(str);
	        System.out.println("line count: "+count1);

	        

	    }
	
	public static int getLineCount(String text){
        
        return text.split("[\n|\r]").length;
    }

	   
 }



