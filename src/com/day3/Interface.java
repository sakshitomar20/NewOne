package com.day3;
interface foo1{
	int a =18;
	void method1();
}

interface foo2 extends foo1{
	int b = 8;
	void method2();
}

public class Interface implements foo2 {

	public static void main(String[] args) {
		System.out.println(foo2.a);
	}

	@Override
	public void method1() {
		System.out.println("method1 of foo1");
		
	}

	@Override
	public void method2() {
		System.out.println("method2 of foo2");
		
	}
	
}
