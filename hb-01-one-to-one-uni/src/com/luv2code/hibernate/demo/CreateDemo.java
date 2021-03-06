package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateDemo 
{

	public static void main(String[] args) 
	{
		//Create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		//Create session
		Session session = factory.getCurrentSession();
		
		try 
		{
			/*
			// create the objects
			
			System.out.println("\nCreating a new student object...");
			Instructor tempInstructor = 
					new Instructor("Karishma", "Kapur", "kapur@luv2code.com");
			
			InstructorDetail tempInstructorDetail = 
					new InstructorDetail("http://www.luv2code.com/youtube", "luv 2 code!!!");
			
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
			
			System.out.println("Done!");
			*/
			
			//create the student object
			System.out.println("\nCreating a new student object...");
			Instructor tempInstructor = 
					new Instructor("Madhu", "Patel", "madhu@luv2code.com");
			
			InstructorDetail tempInstructorDetail = 
					new InstructorDetail("http://www.youtube.com", "Guitar");
			
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
			factory.close();
		}
	}

}
