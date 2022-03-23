package com.day3;

@FunctionalInterface
interface new1{
	public void multiply(int a,int b,int c);
}

@FunctionalInterface
interface B1{
	public int multiplication(int a,int b);
}
public class lambdaExpression {
  public static void main(String[] args) {
	  new1  f = (int a,int b,int c) ->{
			System.out.println(a*b*c);
		};
		
	f.multiply(5, 5, 5);	
	
	B1 b1 =(a,b)->a*b;
	
	System.out.println(b1.multiplication(3, 3));
}
	
	

}
