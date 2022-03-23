package com.day3;

class A{
	String name;
	public A(String name){
		this.name = name;
	}
	public void show()
	{
		System.out.println(this.name);
	}
}
class B extends A{
	String city;
	public B(String city,String name)
	{
		super(name);
		this.city = city;
	}
	public void get()
	{
		System.out.println(this.city);
	}
}
class C extends A{
	String city;
	public C(String city,String name)
	{
		super(name);
		this.city = city;
	}
	public void get()
	{
		System.out.println(this.city);
	}
}

public class Hirerachical {

	public static void main(String[] args) {
		C c = new C("Indore","Rohit");
		B b = new B("Pune","Mohit");
		c.show();
		c.get();
	}

}
