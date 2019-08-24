package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class DeletePacmanCourseDemo 
{

	public static void main(String[] args) 
	{
		//Create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//Create session
		Session session = factory.getCurrentSession();
		
		try 
		{
			
			//start a transaction
			session.beginTransaction();
			
			//get pacman from student database
			int theId = 10;
			Course pacman = session.get(Course.class, theId);
			
			System.out.println("\nLoaded course: " + pacman);
			System.out.println("students: " + pacman.getStudents());
			
			//delete the course
			System.out.println("Deleting course ...");
			session.delete(pacman);
			
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
