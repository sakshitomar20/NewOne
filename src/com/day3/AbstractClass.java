package com.day3;

abstract class MyAbstract{
	 public MyAbstract()
	{
		System.out.println("Constructor of parent class");
	}
	abstract public void show();
	
	public void display()
	{
		System.out.println("Display of MyAbstract");
	}
}

class Myabs2 extends MyAbstract{

	@Override
	public void show() {
		System.out.println("show method of child");
   }
	
}

public class AbstractClass {
 public static void main(String[] args) {
	 Myabs2 m = new Myabs2();
		m.show();
		MyAbstract myAbstract = new MyAbstract()
		{
			@Override
			public void show() {
				System.out.println("show method of Parent");
		   }
		};
		
		myAbstract.show();
 }
	

}
