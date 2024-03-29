package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteCourseDemo 
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
			
			//start a transaction
			session.beginTransaction();
			
			// get a course
			int theId = 10;
			Course course = session.get(Course.class, theId);
			
			System.out.println("Deleting course: " + course);
			
			session.delete(course);
			
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
