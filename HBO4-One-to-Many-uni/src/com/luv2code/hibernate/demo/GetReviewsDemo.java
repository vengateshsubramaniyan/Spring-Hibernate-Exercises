package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class GetReviewsDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure()
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Course course = session.get(Course.class, 4);
			System.out.println("--------------------------------");
			System.out.println(course);
			System.out.println("--------------------------------");
			System.out.println(course.getReviews());
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}
		
	}

}
