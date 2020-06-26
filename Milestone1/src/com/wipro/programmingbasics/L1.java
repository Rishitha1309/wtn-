package com.wipro.programmingbasics;

public class L1 {
	public static void main(String args[])
	{
	int x=Integer.parseInt(args[0]);
	if(x==0)
		System.out.println(x+" is neither negative or positive");
	else if(x>0)
		System.out.println(x+" is a positive number");
	else
		System.out.println(x+" is a negative number");
	}
	

}
