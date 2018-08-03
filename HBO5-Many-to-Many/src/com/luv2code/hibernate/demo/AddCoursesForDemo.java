package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class AddCoursesForDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure()
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Student student = session.get(Student.class, 7);
			Course course = new Course("task4");
			Course course2 = new Course("task5");
			Course course3 = new Course("task6");
			course.addStudent(student);
			course2.addStudent(student);
			course3.addStudent(student);
			session.save(course3);
			session.save(course2);
			session.save(course);
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}
		
	}

}
