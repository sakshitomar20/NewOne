package com.day3;

class A1{
	public void add(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	public void add(int a, float b)
	{
		System.out.println("Addition is : "+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition is : "+(a+b+c));
	}
}

public class CTimePolymorphism {
public static void main(String[] args) {
	A1 a = new A1();
	a.add(3, 7);
	a.add(4, 9, 11);
}
 
  
 
}
