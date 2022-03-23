package com.day3;



class Animal{
	
     public void eat(){
		System.out.println("eating");
	}
}
class Dog extends Animal
{ 
	public void bark()
	{
		System.out.println(" barking...");
	}
}
class BabyDog extends Dog{
	public void sleep()
	{
		System.out.println(" sleeping...");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.eat();
		b.bark();
		b.sleep();
	}

}
