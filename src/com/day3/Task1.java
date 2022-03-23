package com.day3;

class Bank{
	public float rateOfIntrest()
	{
		return 0.0f;
	}
}
class SBI extends Bank{
	@Override
	public float rateOfIntrest()
	{
		return 6.5f;
	}
}
class ICICI extends Bank{
	@Override
	public float rateOfIntrest()
	{
		return 5.5f;
	}
}

class BOI extends Bank{
	@Override
	public float rateOfIntrest()
	{
		return 7.0f;
	}
}
public class Task1 {

	public static void main(String[] args) {
		Bank bank ;
		bank = new SBI();
		System.out.println(bank.rateOfIntrest());
		
		bank = new ICICI();
		System.out.println(bank.rateOfIntrest());
		
		bank = new BOI();
		System.out.println(bank.rateOfIntrest());
	}

}
