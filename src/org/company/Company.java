package org.company;

public class Company extends Client{

	
	public void CompanyName() {
		System.out.println("TCS");
		System.out.println("WIPRO");

	}
	public static void main(String[] args) {
		
		Company c= new Company();
		c.clientName();
		c.CompanyName();
	}

}
