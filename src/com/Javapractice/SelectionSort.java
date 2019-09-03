package com.Javapractice;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] a= {2,14,1,56,25,48,33,27,49,58,96,66,71,79,86,89,94,17};
		int i,j,k,pos,temp;
		for(i=0;i<=18;i++) {
			pos=smallest(a,18,i);
			temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
			System.out.println("\n printing sorted e22lements...\n");
					for(i=0;i<10;i++)
					{
					System.out.println(a[i]);
					}

		}
		
		
		}


public static int smallest(int arr[],int n,int p) {
	
	int small,pos,j;
	small=arr[p];
	pos=p;
	for(j=p+1;p<=18;p++) {
		if(arr[j]<small) {
			small=arr[j];
			pos=j;
			}
	}
	
	
	
	
	
	return pos;
	
	
	
}

}


