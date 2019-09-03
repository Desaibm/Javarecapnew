package com.Javapractice;

public class Conseq2 {
	
	    public static void main(String args[]){

	        int a[]={100,115,11,12,13,14,15,110,120};

	        int ms=0;                  // starting point of max subseq
	        int me=0;                   //ending point of max subseq
	        int cs=0,ce=0;              //starting and ending  point of current subseq
	        int max=0,c=0;           // length of max and current subseq
	        
	        for(int i=0;i<a.length-1;i++){
	        	
	        	

	           if(a[i]-a[i+1]==-1){
	        	   

	             if(c==0)             //we found the first element of a subseq
	             {
	               cs=i;ce=i+1;c=2;
	              //made the starting of currrent seq=i, end=i+1 and length=2
	              }
	             
	             else             // element is a part of subsequence but not first elem
	              {
	               ce=i+1;c++;  
	               // increased current ending point
	              } 

	              if(c>max)          // if lenth of current subseq is now largest then update staring and ending points of max
	               {
	                   max=c;
	                   ms=cs;
	                   me=ce;
	               }
	             }
	             else             // subseq ended
	             {
	             cs=0;
	             ce=0;
	             c=0;
	              }
	           
	          
	      }
	        System.out.println(cs);
	        System.out.println(me);
	        for(int i=ms;i<=me;i++)           //printing max subsequence
	         System.out.println(a[i]);
	    }
	    }


