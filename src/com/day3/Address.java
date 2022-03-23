package com.day3;

public class Address {
   
	String city;
	String state;
	String country;
	
	 Address(String city,String state,String country) {
	
		 this.city = city;
		 this.state = state;
		 this.country = country;
    }
	@Override
	public String toString()
	{
		return  String.format("Address[city : %s ,state : %s ,counrty : %s]",city,state,country);
	}

}
