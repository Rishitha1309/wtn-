package com.wipro.polymorphism;

public class Poly1 {
	public static void main(String[] args)
	{
		Apple a=new Apple("apple","sweet",35);
		Orange o=new Orange("orange","sour",10);
		a.eat();
		o.eat();
	}
}
