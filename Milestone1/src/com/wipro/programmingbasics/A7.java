package com.wipro.programmingbasics;
import java.util.Scanner;
import java.util.Arrays;

public class A7 {
	 public static void main(String args[])
	   {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] a=new int[n];
	        int[] b=new int[n];
	        int i,j,k=0;
	        for(i=0;i<n;i++)
	        {
	              a[i]=sc.nextInt();
	         }
	         Arrays.sort(a);
	         for(i=0;i<n-1;i++)
	         {
		if(a[i]!=a[i+1])
		{
		      b[k]=a[i];
		      k++;
	                  } 
	           } 
	           b[k++]=a[n-1];
	          for(i=0;i<k;i++)
	          {
		System.out.print(b[i]+" ");
	           }
       sc.close();
	    }

}