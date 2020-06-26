package com.wipro.programmingbasics;
import java.util.Scanner;

public class A9 {
	  public static void main(String args[])
	   {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] a=new int[n];
	        int[] b=new int[n];
	        int k=0;
	        for(int i=0;i<n;i++)
	        {
	              a[i]=sc.nextInt();
	         }
	         for(int i=0;i<n;i++)
	        {
	              if(a[i]!=10)
	              {
		   b[k]=a[i];
		   k++;
	               }
	         }
	         for(int i=0;i<n;i++)
	        {
	              if(i>=k)
	              {
		  b[k]=0;
		  k++;
	               }
	         }
	         for(int i=0;i<k;i++)
	        {
	              System.out.print(b[i]+" ");
	         }
	         
	    
	        sc.close();
	   } 
}
