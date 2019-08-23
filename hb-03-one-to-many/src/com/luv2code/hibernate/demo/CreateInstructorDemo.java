package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo 
{

	public static void main(String[] args) 
	{
		//Create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		//Create session
		Session session = factory.getCurrentSession();
		
		try 
		{
			//create the student object
			System.out.println("\nCreating a new student object...");
			Instructor tempInstructor = 
					new Instructor("Susan", "Public", "susan.public@luv2code.com");
			
			InstructorDetail tempInstructorDetail = 
					new InstructorDetail("http://www.youtube.com", "Video Games");
			
			// associate the objects 
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//start a transaction
			session.beginTransaction();
			
			//save the Instructor object
			//
			//Note: this will also save the details object 
			//because of CascadeType.ALL
			//
			System.out.println("\nSaving Instructor: " + tempInstructor);
			session.save(tempInstructor);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("\nDone!");
			
		}
		finally
		{
			//add clean up code
			session.close();
			
			factory.close();
		}
	}

}
