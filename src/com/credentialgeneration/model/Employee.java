package com.credentialgeneration.model;

public class Employee {
	
	//attributes of an employee
	private String firstName;
	private String lastName;
	private String department;
 
	public Employee() {}
	
	public Employee(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
	//setters and getters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
