package com.Stringswork;
import com.asprise.ocr.Ocr;

public class StringBasics {

	public static void main(String[] args) {
		System.out.println("maheshBabu".length());
		System.out.println("maheshBabu".charAt(5));
		System.out.println("maheshBabu".substring(8));
		System.out.println("maheshBabu".substring(4,6));
		String st1="Mahesh";
		String st2="Desai";
		System.out.println(st1+st2);
		System.out.println(st1.concat(st2));
		String st3= "This is my World";
		String st4= "This is my World";
		String st5= "This ";
		String st6= "my World";
		int result=st3.indexOf("my");
		System.out.println(result);
		int result2=st3.indexOf("is",2);
		System.out.println(result2);
		int result3=st3.lastIndexOf("W");
		System.out.println(result3);
		Boolean b1 ="This".equalsIgnoreCase("This");
		System.out.println(b1);
		Boolean b2="World".equals("world");
		System.out.println(b2);
		int o1=st3.compareTo(st6);
		System.out.println(o1);
		System.out.println(st3.toLowerCase());
		System.out.println(st4.toUpperCase());
		System.out.println(st5.trim());
		System.out.println(st3.replace('i', 'z'));
	}
	
}
