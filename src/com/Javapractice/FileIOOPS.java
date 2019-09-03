package com.Javapractice;
import java.io.FileOutputStream;

public class FileIOOPS {
	
	public static void main(String args[]){
		try{
		FileOutputStream fout=new FileOutputStream("g:\\testout.txt"); fout.write(65);
		fout.close(); System.out.println("success...");
		}catch(Exception e){System.out.println(e);}
		
	



		for(int i=0;i<args.length;i++) 
		System.out.println(args[i]);

}

}
