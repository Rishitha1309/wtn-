package com.wipro.programmingbasics;

public class L15 {
	  public static void main(String args[])
	  {
	  int x=Integer.parseInt(args[0]);

	  int count=0,temp=x;
	  for(count=0;x>0;x/=10)
	  {
	  count=count+x%10;
	  }
	  System.out.println("Sum of digits of "+temp+" is:"+count);
	  }
	  
}
