package com.wipro.programmingbasics;

public class L13 {
	   public static void main(String args[])
	    {
	        int i,j;
	        String prime="";
	        for(i=10;i<=99;i++)
	        {
		int count=0;
		for(j=1;j<=i;j++)
	                 {
		                     if(i%j==0)
	                            count++;
	                  }
		 if(count==2)
		     prime=prime+i+" ";
	         }
	          System.out.println(prime);
	    }
}
