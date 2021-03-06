package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // java class that relates to a database table
@Table(name="student") // map class to table name in database
public class Student 
{
	// == Private fields - connects to Student table == 
	
	// Primary key identifies each row in a table. 
	//It must be a unique value. It cannot contain NULL values.
	@Id //states that this variable is the primary key in the database table
	@GeneratedValue(strategy=GenerationType.IDENTITY) // assigns primary key using database identity column
	@Column(name="id") //column name in database table
	private int id;
	
	@Column(name="first_name") //column name in database table
	private String firstName;
	
	@Column(name="last_name") //column name in database table
	private String lastName;
	
	@Column(name="email") //column name in database table
	private String email;
	
	// == Default Constructor ==
	public Student()
	{
		
	}
	
	// == Constructor to set fields == 
	public Student(String firstName, String lastName, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	// == Setters and Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// == toString() method == 
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
