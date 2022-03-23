package com.day3;


public class Emp{
	
		String name;
		String designation;
		Address address;

		 Emp(String name,String designation,Address address) {
			this.name = name;
			this.designation=designation;
			this.address=address;
		}
		public void show()
		{
			System.out.println(this.address);
			System.out.println(this.name +" "+this.designation);
		}
		public static void main(String[] args) {
			Address address = new Address("Indore", "Madhya Pradesh", "India");
			Emp employee = new Emp("niraj", "Employee", address);
			employee.show();
		}

		
	}
