package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo 
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
			
		//START A TRANSACTION
			session.beginTransaction();
			
			// Get the instructor detail object
			int theId = 2999;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			
			
			// Print the instructor detail
			System.out.println("tempInstructorDetail: " + tempInstructorDetail);
			
			// Print the associated instructor
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
			
		//COMMIT TRANSACTION
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		finally
		{
			//handle connection leak issue
			session.close();
			factory.close();
		}
	}

}
