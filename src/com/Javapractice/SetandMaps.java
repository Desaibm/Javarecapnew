package com.Javapractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetandMaps {
	
	 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  
		  LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  
			//Creating Books  
			Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
			Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
			Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
			//Adding Books to hash table  
			hs.add(b1);  
			hs.add(b2);  
			hs.add(b3);  
			//Traversing hash table  
			for(Book b:hs){  
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
			}  
		  
		  
		  
		 } 
	 
	 

}
