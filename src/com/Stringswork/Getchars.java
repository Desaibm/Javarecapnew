package com.Stringswork;

import java.util.Locale;

public class Getchars {
	
	public static void main(String[] args) {
		String s="MyFamilyisGreat";
		char[] arr;
		arr=s.toCharArray();
		System.out.println("String to Char Arry\n");
		for(char i:arr) 
			System.out.println(i +" ");
		s.getChars(5,8,arr,0);
		System.out.println("\nSubstring to ExistingChars" +"char array");	
		for(char i:arr)
			System.out.println(i + " ");
		
		print_Chars('(', 'z', 29);
		
		String sz1 = "Babu"; 
        System.out.println("Hashcode of String s is "
                           + sz1.hashCode()); 
  
        // intern() 
        String s_1 = "geeks"; 
        String s_2 = new String("geeks"); 
        String s_3 = s_2.intern(); 
  
        // returns true 
        System.out.println(s_1 == s_2); 
  
        // returns false 
        System.out.println(s_1 == s_3); 
        
        
        String st4 ="GreekWorldisNotolderthanIndianCulture";
        String st5=String.format("%s : %d ", st4,12);
        System.out.println(st5);
        String st6=String.format("%s = %f", "Value of PI: ", Math.PI);
        System.out.println(st6);
        String st7=String.format(Locale.getDefault(), "%s: %d", st4,10);
        System.out.println(st7);
        String st8= "";
        System.out.println("is String Empty: " +st4.isEmpty());
        System.out.println("is String Empty:" +st8.isEmpty());
        
        
        
        
        
        
        
    }
 public static void print_Chars(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
            System.out.print(char1 + " ");
            if (ctr % n == 0) System.out.println("");
        }
		System.out.print("\n");
		}
	}


