package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndStudentsDemo 
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
			
			// create a course
			Course theCourse = new Course("Pacman - How to Score One Million Points");
			
			//save the course
			System.out.println("Saving the course ...");
			session.save(theCourse);
			System.out.println("Saved the course " + theCourse);
			//create the students
			Student theStudent1 = new Student("John", "Doe", "john@luv2code.com");
			Student theStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
			
			//add students to course
			theCourse.addStudent(theStudent1);
			theCourse.addStudent(theStudent2);
			
			//save a student
			System.out.println("Saving students ...");
			session.save(theStudent1);
			session.save(theStudent2);
			System.out.println("Saved students: " + theCourse.getStudents());
			
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
