package com.Javapractice;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 10, 12, 18, 25, 34, 41, 52, 68, 73, 84, 99 };
		int item, location = -1;
		System.out.println("Enter the item which you want to search");
		Scanner sc = new Scanner(System.in);
		item = sc.nextInt();
		location = binarySearch(arr, 0, 9, item);
		if (location != -1)
			System.out.println("the location of the item is " + location);
		else
			System.out.println("Item not found");
	}
	
	public static int binarySearch(int[] a,int beg, int end, int item) {
		int mid;
			if(end>=beg) {
				mid=(end+beg)/2;
				 if (a[mid]==item) {
					 return mid+1;
				 }
				 else if(a[mid]<item){
					 return binarySearch(a,mid+1,end,item);
				 }
				 else
				 {
					 return binarySearch(a,beg,mid-1,item);
				 }
				
		
		
			}
		
		return -1;
		
	}

}
