package com.day3;

interface  bike{
	default  void speed(){
		System.out.println("running.."); 
   }
}
class Honda implements bike{
	public void stop()
	{
		System.out.println("stop.."); 
	}
}
public class interface2  {
public static void main(String[] args) {
	
}

}
