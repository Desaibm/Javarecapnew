package com.Javapractice;

public class Bubblesort {

	public static void main(String[] args) {
		int[] a = { 10, 2, 58, 123, 458, 632, 1, 5, 74, 963, 258, 654 };
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("Printing Sorted List ...");
		for(int i=0;i<12;i++)
		{
		System.out.println(a[i]);
		}

	}

}
