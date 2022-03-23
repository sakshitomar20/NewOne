package com.day3;

class Employee{
	int id ;
	String name;
	public void set(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void  get()
	{
		System.out.println(this.name+" has Id "+this.id);
	}
}
public class Manager extends Employee{
 public static void main(String[] args) {
	Manager m = new Manager();
	m.set(101,"Rohan");
	m.get();
 }	
}

