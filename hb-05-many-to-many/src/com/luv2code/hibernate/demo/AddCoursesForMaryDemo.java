package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class AddCoursesForMaryDemo 
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
			
			//get Mary from student database
			int theId = 2;
			Student Mary = session.get(Student.class, theId);
			
			System.out.println("\nLoaded student: " + Mary);
			System.out.println("Courses; " + Mary.getCourses());
			
			// create a course
			Course theCourse1 = new Course("Rubik's Cube - How to Speed Cube");
			Course theCourse2 = new Course("Atari 2600 - Game Development");
			
			//add mary to those courses
			theCourse1.addStudent(Mary);
			theCourse2.addStudent(Mary);
			
			//save the courses
			System.out.println("Saving the courses ...");
			session.save(theCourse1);
			session.save(theCourse2);
			System.out.println("Saved course 1: " + theCourse1);
			System.out.println("Saved course 2: " + theCourse2);
			
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
