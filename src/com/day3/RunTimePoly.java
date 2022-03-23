package com.day3;

class Animal2
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	
}
class Dog2 extends Animal2{
	@Override
     public void eat()
     {
    	 System.out.println("Dog is Eating");
     }
}
class Cat2 extends Animal2{
	@Override
     public void eat()
     {
    	 System.out.println("Cat is Eating");
     }
}
public class RunTimePoly {
public static void main(String[] args) {
	Animal2 animal;
	animal = new Dog2();
	 animal.eat();
	 
	animal = new Cat2();
	animal.eat();
	
	System.out.println(animal instanceof Animal2);
	
}
	
	
	

}
