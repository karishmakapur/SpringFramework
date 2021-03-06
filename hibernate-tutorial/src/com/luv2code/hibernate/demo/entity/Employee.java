package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	// == Private Fields
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="company")
	private String company;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	// == Default constructor
	public Employee()
	{
		
	}

	// == Constructor to set fields ==
	public Employee(String firstName, String lastname, String company) 
	{
		this.firstName = firstName;
		this.lastname = lastname;
		this.company = company;
	}

	// == Setters and Getters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// == toString() method
	@Override
	public String toString() 
	{
		return "Employee [firstName=" + firstName + ", lastname=" + lastname + ", company=" + company + "]";
	}
	
	

}
