package com.wipro.programmingbasics;

public class L11 {
	  public static void main(String args[])
	    {
	        int[] a=new int[100];
	        int k=0;
	        for(int i=23;i<=57;i++)
	        {
		if(i%2==0)
	                 { 
		    a[k]=i;
		    k++;
		}
	         }
	         for(int i=0;i<k;i++)
	         {
		System.out.println(a[i]);
	         }
	     }

}
