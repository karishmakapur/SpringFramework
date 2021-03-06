package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class employeeMain 
{
	public static void main(String[] args) 
	{
		//Create session factory 
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Employee.class)
										.buildSessionFactory();
		//Create session
		Session session = factory.getCurrentSession();
		
		try {
			
		}
		finally
		{
/*
	//DEVELOP CODE TO SAVE OBJECTS
			//start a transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
				
			//create Employee objects
			Employee emp1 = new Employee("John", "Doe", "Apply Inc.");
			Employee emp2 = new Employee("Johnny", "Appleseed", "Microsoft");
			Employee emp3 = new Employee("Mary", "Pippins", "Northrop");
			Employee emp4 = new Employee("Larry", "Seinfield", "Nike");
			Employee emp5 = new Employee("Mike", "Lows", "Adidas");
			
			// save the employee objects
			System.out.println("Saving the Employees...");
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			session.save(emp4);
			session.save(emp5);
			
			//commit transaction
			session.getTransaction().commit();
	
	//DEVELOP CODE TO RETRIEVE AN OBJECT BY ITS PRIMARY KEY

			//start a transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Employee tempEmployee = new Employee("Stacey", "Rodolf", "Hollister");
			session.save(tempEmployee);
			
			//retrieve employee based on primary key = id
			System.out.println("\nGetting employee with id: " + tempEmployee.getId());
			
			Employee myEmployee = session.get(Employee.class,  tempEmployee.getId());
			
			System.out.println("Get complete: " + myEmployee);
			
			//commit transaction
			session.getTransaction().commit();
		
	//Develop code to query objects to find employees for a given company.
			
			//start a transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Find employee from Apply Inc.");
			List<Employee> theEmployees = session.createQuery("from Employee e where e.company= 'Apply Inc.'").getResultList();

			for(Employee emp : theEmployees)
			{
				System.out.println(emp);
			}
			
			//commit transaction
			session.getTransaction().commit();
			*/
		
	//Develop code to delete an object by primary key.
			
			//start a transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Deleting employee id=3");
			session.createQuery("delete from Employee where id = 3").executeUpdate();

			//commit transaction
			session.getTransaction().commit();
		}
			
	} 
}
